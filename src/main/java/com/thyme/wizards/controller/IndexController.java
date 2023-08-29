package com.thyme.wizards.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("pageTitle", "ThymeWizards");
        model.addAttribute("pageAuthors", List.of("Vlad", "Vladus", "Vlodimir"));
        return "index2";
    }

}
