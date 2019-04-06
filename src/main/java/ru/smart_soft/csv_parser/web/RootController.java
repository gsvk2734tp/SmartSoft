package ru.smart_soft.csv_parser.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping("/")
    public String root() {
        return "mainPage";
    }

    @GetMapping("/index")
    public String home() {
        return "mainPage";
    }

}
