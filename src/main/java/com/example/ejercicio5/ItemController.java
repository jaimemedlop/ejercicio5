package com.example.ejercicio5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class ItemController {

    @Autowired
    ItemHolder itemHolder;

    @GetMapping("/")
    public String getItems(Model model){
        model.addAttribute("items", itemHolder.getItems());
        return "tablon";
    }
}
