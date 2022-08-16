package com.lev.LEV.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SampleController {
    @GetMapping("/loginService")
    public String moin(@RequestParam String email, String passwort) {
        if(email.equals("lenet.kaup@ubs.com") && passwort.equals("1234")){
            return"moin";
        }else{
            return "index";
        }
    }

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @GetMapping("/registrieren")
    public String registrieren() {
        return("regestrierung");
    }

    @GetMapping("/login")
    public String loginService() {
        return "login";
    }

    @GetMapping("/home")
    public String home () {
        return("home");
    }

    @GetMapping("/admin")
    public String admin() {
        return("admin");
    }

    @GetMapping("/bearbeiten")
    public String bearbeiten() {
        return("bearbeiten");
    }

    @GetMapping("/event")
    public String eventseite() {
        return("eventSeite");
    }

    @GetMapping("/hinzufügen")
    public String hinzufügen() {
        return("hinzufügen");
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}