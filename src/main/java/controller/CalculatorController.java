package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {

    @GetMapping("/index")
    public ModelAndView form(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @PostMapping("/cal")
    public ModelAndView getResult(@RequestParam Double input1, Double input2, String operator) {
        ModelAndView modelAndView = new ModelAndView("index");
        double result = 0.0;
        String error = "";
        switch (operator) {
            case "+":
                result = input1 + input2;
                break;
            case "-":
                result = input1 - input2;
                break;
            case "*":
                result = input1 * input2;
                break;
            case "/":
                if (input2 != 0) {
                    result = input1 / input2;
                    break;
                } else {
                    error = "Can't divide by zero";
                    break;
                }
            default:
                error = "Invalid operation";
        }
        modelAndView.addObject("result", result);
        modelAndView.addObject("error", error);
        return modelAndView;
    }
}

