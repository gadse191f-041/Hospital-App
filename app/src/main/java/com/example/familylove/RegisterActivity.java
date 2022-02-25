package com.example.familylove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.familylove.dao.DaoNewUser;
import com.example.familylove.model.NewUser;
import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button btnNext=(Button) findViewById(R.id.btnNext);
        TextInputEditText txtName=(TextInputEditText)findViewById(R.id.txtName);
        TextInputEditText txtNic=(TextInputEditText)findViewById(R.id.txtNic);
        TextInputEditText txtAddress=(TextInputEditText)findViewById(R.id.txtAddress);
        TextInputEditText txtTelephone=(TextInputEditText)findViewById(R.id.txtTelephone);

        DaoNewUser daoNewUser=new DaoNewUser();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewUser newUser=new NewUser(txtName.getText().toString(),txtNic.getText().toString(),txtAddress.getText().toString(),txtTelephone.getText().toString());
                daoNewUser.add(newUser).addOnSuccessListener(suc->
                {
                    Toast.makeText(getApplicationContext(),"New User Added!",Toast.LENGTH_SHORT).show();
                }).addOnFailureListener(er->{
                    Toast.makeText(getApplicationContext(),""+er.getMessage(),Toast.LENGTH_SHORT).show();
                });

                Intent intent=new Intent(RegisterActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}