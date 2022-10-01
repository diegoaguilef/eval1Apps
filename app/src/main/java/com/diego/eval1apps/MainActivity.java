package com.diego.eval1apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.diego.eval1apps.DTOs.UserDTO;
import com.diego.eval1apps.models.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtName, edtPassword;
    public static final String MENU = "com.diego.eval1apps.Menu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        UserDTO.initUsers();
    }

    private void clear(){
        edtPassword.setText("");
        edtName.setText("");
    }

    public void login(View view) {
        String username = edtName.getText().toString();
        String password = edtPassword.getText().toString();

        User user = new User(username, password);
        if(!username.equals("") || !password.equals("")){
            if(UserDTO.isValid(user)){
                Intent intent = new Intent(this, Menu.class);
                startActivity(intent);
            }else{
                clear();
                Toast.makeText(this, "Credenciales invalidas", Toast.LENGTH_LONG).show();
            }
        }else{
            Toast.makeText(this, "Debe ingresar todos los campos", Toast.LENGTH_LONG).show();
        }
    }

}