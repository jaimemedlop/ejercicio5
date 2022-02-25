package com.example.ejercicio5;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Item {

    private long id = -1;
    private String description;
    private boolean checked;

    public Item(String description, boolean checked) {
        this.description = description;
        this.checked = checked;
    }
}
