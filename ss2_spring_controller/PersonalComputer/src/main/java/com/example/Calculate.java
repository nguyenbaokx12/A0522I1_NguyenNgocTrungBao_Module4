package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculate {

    @GetMapping("/hello")
    public String showForm(){
        return "greeting";
    }

    @GetMapping("/calculate")
    public String calculate(Model model, @RequestParam String dau, @RequestParam double nb1, @RequestParam double nb2){
        double result = 0;
        switch (dau){
            case "+": result = nb1 + nb2;
            break;
            case "-": result = nb1 - nb2;
            break;
            case "*": result = nb1 * nb2;
            break;
            case "/": result = nb1 / nb2;
            break;
        }
        model.addAttribute("result", result);
        return "greeting";
    }
}
