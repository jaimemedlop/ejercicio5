package com.example.ejercicio5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class ItemRESTController {

    @Autowired
    ItemHolder itemHolder;

    @PostMapping("/item")
    public ResponseEntity<Item> create(@RequestBody Item item){
        itemHolder.addItem(item);
        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }
}
