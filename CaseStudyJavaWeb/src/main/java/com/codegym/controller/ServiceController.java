package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.model.Service;
import com.codegym.model.TypeRent;
import com.codegym.model.TypeService;
import com.codegym.service.ServiceService;
import com.codegym.service.TypeRentService;
import com.codegym.service.TypeServiceService;
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

import java.util.Optional;

@Controller
public class ServiceController {

    @Autowired
    ServiceService serviceService;

    @Autowired
    TypeRentService typeRentService;

    @Autowired
    TypeServiceService typeServiceService;


    @GetMapping("/services")
    public String index(Model model, @PageableDefault(size=5)Pageable pageable, @RequestParam Optional<String> keyword){
        String keywordLast =null;
        if (keyword.isPresent()){
            keywordLast= keyword.get();
            model.addAttribute("services",serviceService.findAllByName(keywordLast,pageable));
//            model.addAttribute("listType",typeCustomerRepository.findAll());
        }else{
            Page<Service> Services = serviceService.findAll(pageable);
            model.addAttribute("services",Services);
//            model.addAttribute("listType",typeCustomerRepository.findAll());
        }
        model.addAttribute("keyword",keywordLast);
        return "service/index";
    }
    @GetMapping("/service/create")
    public String create(Model model){
        model.addAttribute("service",new Service());
        model.addAttribute("listTypeRent",typeRentService.findAllTypeRent());
        model.addAttribute("listTypeService",typeServiceService.findAllTypeService());
        return "service/create";
    }
    @PostMapping("/service/save")
    public String save(@Validated @ModelAttribute(name = "service") Service service, BindingResult bindingResult, RedirectAttributes redirect, Model model){
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("service", service);
            model.addAttribute("listTypeRent",typeRentService.findAllTypeRent());
            model.addAttribute("listTypeService",typeServiceService.findAllTypeService());
            return "service/create";
        }else {
            serviceService.save(service);
            redirect.addFlashAttribute("message","Create new service successfully");
            return "redirect:/services";
        }
    }
    @GetMapping("/service/{id}/edit")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("service",serviceService.findById(id));
        model.addAttribute("listTypeRent",typeRentService.findAllTypeRent());
        model.addAttribute("listTypeService",typeServiceService.findAllTypeService());
        return "service/edit";
    }
    @PostMapping("/service/edit")
    public String update(@Validated @ModelAttribute(name = "service") Service service,BindingResult bindingResult,Model model,RedirectAttributes redirect){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("service",service);
            model.addAttribute("listTypeRent",typeRentService.findAllTypeRent());
            model.addAttribute("listTypeService",typeServiceService.findAllTypeService());
            return "service/edit";
        }else {
            serviceService.save(service);
            redirect.addFlashAttribute("message", "Edit service successfully");
            return "redirect:/services";
        }
    }
    @GetMapping("/service/{id}/delete")
    public String delete(@PathVariable Integer id,Model model){
        model.addAttribute("service",serviceService.findById(id));
        model.addAttribute("listTypeRent",typeRentService.findAllTypeRent());
        model.addAttribute("listTypeService",typeServiceService.findAllTypeService());
        return "service/delete";
    }
    @PostMapping("/service/delete")
    public String delete(@ModelAttribute(name = "customer")Customer customer,RedirectAttributes redirect){
        serviceService.remove(customer.getId());
        redirect.addFlashAttribute("message","Delete service successfully");
        return "redirect:/services";
    }
}
