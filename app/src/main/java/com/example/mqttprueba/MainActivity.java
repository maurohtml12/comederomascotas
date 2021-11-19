package com.example.mqttprueba;

import androidx.appcompat.app.AppCompatActivity;



import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private TextView tempo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tempo = findViewById(R.id.txttime);
    }
    public void horacomida(View View)
    {
        Calendar cal = Calendar.getInstance();
        int hora = cal.get(Calendar.HOUR_OF_DAY);
        int minutos = cal.get(Calendar.MINUTE);

        TimePickerDialog tpd = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hour, int minute) {

                String hora =  hour + ":" + minute;
                tempo.setText("horario de comida Programado : " + hora+ "horas");
            }
        },hora, minutos, true);
        tpd.show();

    }
    //comentario
}