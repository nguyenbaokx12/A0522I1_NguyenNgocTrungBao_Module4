package com.example.finalexam.controller;


import com.example.finalexam.model.Promotion;
import com.example.finalexam.model.SubPromotion;
import com.example.finalexam.service.IPromotionService;
import com.example.finalexam.service.ISubPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class PromotionController {
    @Autowired
    private IPromotionService iPromotionService;

    @Autowired
    private ISubPromotionService iSubPromotionService;

    @GetMapping("/list")
    private String showList(Model model){
        model.addAttribute("subpromotionlist", iSubPromotionService.findAll());
        model.addAttribute("promotionlist", iPromotionService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public  String showCreateForm(Model model){
        List<SubPromotion> promotionList = iSubPromotionService.findAll();
        model.addAttribute("subpromotionlist", promotionList);
        model.addAttribute("promotionlist", new Promotion());
        return "create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("promotionlist") Promotion promotion, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()) {
            model.addAttribute("mess", "Add new failse.");
            model.addAttribute("subpromotionlist", iSubPromotionService.findAll());
            return "create";
        }else if (!promotion.isValidEndDate()) {
            bindingResult.reject("error.end", "Ngày kết thúc phải lớn hơn ngày bắt đầu ít nhất 1 ngày");
        }
        iPromotionService.create(promotion);
        model.addAttribute("mess", "Add new success.");
        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id")Integer id, Model  model ){
        iPromotionService.delete(id);
        model.addAttribute("promotionlist", iPromotionService.findAll());
        return "list";
    }

}
