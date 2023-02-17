package com.example.completetheshoppingcart.controller;

import com.example.completetheshoppingcart.model.Cart;
import com.example.completetheshoppingcart.model.Product;
import com.example.completetheshoppingcart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping("getAll")
    public String getAll(Model model) {
        model.addAttribute("productList", iProductService.getAll());
        return "home";
    }

    @GetMapping("add/{id}")
    public String addToCart(@PathVariable Long id, @SessionAttribute Cart cart,
                            @RequestParam(value = "action", required = false,
                                    defaultValue = "") String action){
        Optional<Product> product = iProductService.getById(id);
        if (!product.isPresent()) {
            return "error";
        }
        if (action.equals("+")) {
            cart.addProduct(product.get());
            return "redirect:/getCart";
        }
        if (action.equals("-")) {
            cart.deleteProduct(product.get());
            return "redirect:/getCart";
        }
        if (action.equals("delete")) {
            cart.delete(product.get());
            return "redirect:/getCart";
        }
        cart.addProduct(product.get());
        return "redirect:/getAll";
    }
}


