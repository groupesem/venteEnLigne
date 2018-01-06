package com.example.takwa.venteelectronique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b_signin = (Button) findViewById(R.id.b_signin);

    }

    public void signin(View view)
    {
        Intent myIntent = new Intent(getApplicationContext(), Sign_in.class);
        startActivity(myIntent);
    }
}
