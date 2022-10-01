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
        Intent intent = new Intent(this, Parameters.class);
        startActivity(intent);
    }
}