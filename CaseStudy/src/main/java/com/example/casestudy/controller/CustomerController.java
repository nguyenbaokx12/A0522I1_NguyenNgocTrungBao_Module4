package com.example.casestudy.controller;

import com.example.casestudy.dto.CustomerDTO;
import com.example.casestudy.model.Customer;
import com.example.casestudy.service.ICustomerService;
import com.example.casestudy.service.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import org.springframework.validation.annotation.Validated;


@Controller
@RequestMapping("furama")

public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private ICustomerTypeService iCustomerTypeService;


    @GetMapping("customer")
    public String getAllCustomer(Model model,
                                 @PageableDefault(value = 4) Pageable pageable,
                                 @RequestParam(defaultValue = "") String key_searchname,
                                 @RequestParam(defaultValue = "") String customerTypeId) {
        model.addAttribute("customerList", customerService.find(key_searchname, customerTypeId, pageable));
        model.addAttribute("customerTypeList", iCustomerTypeService.findAll());
        return "customer";
    }

    @GetMapping("addShow")
    public String showAdd(Model model) {
        model.addAttribute("customerDto", new CustomerDTO());
        model.addAttribute("customerTypeList", iCustomerTypeService.findAll());
        return "addCustomer";
    }

    @PostMapping("addCustomer")
    private String addCustomer(@Validated @ModelAttribute("customerDto") CustomerDTO customerDto,
                               BindingResult bindingResult,
                               RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customerTypeList", iCustomerTypeService.findAll());
            return "addCustomer";
        } else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customerService.addCustomer(customer);
            redirectAttributes.addFlashAttribute("message", " add complete");
            return "redirect:/furama/customer";
        }
    }

    @GetMapping("{id}/delete")
    public String getById(@PathVariable Long id,RedirectAttributes redirectAttributes) {
        customerService.remote(id);
        redirectAttributes.addFlashAttribute("message", "delete complete");
        return "redirect:/furama/customer";
    }

    @GetMapping("{id}/editShow")
    public String editShow(@PathVariable Long id, Model model, @ModelAttribute CustomerDTO customerDto) {
        model.addAttribute("customerDto", customerService.findId(id));
        model.addAttribute("customerTypeList", iCustomerTypeService.findAll());
        return "editCustomer";

    }
    @PostMapping("editCustomer")
    public String editCustomer(@Validated @ModelAttribute("customerDto") CustomerDTO customerDto,
                               BindingResult bindingResult,
                               RedirectAttributes redirectAttributes,
                               Model model){
        if(bindingResult.hasFieldErrors()){
            model.addAttribute("customerTypeList", iCustomerTypeService.findAll());
            return "editCustomer";
        }else{
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto,customer);
            customerService.edit(customer);
            redirectAttributes.addFlashAttribute("message","edit customer complete");
            return "redirect:/furama/customer";
        }
    }

}
