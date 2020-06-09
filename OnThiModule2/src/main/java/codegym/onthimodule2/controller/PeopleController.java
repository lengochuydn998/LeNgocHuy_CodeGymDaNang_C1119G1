package codegym.onthimodule2.controller;

import codegym.onthimodule2.model.People;
import codegym.onthimodule2.service.AddressService;
import codegym.onthimodule2.service.PeopleService;
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
public class PeopleController {
    @Autowired
    PeopleService peopleService;
    @Autowired
    AddressService addressService;

    @GetMapping("/")
    public String index(Model model, @PageableDefault(size =2)Pageable pageable, @RequestParam Optional<String> keyword){
        String key = null;
        if (keyword.isPresent()){
            key = keyword.get();
            model.addAttribute("peoples",peopleService.findAllByName(key,key,pageable));
//            model.addAttribute("peoples",peopleService.findByAd(key,pageable));
        }else {
            Page<People> peoples =peopleService.findAll(pageable);
            model.addAttribute("peoples",peoples);
        }
        model.addAttribute("keyword",key);
        return "index";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("people",new People());
        model.addAttribute("listAddress",addressService.findAll());
        return "create";
    }
    @PostMapping("/save")
    public String create(@Validated  @ModelAttribute(name = "people") People people , BindingResult bindingResult, Model model, RedirectAttributes redirect){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("people",people);
            model.addAttribute("listAddress",addressService.findAll());
            return "create";
        }else {
            peopleService.save(people);
            redirect.addFlashAttribute("message","Create new people successfully !!!");
            return "redirect:/";
        }
    }
    @GetMapping("/people/{id}/edit")
    public String showFormEdit(@PathVariable Integer id,Model model){
        model.addAttribute("people",peopleService.findById(id));
        model.addAttribute("listAddress",addressService.findAll());
        return "edit";
    }
    @PostMapping("/people/edit")
    public String edit(@Validated @ModelAttribute(name = "people")People people,BindingResult bindingResult,Model model,RedirectAttributes redirect){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("people",people);
            model.addAttribute("listAddress",addressService.findAll());
            return "edit";
        }else {
            peopleService.save(people);
            redirect.addFlashAttribute("message", "Edit people successfully");
            return "redirect:/";
        }
    }
    @GetMapping("/people/delete")
    public String delete(@RequestParam(name = "id") Integer id){
        peopleService.delete(id);
        return "redirect:/";
    }
}
