package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bai1")
public class Convert {
    @PostMapping("")
    public String convert(@RequestParam double tien, Model model){
        model.addAttribute("result", tien * 23000);
        return "result";
    }

    @GetMapping("")
    public String showForm(){
        return "greeting";
    }
}
