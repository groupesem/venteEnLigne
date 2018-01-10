package com.example.takwa.venteelectronique;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;



public class DataBaseHelper extends SQLiteOpenHelper {

    // Logcat tag
    private static final String LOG = "DatabaseHelper";
    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "VenteDB";

    private Context context;

    public DataBaseHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    // Method is called during creation of the database
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        DAOpanier.onCreate(sqLiteDatabase);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        DAOpanier.onUpgrade(sqLiteDatabase, i, i1);
    }
}
