package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ex1")
public class Convert {
    @PostMapping("")
    public String convert(@RequestParam double money, Model model){
        model.addAttribute("result", money * 23000);
        return "result";
    }

    @GetMapping("")
    public String showForm(){
        return "greeting";
    }
}
