package com.example.application.modele;

import java.util.Date;

public class Consommable extends Item{

    Date dateAchat;
    Date dateVide;

    public Consommable(){}

    public void aEteVide(){
        dateVide = new Date();
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public Date getDateVide() {
        return dateVide;
    }
}
