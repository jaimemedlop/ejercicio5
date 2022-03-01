package com.example.ejercicio5;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ItemHolder {

    private Map<Long, Item> items = new ConcurrentHashMap<>();
    private AtomicLong lastID = new AtomicLong();

    public void addItem(Item item){

        long id = lastID.incrementAndGet();
        item.setId(id);
        items.put(id, item);

    }

    public Collection<Item> getItems(){
        return items.values();
    }

    public Item getItem(long id){
        return items.get(id);
    }
}
