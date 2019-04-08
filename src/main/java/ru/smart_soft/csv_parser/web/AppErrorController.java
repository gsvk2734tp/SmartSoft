package ru.smart_soft.csv_parser.web;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppErrorController implements ErrorController {

    private static final String PATH = "/errorPage";

    @RequestMapping(value = PATH)
    public String errorPage() {
        return "error";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
