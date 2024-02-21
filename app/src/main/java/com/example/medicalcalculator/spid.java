package com.example.medicalcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class spid extends AppCompatActivity {

    double m, doza, concentrate, result;
    EditText Text1, Text2, Text3;
    TextView Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spid);

        Text = (TextView) findViewById(R.id.tv_resultSpid);
        Text1 = (EditText) findViewById(R.id.et_m);
        Text2 = (EditText) findViewById(R.id.et_doza);
        Text3 = (EditText) findViewById(R.id.et_concentrate);

        final Button button1 = (Button) findViewById(R.id.btn_rerultSpid);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    m = Double.parseDouble(Text1.getText().toString());
                    doza = Double.parseDouble(Text2.getText().toString());
                    concentrate = Double.parseDouble(Text3.getText().toString());
                    result = doza * m * 20 / concentrate;
                    result = Math.round(result * 1000);
                    result /= 1000;
                    Text.setText("Результат: " + result);

                } catch (NumberFormatException e) {
                    Text.setText("Введите данные");
                }
            }
        });
    }

    public void next2(View v) {
        Intent intent = new Intent(this, miokard.class);
        startActivity(intent);
    }

    public void back2(View v) {
            Intent intent = new Intent(this, index.class);
            startActivity(intent);
    }

    public void toList2(View v) {
        Intent intent = new Intent(this, list_of_calculators.class);
        startActivity(intent);
    }

    public void toGlstr2(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}