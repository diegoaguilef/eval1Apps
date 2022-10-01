package com.diego.eval1apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Parameter extends AppCompatActivity {
    private EditText edtParam1, edtParam2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parameters);
        setTitle("Paso de parámetros");
        edtParam1 = findViewById(R.id.edtParameter1);
        edtParam2 = findViewById(R.id.edtParameter2);
    }

    public void sendParametersResult(View view){
        Intent intent = new Intent(this, ParametersResult.class);
        String param1 = edtParam1.getText().toString();
        String param2 = edtParam2.getText().toString();
        intent.putExtra("param1", param1);
        intent.putExtra("param2", param2);
        startActivity(intent);
    }
}