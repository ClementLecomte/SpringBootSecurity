package com.whildcodeschool.shield.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShieldController {

    @GetMapping("/")
    public String shield() {
        return "Welcome to the Shield ! ";
    }

    @GetMapping("/avengers/assemble")
    public String avengers() {
        return "Avengers Assemble !";
    }

    @GetMapping("/secret-bases")
    public String bases() {
        return "<ul>" +
                "<li>Biarritz </li>" +
                "<li>Bordeaux </li>" +
                "<li>La Loupe </li>" +
                "<li>Marseille </li> " +
                "<li>Lyon </li>"+
                "<li>Lille </li>"+
                "<li>Toulouse </li>"+
                "<li>Madrid </li>"+
                "<li>Nantes </li>"+
                "<li>Orléans </li>"+
                "<li>Paris  </li>"+
                "<li>Reims </li>"+
                "<li>Strasbours </li>"+
                "<li>Tours </li>"+
                "<li>Berlin</li>"+
                "<li>Bruxelles </li>"+
                "<li>Lisbonne </li>"+
                "<li>Londre </li>"+
                "</ul>";
    }
}
