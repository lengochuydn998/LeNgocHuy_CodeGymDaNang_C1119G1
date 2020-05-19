package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Dictionary;

@Controller
public class DictionaryController {
    @Autowired
    Dictionary dictionary;
    @GetMapping("/search")
    public String dich(@RequestParam String keyWord,Model model){
        String result = dictionary.search(keyWord);
        model.addAttribute("word",result);
        return "view";
    }

}
