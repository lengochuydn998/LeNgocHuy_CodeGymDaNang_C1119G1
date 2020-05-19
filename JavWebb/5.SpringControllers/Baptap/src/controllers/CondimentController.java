package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CondimentController {
    @GetMapping("/condiment")
    public String condiment(@RequestParam String[] condiment, Model model){
        model.addAttribute("result",condiment);
        return "home";
    }


}
