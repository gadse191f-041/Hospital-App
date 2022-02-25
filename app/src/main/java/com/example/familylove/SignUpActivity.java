package com.example.familylove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.familylove.dao.DaoUser;
import com.example.familylove.model.NewUser;
import com.example.familylove.model.User;
import com.google.android.material.textfield.TextInputEditText;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button btnSignUp=(Button) findViewById(R.id.btnSigunUp);
        TextInputEditText txtUsername=(TextInputEditText)findViewById(R.id.txtUsername);
        TextInputEditText txtPassword=(TextInputEditText)findViewById(R.id.txtPassword);
        DaoUser daoUser=new DaoUser();

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user=new User(txtUsername.getText().toString(),txtPassword.getText().toString());
                daoUser.add(user).addOnSuccessListener(suc->
                {
                    Toast.makeText(getApplicationContext(),"User Details Added!",Toast.LENGTH_SHORT).show();
                }).addOnFailureListener(er->{
                    Toast.makeText(getApplicationContext(),""+er.getMessage(),Toast.LENGTH_SHORT).show();
                });

                Intent intent=new Intent(SignUpActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}