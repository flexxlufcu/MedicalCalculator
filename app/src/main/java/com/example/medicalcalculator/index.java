package com.example.medicalcalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class index extends AppCompatActivity {

    double h, kg;
    static double result;
    EditText Text1, Text2;
    TextView Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        Text = (TextView) findViewById(R.id.tv_resultIndex);
        Text1 = (EditText) findViewById(R.id.et_Height);
        Text2 = (EditText) findViewById(R.id.et_Weight);

        final Button button1 = (Button) findViewById(R.id.btn_rerultIndex);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    h = Double.parseDouble(Text1.getText().toString());
                    kg = Double.parseDouble(Text2.getText().toString());
                    h /= 100;
                    result = Math.round((kg / Math.pow(h, 2) * 1000));
                    result /= 1000;
                    Text.setText("Результат: " + result + " кг/м^2");

                } catch (NumberFormatException e) {
                    Text.setText("Введите данные");
                }
            }
        });
    }

    public void info1(View v){
        showInfo("Индекс массы тела (ИМТ) – простое отношение веса к росту, часто используется для классификации ожирения и избыточного веса. Индекс рассчитывается как отношение веса тела в килограммах к квадрату роста в метрах (кг/м 2). ИМТ является наиболее удобной мерой оценки уровня ожирения и избыточного веса у населения, поскольку он одинаков для обоих полов и для всех возрастных категорий взрослых.");
    }

    private void showInfo(String text){
        AlertDialog.Builder builder = new AlertDialog.Builder(index.this);
        builder.setTitle("Справка")
                .setMessage(text)
                .setCancelable(true);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void toList1(View v) {
        Intent intent = new Intent(this, list_of_calculators.class);
        startActivity(intent);
    }

    public void toGlstr1(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void next1(View v) {
        Intent intent = new Intent(this, spid.class);
        startActivity(intent);
    }

    public void back1(View v) {
        Intent intent = new Intent(this, kaliy.class);
        startActivity(intent);
    }

}