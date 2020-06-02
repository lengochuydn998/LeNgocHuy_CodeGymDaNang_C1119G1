package com.codegym.controller;

import com.codegym.model.Contract;
import com.codegym.model.Customer;
import com.codegym.model.Service;
import com.codegym.service.ContractService;
import com.codegym.service.CustomerService;
import com.codegym.service.ServiceService;
import com.codegym.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Controller
public class ContractController {
    @Autowired
    ContractService contractService;
    @Autowired
    CustomerService customerService;
    @Autowired
    StaffService staffService;
    @Autowired
    ServiceService serviceService;

    @GetMapping("/contracts")
    public String index(Model model, @PageableDefault(size=2) Pageable pageable){
            Page<Contract> contracts = contractService.findAll(pageable);
            model.addAttribute("contracts",contracts);
//            model.addAttribute("listType",typeCustomerRepository.findAll());
        return "contract/index";
    }
    @GetMapping("/contract/create")
    public String create(Model model,Pageable pageable){
        model.addAttribute("contract",new Contract());
        model.addAttribute("nameCustomer",customerService.findAll(pageable));
        model.addAttribute("nameStaff",staffService.findAll());
        model.addAttribute("nameService",serviceService.findAll(pageable));
        return "contract/create";
    }
    @PostMapping("/contract/save")
    public String save(@ModelAttribute(name = "contract") Contract contract, RedirectAttributes redirect){
            contractService.save(contract);
            redirect.addFlashAttribute("message","Create new contract successfully");
            return "redirect:/contracts";
    }
    @GetMapping("/contact/using")
    public String showCusUsing(Model model){
        model.addAttribute("cusUsing",contractService.abc(""));
        return "contract/show";
    }
}
