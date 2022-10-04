package com.diego.eval1apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.EditText;

public class Light extends AppCompatActivity {
    private SensorManager sensorManager;
    private Sensor sensor;
    private EditText edtLightValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luz);
        setTitle("Sensor de luz");
        edtLightValue = findViewById(R.id.edtLightValue);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
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
            float lux = event.values[0];
            edtLightValue.setText("lux: "+ lux);
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int i) {

        }
    };
}
