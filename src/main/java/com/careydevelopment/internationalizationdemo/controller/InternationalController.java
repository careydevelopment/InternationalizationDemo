package com.careydevelopment.internationalizationdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InternationalController {

    @RequestMapping(value = "/international", method=RequestMethod.GET)
    public String international() {
        return "international";
    }
    
    //redirect to demo if user hits the root
    @RequestMapping("/")
    public String home(Model model) {
        return "redirect:international";
    }
}
