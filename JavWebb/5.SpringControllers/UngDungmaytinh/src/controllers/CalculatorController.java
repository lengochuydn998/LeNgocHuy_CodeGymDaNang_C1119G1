package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CalculateService;
import service.CalculateServiceImpl;

@Controller
public class CalculatorController {
    @Autowired
    CalculateService calculateService;
    @GetMapping("/calculate")
    public String calculate(@RequestParam String dau,@RequestParam double number1,@RequestParam double number2, Model model){
        String result = "";
        switch (dau){
            case "Addition(+)":
                 result = String.valueOf(calculateService.cong(number1,number2));
                 break;
            case "Subtraction(-)":
                result = String.valueOf(calculateService.tru(number1,number2));
                break;
            case "Multiplication(x)":
                result = String.valueOf(calculateService.nhan(number1,number2));
                break;
            case "Division(/)":
                try{
                    result = String.valueOf(calculateService.chia(number1,number2));
                }catch (ArithmeticException ex){
                    ex.getMessage();
                }
        }
        model.addAttribute("result",result);
        return "result";
    }
}
