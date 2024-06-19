package com.example.application.modele;

import java.util.Date;

public class Utilisation {

    private Date dateDebut;
    private Date dateFin;
    private String remarquesUtilisation;
    private int idItem;

    public Utilisation(int idItem){
        this.idItem = idItem;
        dateDebut = new Date();
    }

    public void finUtil(String remarquesUtilisation){
        this.dateFin = new Date();
        this.remarquesUtilisation = remarquesUtilisation;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public String getRemarquesUtilisation() {
        return remarquesUtilisation;
    }
}
