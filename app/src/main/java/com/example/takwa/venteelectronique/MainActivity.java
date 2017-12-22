package com.example.takwa.venteelectronique;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maint);
        android.widget.Toast.makeText(this, "tes", Toast.LENGTH_SHORT).show();
    }
}
