package com.cg.userform.controller;

import com.cg.userform.model.UserForm;
import com.cg.userform.service.FormDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FormController {

    @Autowired
    private FormDataService formDataService;

    @GetMapping("/")
    public String showPage1(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "page1";
    }

    @PostMapping("/page2")
    public String handlePage1(@ModelAttribute UserForm userForm) {
        formDataService.updateUserForm(userForm);
        return "page2";
    }

    @PostMapping("/page3")
    public String handlePage2(@ModelAttribute UserForm userForm) {
        formDataService.updateUserForm(userForm);
        return "page3";
    }

    @PostMapping("/page4")
    public String handlePage3(@ModelAttribute UserForm userForm, Model model) {
        formDataService.updateUserForm(userForm);
        model.addAttribute("userForm", formDataService.getUserForm());
        return "page4";
    }
}