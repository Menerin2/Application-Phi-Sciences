package com.example.application.modele;

import java.util.ArrayList;

public class Stock {

    ArrayList<Item> items;

    public Stock(){
        items = new ArrayList<>();
        //get stock
    }

    public boolean isInStock(Item item){
        return items.contains(item);
    }

    public int quelQuantite(Item item){
        int i = items.indexOf(item);
        return items.get(i).getQuantite();
    }
}
