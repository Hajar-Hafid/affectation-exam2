package com.example.affectation.controllers;

import com.example.affectation.model.Affectation;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/affectations")
public class AffectationController {
    @GetMapping("/create")
    public String showCreatePage(Model model) {
        Affectation affectation = new Affectation();
        model.addAttribute("affectation", affectation);
        return "affectations/createAffectation";
    }

    @PostMapping("/create")
    public String createProduct(
            @Valid @ModelAttribute Affectation affectation,
            BindingResult result) {

        if (result.hasErrors()) {
            return "affectations/createaAffectattion";
        }

    }
}
