package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.repository.TypeCustomerRepository;
import com.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    TypeCustomerRepository typeCustomerRepository;
    @GetMapping("/customers")
    public String index(Model model, @PageableDefault(size=2)Pageable pageable, @RequestParam Optional<String> keyword){
        String keywordLast =null;
        if (keyword.isPresent()){
            keywordLast= keyword.get();
            model.addAttribute("customers",customerService.findAllByName(keywordLast,pageable));
//            model.addAttribute("listType",typeCustomerRepository.findAll());
        }else{
            Page<Customer> customers = customerService.findAll(pageable);
            model.addAttribute("customers",customers);
//            model.addAttribute("listType",typeCustomerRepository.findAll());
        }
        model.addAttribute("keyword",keywordLast);
        return "customer/index";
    }
    @GetMapping("/customer/create")
    public String create(Model model){
        model.addAttribute("customer",new Customer());
        model.addAttribute("listType",typeCustomerRepository.findAll());
        return "customer/create";
    }
    @PostMapping("/customer/save")
    public String save(@Validated @ModelAttribute(name = "customer") Customer customer, BindingResult bindingResult, RedirectAttributes redirect,Model model){
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customer", customer);
            model.addAttribute("listType", typeCustomerRepository.findAll());
            return "customer/create";
        }else {
            customerService.save(customer);
            redirect.addFlashAttribute("message","Create new customer successfully");
            return "redirect:/";
        }
    }
    @GetMapping("/customer/{id}/edit")
    public String edit(@PathVariable Integer id,Model model){
        model.addAttribute("customer",customerService.findById(id));
        model.addAttribute("listType",typeCustomerRepository.findAll());
        return "customer/edit";
    }
    @PostMapping("/customer/edit")
    public String update(@Validated @ModelAttribute(name = "customer") Customer customer,BindingResult bindingResult,Model model,RedirectAttributes redirect){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("customer",customer);
            model.addAttribute("listType",typeCustomerRepository.findAll());
            return "customer/edit";
        }else {
            customerService.save(customer);
            redirect.addFlashAttribute("message", "Edit customer successfully");
            return "redirect:/customers";
        }
    }
//    @GetMapping("/customer/{id}/delete")
//    public String delete(@PathVariable Integer id,Model model){
//        model.addAttribute("customer",customerService.findById(id));
//        model.addAttribute("listType",typeCustomerRepository.findAll());
//        return "customer/delete";
//    }
//    @PostMapping("/customer/delete")
//    public String delete(@ModelAttribute(name = "customer")Customer customer,RedirectAttributes redirect){
//        customerService.remove(customer.getId());
//        redirect.addFlashAttribute("message","Delete customer successfully");
//        return "redirect:/customers";
//    }
    @GetMapping("/customer/delete")
    public String delete(@RequestParam(name ="id") Integer id){
        customerService.remove(id);
        return "redirect:/customers";
    }
}
