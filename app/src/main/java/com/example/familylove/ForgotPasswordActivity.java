package com.example.familylove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.familylove.dao.DaoUser;
import com.google.android.material.textfield.TextInputEditText;

import java.util.HashMap;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        Button btnConfirm=(Button) findViewById(R.id.btnConfirm);
        TextInputEditText txtNewPassword=(TextInputEditText)findViewById(R.id.txtNewPassword);
        DaoUser daoUser=new DaoUser();

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HashMap<String,Object>hashMap=new HashMap<>();
                hashMap.put("password",txtNewPassword.getText().toString());
                daoUser.update("-MvfqnuEJchV6cSM_rit",hashMap).addOnSuccessListener(suc->
                {
                    Toast.makeText(getApplicationContext(),"Password Updated",Toast.LENGTH_SHORT).show();
                }).addOnFailureListener(er->{
                    Toast.makeText(getApplicationContext(),""+er.getMessage(),Toast.LENGTH_SHORT).show();
                });

                Intent intent=new Intent(ForgotPasswordActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}