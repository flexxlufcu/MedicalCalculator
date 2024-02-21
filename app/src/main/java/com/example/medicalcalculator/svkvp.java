package com.example.medicalcalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class svkvp extends AppCompatActivity {

    double vv, t;
    static double result;
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

    public void info5(View v){
        showInfo("Внутривенное введение препаратов, также известное как капельное вливание, представляет собой медицинскую процедуру, при которой лекарственные средства или растворы поступают непосредственно в организм пациента через венозное пульсирующее сосудистое русло, или, иными словами, вену. Этот метод администрирования лекарственных препаратов обеспечивает быструю и надежную доставку лекарств внутрь организма, что делает его достаточно эффективным и широко применяемым в современной медицинской практике.\nМаксимальная скорость введения: до 20 ммоль калия/час у взрослых (соответствует 0,3 ммоль калия/кг массы тела/час). Если концентрация калия в плазме крови составляет менее 2 ммоль калия/л, скорость инфузии может достигать 40 ммоль калия/час.");
    }

    private void showInfo(String text){
        AlertDialog.Builder builder = new AlertDialog.Builder(svkvp.this);
        builder.setTitle("Справка")
                .setMessage(text)
                .setCancelable(true);
        AlertDialog dialog = builder.create();
        dialog.show();
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
        Intent intent = new Intent(this, list_of_calculators.class);
        startActivity(intent);
    }

    public void toGlstr5(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}