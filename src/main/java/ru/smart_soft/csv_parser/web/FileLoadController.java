package ru.smart_soft.csv_parser.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStreamReader;

@Controller
@RequestMapping(value = "CSV")
public class FileLoadController extends AbstractLoadController {

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) throws IOException, InterruptedException {
        if (!file.isEmpty()) {
            saveEventByCsvFile(new InputStreamReader(file.getInputStream()));
        }
        return "redirect:/index";
    }

    @GetMapping("/notFinished")
    public String notFinished() {
        return "redirect:/index";
    }

    @GetMapping("/report")
    public String report(Model model) {
        model.addAttribute("hourform", super.findAllLastHour());
        return "lastHour";
    }

    @GetMapping("/topFive")
    public String topFive(Model model) {
        model.addAttribute("topform", super.findTopFiveForm());
        return "topFive";
    }
}
