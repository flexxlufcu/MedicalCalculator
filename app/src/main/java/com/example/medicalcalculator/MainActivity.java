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

    public void toResult(View v) {
        saveResult sr = new saveResult();
        Intent resultInt = new Intent(MainActivity.this, save.class);

        resultInt.putExtra("saveIndex", sr.resultIndex1);
        resultInt.putExtra("saveSpid", sr.resultSpid1);
        resultInt.putExtra("saveMiokard", sr.resultMiokard1);
        resultInt.putExtra("saveQT", sr.resultQT1);
        resultInt.putExtra("saveSvkvp", sr.resultSvkvp1);
        resultInt.putExtra("saveKaliy", sr.resultKaliy1);

        startActivity(resultInt);
    }
}