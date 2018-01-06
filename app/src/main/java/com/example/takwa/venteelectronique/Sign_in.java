package com.example.takwa.venteelectronique;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Sign_in extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


    }

    public void incrire(View view)
    {
        EditText nom = (EditText)findViewById(R.id.tv_name);
        EditText prenom = (EditText)findViewById(R.id.tv_prenom);
        EditText  tel = (EditText)findViewById(R.id.tv_tel);
        EditText  pm = (EditText)findViewById(R.id.tv_pm);
        EditText adresse = (EditText)findViewById(R.id.tv_adresse);


    }
}
