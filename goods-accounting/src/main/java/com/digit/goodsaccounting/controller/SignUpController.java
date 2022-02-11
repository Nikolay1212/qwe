package com.digit.goodsaccounting.controller;

import com.digit.goodsaccounting.form.SignUpForm;
import com.digit.goodsaccounting.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @GetMapping("/signUp")
    public String getSignUpPage(Model model) {
        model.addAttribute("signUpForm", new SignUpForm());
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUpUser(SignUpForm form, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("signUpForm", form);
            return "signUp";
        }
        signUpService.signUp(form);
        return "redirect:/signIn";
    }
}
