package com.diego.eval1apps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ParametersResult extends AppCompatActivity {
    private EditText edtParam1, edtParam2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parameters_result);
        setTitle("Parámetros");
        Bundle extras = getIntent().getExtras();

        String param1 = extras.getString("param1");
        String param2 = extras.getString("param2");

        edtParam1 = findViewById(R.id.edtParamResult1);
        edtParam2 = findViewById(R.id.edtParamResult2);

        edtParam1.setText(param1);
        edtParam2.setText(param2);
    }
}