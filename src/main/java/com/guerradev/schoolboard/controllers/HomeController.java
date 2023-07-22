package com.guerradev.schoolboard.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping()
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home/index");
        mv.addObject("msg", "Mensagem vinda do controller");
        return mv;
    }
}
