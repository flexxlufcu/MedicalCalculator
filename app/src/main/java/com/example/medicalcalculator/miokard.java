package com.example.medicalcalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class miokard extends AppCompatActivity {

    double mgpd, kdr, tzslgd;
    static double result;
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

    public void info3(View v){
        showInfo("Масса миокарда — это вес сердечной мышцы, выраженный в граммах и рассчитанный посредством данных ультразвукового исследования. Эта величина характеризует многие патологические процессы, и ее изменение, обычно в сторону увеличения, может говорить о неблагоприятном прогнозе течения патологии и повышенном риске серьезных осложнений.\n" +
                "индекс массы миокарда ЛЖ: мужской – от 71 до 94 г/м 2 , женский – от 71 от 89 г/м 2 ; конечный диастолический размер (КДР)/КСР (конечный систолический размер): 46–57,1 мм/ 31–43 мм, соответственно; стенка ЛЖ по толщине в расслаблении (диастоле) – до 1,1 см; выброс крови при сокращении (ФБ) – 55–60%;");
    }

    private void showInfo(String text){
        AlertDialog.Builder builder = new AlertDialog.Builder(miokard.this);
        builder.setTitle("Справка")
                .setMessage(text)
                .setCancelable(true);
        AlertDialog dialog = builder.create();
        dialog.show();
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
        Intent intent = new Intent(this, list_of_calculators.class);
        startActivity(intent);
    }

    public void toGlstr3(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}