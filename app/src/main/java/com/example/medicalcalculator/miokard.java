package com.example.medicalcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class miokard extends AppCompatActivity {

    double mgpd, kdr, tzslgd, result;
    EditText Text1, Text2, Text3;
    TextView Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miokard);

        Text = (TextView) findViewById(R.id.tv_resultMiokard);
        Text1 = (EditText) findViewById(R.id.et_mgpd);
        Text2 = (EditText) findViewById(R.id.et_kdr);
        Text3 = (EditText) findViewById(R.id.et_tzslgd);

        final Button button1 = (Button) findViewById(R.id.btn_rerultMiokard);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    mgpd = Double.parseDouble(Text1.getText().toString());
                    kdr = Double.parseDouble(Text2.getText().toString());
                    tzslgd = Double.parseDouble(Text3.getText().toString());
                    result = 0.8 * (1.04 * (mgpd + kdr + tzslgd) * 3 - kdr * 3) + 0.6;
                    result = Math.round(result * 1000);
                    result /= 1000;
                    Text.setText("Результат: " + result + " ЛЖ (ММЛЖ)");

                } catch (NumberFormatException e) {
                    Text.setText("Введите данные");
                }
            }
        });
    }

    public void back3(View v) {
        Intent intent = new Intent(this, spid.class);
        startActivity(intent);
    }

    public void next3(View v) {
        Intent intent = new Intent(this, qt.class);
        startActivity(intent);
    }

    public void toList3(View v) {
        Intent intent = new Intent(this, index.class);
        startActivity(intent);
    }

    public void toGlstr3(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}