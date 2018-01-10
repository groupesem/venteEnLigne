package com.example.takwa.venteelectronique;

/**
 * Created by DELL on 10/01/2018.
 */

public class ligne_commande
{
    int quantite ;
    String reference  ;

    public ligne_commande(int quantite, String reference) {
        this.quantite = quantite;
        this.reference = reference;
    }

    public int getquantite() {
        return quantite;
    }

    public void setquantite(int quantite) {
        this.quantite = quantite;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
