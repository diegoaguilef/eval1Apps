package com.diego.eval1apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.List;

public class SensorsList<sensorManager> extends AppCompatActivity {

    private SensorManager sensorManager;
    private TableLayout tblValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensors_list);
        tblValues = findViewById(R.id.tblValues);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> deviceSensors = sensorManager.getSensorList(Sensor.TYPE_ALL);
        for(Sensor sensor:deviceSensors){
            addValueToTable(sensor.getName());
        }
    }

    private void addValueToTable(String value){
        //Genero un row nuevo
        TableRow tr = new TableRow(this);
        tr.setLayoutParams(new TableLayout.LayoutParams(
                TableLayout.LayoutParams.MATCH_PARENT,
                TableLayout.LayoutParams.MATCH_PARENT));

        // Genero el dato del row
        TextView td = new TextView(this);

        //Agrego el valor AL DATO del row
        td.setText(value);

        //Agrego el DATO al ROW
        tr.addView(td);

        // Agrego row a al tabla
        tblValues.addView(tr);
    }

}