package com.example.validateregistrationform.controller;


import com.example.validateregistrationform.dto.UserDto;
import com.example.validateregistrationform.model.User;
import com.example.validateregistrationform.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/createShow")
    private String createShow(Model model){
        UserDto userDto = new UserDto();
        model.addAttribute("userDto", userDto);
        return "create" ;
    }

    @PostMapping("/create")
    private String create(@ModelAttribute @Validated UserDto userDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model, @PageableDefault(value = 10) Pageable pageable){
        new UserDto().validate(userDto,bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "create";
        }else{
            User user = new User();
            BeanUtils.copyProperties(userDto,user);
            userService.save(user);
            redirectAttributes.addFlashAttribute("message","them moi thanh cong");
            model.addAttribute("userList",userService.findAll(pageable));
            return "index";
        }
    }

}
