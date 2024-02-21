package com.example.medicalcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exit(View v){
        this.finishAffinity();
    }

    public void toHelp(View v) {
        Intent intent = new Intent(this, help.class);
        startActivity(intent);
    }

    public void toList(View v) {
        Intent intent = new Intent(this, list_of_calculators.class);
        startActivity(intent);
    }
}