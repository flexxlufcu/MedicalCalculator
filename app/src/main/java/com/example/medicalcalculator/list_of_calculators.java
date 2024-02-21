package com.example.medicalcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class list_of_calculators extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_calculators);
    }

    public void toGlstr(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void toIndex(View v) {
        Intent intent = new Intent(this, index.class);
        startActivity(intent);
    }

    public void toSpid(View v) {
        Intent intent = new Intent(this, spid.class);
        startActivity(intent);
    }

    public void toMiokard(View v) {
        Intent intent = new Intent(this, miokard.class);
        startActivity(intent);
    }

    public void toQt(View v) {
        Intent intent = new Intent(this, qt.class);
        startActivity(intent);
    }

    public void toSvkvp(View v) {
        Intent intent = new Intent(this, svkvp.class);
        startActivity(intent);
    }

    public void toKaliy(View v) {
        Intent intent = new Intent(this, kaliy.class);
        startActivity(intent);
    }

}