package com.example.application.modele;

import java.util.HashMap;

public class Panier {

    private HashMap<Integer, Integer> items;
    private int idUser;

    /**
     * Constructeur de la classe Panier
     * @param idUser l'id de l'utilsateur en cours (a qui appatient le panier)
     */
    public Panier(int idUser){
        this.idUser = idUser;
        //Creation de la HasMap
        this.items = new HashMap<>();
    }

    /**
     * Ajoute un item au panier, s'il y est deja, modifie sa quantite
     * @param idItem l'id de l'item a ajoute
     * @param quantite la quantite de l'item a ajoute au panier
     * @return 0 si l'ajout a ete effectue 1 sinon
     */
    public int addItem(int idItem, int quantite){
        //recup quantite stock dans bdd
        int stockQuantite;
        if((stockQuantite < -quantite)){
            return 1;
        }
        //Si l'item n'est pas dans le panier, on l'y ajoute
        if(!items.containsKey(idItem)){
            items.put(idItem, quantite);
        }else {
            //Sinon, on recupere l'ancienne quantite
            int oldQuantite = items.get(idItem);
            items.replace(idItem, oldQuantite, oldQuantite + quantite);
        }
        return 0;
    }

    /**
     * Fonction qui supprime un Item du panier
     * @param idItem l'id de l'item a ajoute
     * @return 0 si l'item est bien enelve 1 sinon
     */
    public int rmvItem(int idItem){
        //demande confirmation suppr
        if(!items.containsKey(idItem)){
            return 1;
        }
        items.remove(idItem);
        return 0;
    }

    /**
     * Fonction qui permet de savoir si le panier est valide
     * @return true si le panier est valide, false sinon
     */
    public boolean estValide(){
        for (int idItem : items.keySet()){
            /*
            if(items.get(idItem) - getItemStock < 0){
                return false
            }
             */
        }
        return true;
    }

    /**
     * Fonction qui modifie le stock si le panier est valide
     * @return 0 si le stock est modifie 1 sinon
     */
    public int validerPanier(){
        if(!estValide()){
            return 1;
        }else{
            //modif stock
        }
        return 0;
    }

    public int getQuantite(int idItem){
        return items.get(idItem);
    }

    public HashMap<Integer, Integer> getAllItems(){
        return items;
    }
}
