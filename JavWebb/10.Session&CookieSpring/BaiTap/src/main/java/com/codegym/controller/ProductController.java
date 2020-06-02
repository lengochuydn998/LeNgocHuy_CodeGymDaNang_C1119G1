package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    ProductService productService;
    @ModelAttribute("cart")
    public Cart cart(){
        return new Cart();
    }
    @GetMapping("/")
    public String index(Model model, Pageable pageable){

        model.addAttribute("products",productService.findAll(pageable));
        return "index";
    }
    @GetMapping("/view/{id}")
    public String view(@PathVariable Integer id,Model model){
        model.addAttribute("product",productService.findById(id));
        return "view";
    }
    @GetMapping("/addProduct/{id}")
    public String addProduct(@PathVariable Integer id,@ModelAttribute("cart") Cart cart){
        cart.addProduct(productService.findById(id));
        cart.upTotalPrice(Integer.parseInt(productService.findById(id).getPrice()));
        return "redirect:/";
    }
    @GetMapping("/cart")
    public String cartForm(Model model,@ModelAttribute("cart") Cart cart){
        model.addAttribute("products",cart);
        return "cart";
    }
    @GetMapping("/buy")
    public String buy(@ModelAttribute Cart cart){
        cart.setTotalPrice(0);
        cart.deleteAll();
        return "redirect:/";
    }
}
