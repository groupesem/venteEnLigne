package com.example.takwa.venteelectronique;

import android.content.Context;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.takwa.venteelectronique.DataBaseHelper;

public class DAOpanier {


    private Context context;
    private DataBaseHelper dbhelper;

    public static final String TABLE_Panier = "panier";
    public static final String col1 = "reference";
    public static final String col2 = "id";
    public static final String col3 = "qte";

    public DAOpanier(Context context) {
        this.context = context;
        this.dbhelper = new DataBaseHelper(context);
    }


    private static final String DATABASE_CREATE = "create table "
            + TABLE_Panier
            + " ("
            + col1 + " integer "
            + col2 + " String "
            + col3 + " integer "

            + ");";

    public static void onCreate(SQLiteDatabase database) {
        try {
            database.execSQL(DATABASE_CREATE);
            Log.e("panier_create", DATABASE_CREATE);
        } catch (Exception ex) {
            Log.e("panier_Create", ex.toString());
        }

    }

    public static void onUpgrade(SQLiteDatabase database, int oldVersion,
                                 int newVersion) {
        Log.w(panier.class.getName(), "Upgrading database from version "
                + oldVersion + " to " + newVersion
                + ", which will destroy all old data");

        onCreate(database);


    }


    
}