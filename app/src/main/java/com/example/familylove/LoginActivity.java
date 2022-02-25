package com.example.familylove;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.familylove.dao.DaoUser;
import com.example.familylove.model.User;
import com.google.android.material.textfield.TextInputEditText;

import java.util.HashMap;

public class LoginActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        Button btnSigunUp=(Button) findViewById(R.id.btnSigunUp);
        Button btnForgotPassword=(Button) findViewById(R.id.btnForgotPassword);
        Button btnLogin=(Button)findViewById(R.id.btnLogin);
        TextInputEditText txtLoginUserName=(TextInputEditText)findViewById(R.id.txtLoginUsername);
        TextInputEditText txtLoginPassword=(TextInputEditText)findViewById(R.id.txtLoginPassword);
        DaoUser daoUser=new DaoUser();


        btnSigunUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
        btnForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPassword=new Intent(LoginActivity.this,ForgotPasswordActivity.class);
                startActivity(intentPassword);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String usernameValue=txtLoginUserName.getText().toString();
                    String passwordValue=txtLoginPassword.getText().toString();
                    if (usernameValue.equals("hash") && passwordValue.equals("123")){
                        Intent intentPassword=new Intent(LoginActivity.this,DashboardActivity.class);
                        startActivity(intentPassword);
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Incorrect Username Or Password",Toast.LENGTH_SHORT).show();
                    }
            }
        });
    }
}