package com.example.takwa.venteelectronique;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import android.util.Log;

public class DAOpanier {


    private DataBaseHelper maBaseSQLite;
    private SQLiteDatabase db;

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



    public void open()
    {
        //on ouvre la table en lecture/écriture
        db = maBaseSQLite.getWritableDatabase();
    }


    public void close()
    {
        //on ferme l'accès à la BDD
        db.close();
    }

    public long addproduit (Product produit) {


        ContentValues values = new ContentValues();
        values.put(col1, Product.getReference());


        return db.insert(TABLE_Panier,null,values);
    }


    public int supProduit(Product produit) {
        // suppression d'un enregistrement
        // valeur de retour : (int) nombre de lignes affectées par la clause WHERE, 0 sinon

        String where = col1+" = ?";
        String[] whereArgs = {Product.getReference()+""};

        return db.delete(TABLE_Panier, where, whereArgs);
    }



    public Product getProduct(String reference) {
        // Retourne l'animal dont l'id est passé en paramètre

        Product p =new Product();

        Cursor c = db.rawQuery("SELECT * FROM "+TABLE_Panier+" WHERE "+col1+"="+reference, null);
        if (c.moveToFirst()) {
            p.setReference(c.getInt(c.getColumnIndex(col1)));

            c.close();
        }

        return p;
    }
}