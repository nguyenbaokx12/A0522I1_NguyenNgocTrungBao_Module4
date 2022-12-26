package com.example.controller;


import com.example.model.Product;
import com.example.service.IProductService;
import com.example.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {
    private static IProductService iProductService = new ProductService();

    @GetMapping("")
    String showList(Model model){
        model.addAttribute("showProduct", iProductService.findAll());
        return "list";
    }

    //create
    @GetMapping("/create")
    String pageCreate(@ModelAttribute Product product, Model model){
        model.addAttribute("product", product);
        return "new";
    }

    @PostMapping("save")
    String addProduct(@ModelAttribute Product product) {
        iProductService.addNew(product);
        return "redirect:/product";
    }

    //delete
    @GetMapping("/{id}/delete")
    String deleteProduct(@PathVariable int id) throws Exception {
        iProductService.delete(id);
        return "redirect:/product";
    }
}
