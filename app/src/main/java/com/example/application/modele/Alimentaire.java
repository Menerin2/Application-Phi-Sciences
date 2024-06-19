package com.example.application.modele;

import java.util.Date;

public class Alimentaire extends Item{

    private String numDeLot;
    private Date dateAchat;
    private Date dlc;

    public Alimentaire(int id){
        //Récupérer les infos dans la db depuis l'id'
    }

    public boolean estPerime(){
        return dlc.before(new Date());
    }

    public String quelType(){
        return "Alimentaire";
    }

    public String getNumDeLot() {
        return numDeLot;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public Date getDlc() {
        return dlc;
    }
}
