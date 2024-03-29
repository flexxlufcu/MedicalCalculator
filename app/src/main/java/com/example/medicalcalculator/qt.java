package com.example.medicalcalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class qt extends AppCompatActivity {

    double qt, rr, kof;
    static double result;
    EditText Text1, Text2, Text3;
    TextView Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qt);

        Text = (TextView) findViewById(R.id.tv_resultQT);
        Text1 = (EditText) findViewById(R.id.et_qt);
        Text2 = (EditText) findViewById(R.id.et_rr);
        Text3 = (EditText) findViewById(R.id.et_kof);

        final Button button1 = (Button) findViewById(R.id.btn_rerultQT);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    qt = Double.parseDouble(Text1.getText().toString());
                    rr = Double.parseDouble(Text2.getText().toString());
                    kof = Double.parseDouble(Text3.getText().toString());
                    result = (qt / Math.sqrt(rr)) * kof;
                    result = Math.round(result * 1000);
                    result /= 1000;
                    Text.setText("Результат: " + result);

                } catch (NumberFormatException e) {
                    Text.setText("Введите данные");
                }
            }
        });
    }

    public void info4(View v){
        showInfo("Интервал QT — расстояние от начала комплекса QRS до завершения зубца T. С точки зрения электрофизиологии отражает сумму процессов деполяризации (электрическое возбуждение со сменой заряда клеток) и последующей реполяризации (восстановление электрического заряда) миокарда желудочков. Часто этот параметр называют электрическая систола сердца.\nНормальные значения корригированного QT согласно рекомендациям ACC / HRS: 340-450 для мужчин и 340-460 для женщин.");
    }

    private void showInfo(String text){
        AlertDialog.Builder builder = new AlertDialog.Builder(qt.this);
        builder.setTitle("Справка")
                .setMessage(text)
                .setCancelable(true);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void back4(View v) {
        Intent intent = new Intent(this, miokard.class);
        startActivity(intent);
    }

    public void next4(View v) {
        Intent intent = new Intent(this, svkvp.class);
        startActivity(intent);
    }

    public void toList4(View v) {
        Intent intent = new Intent(this, list_of_calculators.class);
        startActivity(intent);
    }

    public void toGlstr4(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}