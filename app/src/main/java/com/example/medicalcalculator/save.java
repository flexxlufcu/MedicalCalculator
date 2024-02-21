package com.example.medicalcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class save extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        Intent saveInt = getIntent();

        String SaveIndex = saveInt.getStringExtra("saveIndex");
        String SaveSpid = saveInt.getStringExtra("saveSpid");
        String SaveMiokard = saveInt.getStringExtra("saveMiokard");
        String SaveQT = saveInt.getStringExtra("saveQT");
        String SaveSvkvp = saveInt.getStringExtra("saveSvkvp");
        String SaveKaliy = saveInt.getStringExtra("saveKaliy");

        TextView tv_resultIndex = findViewById(R.id.tv_saveIndex);
        tv_resultIndex.setText("Индекс массы тела:\n" + SaveIndex + " кг/м^2\n\nСкорость инфузии препарата:\n" + SaveSpid + "\n\nМасса миокарда:\n" + SaveMiokard + " ЛЖ (ММЛЖ)\n\nКорригированный интервал QT:\n" + SaveQT + "\n\nСкорость внутривенного капельного введения преппарата:\n" + SaveSvkvp + " ммоль\n\nДефицит калия:\n" + SaveKaliy + " ммоль");
    }

    public void resultList(View v) {
        Intent intent = new Intent(this, list_of_calculators.class);
        startActivity(intent);
    }

    public void resultGlstr(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}

