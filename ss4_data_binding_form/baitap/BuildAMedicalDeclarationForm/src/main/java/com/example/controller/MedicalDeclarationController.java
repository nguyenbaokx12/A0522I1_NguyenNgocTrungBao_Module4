package com.example.controller;

import com.example.model.MedicalDeclaration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
@RequestMapping("")
public class MedicalDeclarationController {

    private static Map<String, String> stringsPT = new LinkedHashMap<>();

    static {
        stringsPT.put("tauBay","Tàu bay");
        stringsPT.put("tauThuyen","Tàu Thuyền");
        stringsPT.put("oto","ô tô");
        stringsPT.put("anthor","Khác");
    }

    @GetMapping("/add")
    String showToKhaiYTe(Model model){
        model.addAttribute("md",new MedicalDeclaration());
        model.addAttribute("pt",stringsPT);
        return "home";
    }

    @PostMapping("/add")
    String showDienToKhaiYTe(Model model, @ModelAttribute MedicalDeclaration medicalDeclaration){
        model.addAttribute("md",medicalDeclaration);
        return "result";
    }

}
