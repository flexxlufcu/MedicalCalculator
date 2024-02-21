package com.example.medicalcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class svkvp extends AppCompatActivity {

    double vv, t, result;
    EditText Text1, Text2;
    TextView Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_svkvp);

        Text = (TextView) findViewById(R.id.tv_resultSvkvp);
        Text1 = (EditText) findViewById(R.id.et_v);
        Text2 = (EditText) findViewById(R.id.et_t);

        final Button button1 = (Button) findViewById(R.id.btn_rerultSvkvp);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    vv = Double.parseDouble(Text1.getText().toString());
                    t = Double.parseDouble(Text2.getText().toString());
                    result = vv * 20 / t;
                    result = Math.round(result * 1000);
                    result /= 1000;
                    Text.setText("Результат: " + result + " ммоль");

                } catch (NumberFormatException e) {
                    Text.setText("Введите данные");
                }
            }
        });
    }
    public void back5(View v) {
        Intent intent = new Intent(this, qt.class);
        startActivity(intent);
    }

    public void next5(View v) {
        Intent intent = new Intent(this, kaliy.class);
        startActivity(intent);
    }

    public void toList5(View v) {
        Intent intent = new Intent(this, index.class);
        startActivity(intent);
    }

    public void toGlstr5(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}