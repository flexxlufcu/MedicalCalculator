package com.example.medicalcalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class spid extends AppCompatActivity {

    double m, doza, concentrate;
    static double result;
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

    public void info2(View v){
        showInfo("В фармакокинетике скорость инфузии (или скорость дозирования) относится не только к скорости введения лекарственного средства, но и к желаемой скорости, с которой следует вводить лекарственное средство для достижения устойчивого состояния фиксированной дозы, которая, как было продемонстрировано, является терапевтически эффективной.\nВзрослым дается 1 л кристаллоида (20 мл/кг у детей) или, при геморрагическом шоке, от 5 до 10 мл/кг коллоида или эритроцитов Исключением является пациент с кардиогенным шоком, который, как правило, не требует большого объема инфузии. Минимальная скорость инфузии – 0,5 мл/час, максимальная – 7,5 мл/час. При необходимости, скорость поступления препарата можно изменять во время процедуры.");
    }

    private void showInfo(String text){
        AlertDialog.Builder builder = new AlertDialog.Builder(spid.this);
        builder.setTitle("Справка")
                .setMessage(text)
                .setCancelable(true);
        AlertDialog dialog = builder.create();
        dialog.show();
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