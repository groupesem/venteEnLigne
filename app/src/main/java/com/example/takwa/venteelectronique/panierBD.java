package com.example.takwa.venteelectronique;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class panierBD extends SQLiteOpenHelper

{

    public static  final  String DATABASE_NAME ="panier.db";
    public static  final  String TABLE_NAME ="panier_table";
    public static  final  String col1="id_panier"; // hedha l clé primaire mta l table panier kol 9adhya 3andha id teha
    public static  final  String col2="id_client";
    public static  final  String col3 ="id_produit";

    public panierBD(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase bd_panier = this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase bd_panier) {
        bd_panier.execSQL("create table "+ TABLE_NAME + " (id_panier INTEGER PRIMARY KEY,id_client INTEGER , id_produit INTEGER  )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase bd_panier, int i, int i1)
    {

        onCreate(bd_panier);
    }
}
