package com.diego.eval1apps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class Spinner extends AppCompatActivity {

    private EditText edtSpinnerValue;
    private TableLayout tblValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        setTitle("Spinners");
        edtSpinnerValue = findViewById(R.id.edtSpinnerValue);
        tblValues = findViewById(R.id.tblValues);
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

    public void addValue(View view) {
        //Obtengo valor del input
        String value = edtSpinnerValue.getText().toString();
        if(!value.equals("")){
            addValueToTable(value);
        }else{
            Toast.makeText(this, "Debe ingresar un valor", Toast.LENGTH_LONG).show();
        }
    }
}