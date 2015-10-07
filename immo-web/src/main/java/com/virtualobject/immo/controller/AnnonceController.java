package com.virtualobject.immo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnnonceController {

    @RequestMapping("/annonces")
    public String findAnnoncesByClient(@RequestParam(value="clientId", required=false, defaultValue="12345") String clientId, Model model) {
        model.addAttribute("clientId", clientId);
        return "annoncesByClient";
    }
}
