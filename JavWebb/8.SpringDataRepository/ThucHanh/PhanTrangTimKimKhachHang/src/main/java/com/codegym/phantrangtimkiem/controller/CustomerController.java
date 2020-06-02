package com.codegym.phantrangtimkiem.controller;

import com.codegym.phantrangtimkiem.model.Customer;
import com.codegym.phantrangtimkiem.service.CustomerService;
import com.codegym.phantrangtimkiem.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping("/")
    public String index(Model model, @PageableDefault(size = 5) Pageable pageable, @RequestParam Optional<String> keyword) {
        String keywordLast = null;
        if(keyword.isPresent()){
            keywordLast=keyword.get();
            model.addAttribute("customers", customerService.findAllByName(keywordLast, pageable));
        }else {
            model.addAttribute("customers", customerService.findAll(pageable));
        }
        model.addAttribute("keyword", keywordLast);
        return "index";
    }

    @GetMapping("/customer/create")
    public String create(Model model){
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping("/customer/save")
    public String save(@ModelAttribute(name = "customer") Customer customer, RedirectAttributes redirect){
//        customer.setId((int) Math.random()*100000);
        customerService.save(customer);
        redirect.addFlashAttribute("success","Saved customer successfully!");
        return "redirect:/";
    }

    @GetMapping("/customer/{id}/edit")
    public String edit (@PathVariable Integer id, Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "edit";
    }

    @PostMapping("/customer/update")
    public String update(Customer customer, RedirectAttributes redirect){
        customerService.save(customer);
        redirect.addFlashAttribute("success","Modified customer successfully!");
        return "redirect:/";
    }


    @GetMapping("/customer/{id}/delete")
    public String delete(@PathVariable Integer id, Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "delete";
    }

    @PostMapping("/customer/delete")
    public String delete(Customer customer, RedirectAttributes redirect){
        customerService.remove(customer.getId());
        redirect.addFlashAttribute("success","Removed customer successfully!");
        return "redirect:/";
    }

    @GetMapping("/customer/{id}/view")
    public String view(@PathVariable Integer id, Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "view";
    }

}


