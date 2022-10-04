package com.diego.eval1apps;

import static android.util.Half.EPSILON;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class Gyroscope extends AppCompatActivity {

    TextView textX, textY, textZ;
    SensorManager sensorManager;
    Sensor sensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giroscopio);
        setTitle("Sensor Giroscopio");
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);

        textX = findViewById(R.id.tvX);
        textY = findViewById(R.id.tvY);
        textZ = findViewById(R.id.tvZ);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
    }

    public void onResume() {
        super.onResume();
        sensorManager.registerListener(gyroListener, sensor, SensorManager.SENSOR_DELAY_FASTEST);

    }

    public void onStop(){
        super.onStop();
        sensorManager.unregisterListener(gyroListener);
    }

    public SensorEventListener gyroListener = new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent event) {
            float axisX = event.values[0];
            float axisY = event.values[1];
            float axisZ = event.values[2];
            textX.setText("X: "+ axisX);
            textY.setText("Y: "+ axisY);
            textZ.setText("Z: "+ axisZ);
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int i) {

        }
    };

}
