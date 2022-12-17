package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedHashMap;
import java.util.Map;


@Controller
@RequestMapping("/calculator")
public class Search {
    @GetMapping()
    public String searchPage(){
        return "greeting";
    }

    @GetMapping("/name")
    public String search(Model model, @RequestParam String search){
        String result = null;
        Map<String,String> map = new LinkedHashMap<>();
        map.put("dog", "chó");
        map.put("cat", "mèo");
        map.put("bird", "chim");
        map.put("fish", "cá");
        map.put("lion", "sư tử");
        result = map.get(search);
        model.addAttribute("result",result);
        return "greeting";
    }

}
