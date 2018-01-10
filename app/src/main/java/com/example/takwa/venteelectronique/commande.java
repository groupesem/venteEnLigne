package com.example.takwa.venteelectronique;

import java.util.ArrayList;
/**
 * Created by DELL on 10/01/2018.
 */

public class commande
{



    ArrayList<ligne_commande> list_commande = new ArrayList<ligne_commande>();


    public void add(ligne_commande c)
    {
        list_commande.add(c);
    }
    public void delete(ligne_commande c)
    {
        list_commande.remove(c);
    }
}
