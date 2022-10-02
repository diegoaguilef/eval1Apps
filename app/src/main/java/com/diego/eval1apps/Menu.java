package com.diego.eval1apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Menu");
        setContentView(R.layout.activity_menu);

    }

    public void parameters(View view){
        Intent intent = new Intent(this, Parameter.class);
        startActivity(intent);
    }

    public void spinners(View view){
        Intent intent = new Intent(this, Spinner.class);
        startActivity(intent);
    }

    public void sensores(View view){
        Intent intent = new Intent(this, SensorDevice.class);
        startActivity(intent);
    }


}