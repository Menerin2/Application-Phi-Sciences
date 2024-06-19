package com.example.application.modele;

public class Pret extends Utilisation {

    private String aQui;
    private String enEchange;

    public Pret(String aQui, String enEchange, int idItem){
        super(idItem);
        this.aQui = aQui;
        this.enEchange = enEchange;
    }

    public String getaQui() {
        return aQui;
    }

    public String getEnEchange() {
        return enEchange;
    }
}
