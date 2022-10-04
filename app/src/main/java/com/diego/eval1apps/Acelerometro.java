package com.diego.eval1apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class Acelerometro extends AppCompatActivity {

    private SensorManager sensorManager;
    private Sensor sensor;
    TextView textX, textY, textZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acelerometro);
        setTitle("Sensor Acelerómetro");
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        textX = findViewById(R.id.aclX);
        textY = findViewById(R.id.aclY);
        textZ = findViewById(R.id.aclZ);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
    }

    public void onResume() {
        super.onResume();
        sensorManager.registerListener(sensorEventListener, sensor, SensorManager.SENSOR_DELAY_FASTEST);

    }

    public void onStop(){
        super.onStop();
        sensorManager.unregisterListener(sensorEventListener);
    }

    public SensorEventListener sensorEventListener = new SensorEventListener() {
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