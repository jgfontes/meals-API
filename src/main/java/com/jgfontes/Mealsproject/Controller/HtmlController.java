package com.jgfontes.Mealsproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/")
    public String openHtml(Model model) {
        model.addAttribute("helloWorld", "HelloWorld Recepy!!!!!!");
        return "main";
    }
}
