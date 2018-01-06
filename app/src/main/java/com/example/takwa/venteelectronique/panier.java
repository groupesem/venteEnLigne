package com.example.takwa.venteelectronique;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.database.sqlite.SQLiteOpenHelper;

public class panier extends AppCompatActivity
{
    panierBD my_panier ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panier);

        my_panier = new panierBD (this);
    }
}
