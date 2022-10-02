package com.diego.eval1apps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class SensorDevice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("SensorDivice");
        setContentView(R.layout.activity_sensor_device);

    }
    public void Lista(View view){
        Intent intent = new Intent(this, SensorsList.class);
        startActivity(intent);
    }

    public void Giroscopio(View view){
        Intent intent = new Intent(this, Gyroscope.class);
        startActivity(intent);
    }

    public void Luz(View view){
        Intent intent = new Intent(this, Light.class);
        startActivity(intent);
    }

    public void Acelerometro(View view){
        Intent intent = new Intent(this, Acelerometro.class);
        startActivity(intent);
    }

}