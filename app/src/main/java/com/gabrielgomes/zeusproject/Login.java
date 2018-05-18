package com.gabrielgomes.zeusproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    private EditText user;
    private EditText senha;
    private Button login;
    private Button sing;
    private Button forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //caixas de texto
        user = (EditText) findViewById(R.id.txtUser);
        senha = (EditText) findViewById(R.id.txtPassword);

        //Buttons
        login = (Button) findViewById(R.id.btLogin);
        sing = (Button) findViewById(R.id.btSing);
        forgot = (Button) findViewById(R.id.btForgot);


        sing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent is = new Intent(Login.this, Sing.class);
                startActivity(is);
            }
        });
    }
}
