package com.example.medicalcalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kaliy extends AppCompatActivity {

    double m, kpl;
    static double result;
    EditText Text1, Text2;
    TextView Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaliy);

        Text = (TextView) findViewById(R.id.tv_resultKaliy);
        Text1 = (EditText) findViewById(R.id.et_mm);
        Text2 = (EditText) findViewById(R.id.et_kpl);

        final Button button1 = (Button) findViewById(R.id.btn_rerultKaliy);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    m = Double.parseDouble(Text1.getText().toString());
                    kpl = Double.parseDouble(Text2.getText().toString());
                    result = m * 0.2 * 2 * (4.5 - kpl);
                    result = Math.round(result * 1000);
                    result /= 1000;
                    Text.setText("Результат: " + result + " ммоль");

                } catch (NumberFormatException e) {
                    Text.setText("Введите данные");
                }
            }
        });
    }

    public void info6(View v){
        showInfo("Калий важен для нормального функционирования почек и надпочечников, хотя при патологиях почек и/или почечной недостаточности может быть рекомендовано ограничение его потребления. При дефиците калия нарушается работа нервной и сердечно-сосудистой систем. Этот микроэлемент помогает поддерживать щелочную среду в организме, способствует укреплению костной ткани и сохранению мышечной массы.\nВ норме у человека уровень калия составляет от 3,5 до 5,1 ммоль на литр. Снижаться концентрация калия ниже 3,05 ммоль на литр может при нарушенной функции почек (называется понижение калия «гипокалиемия»).");
    }

    private void showInfo(String text){
        AlertDialog.Builder builder = new AlertDialog.Builder(kaliy.this);
        builder.setTitle("Справка")
                .setMessage(text)
                .setCancelable(true);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void back6(View v) {
        Intent intent = new Intent(this, svkvp.class);
        startActivity(intent);
    }

    public void next6(View v) {
        Intent intent = new Intent(this, index.class);
        startActivity(intent);
    }

    public void toList6(View v) {
        Intent intent = new Intent(this, list_of_calculators.class);
        startActivity(intent);
    }

    public void toGlstr6(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}