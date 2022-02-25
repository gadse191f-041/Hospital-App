package com.example.familylove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.example.familylove.dao.DaoMail;
import com.example.familylove.model.Mail;
import com.example.familylove.model.User;
import com.google.android.material.textfield.TextInputEditText;

public class MailUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_us);

        Button btnSend=(Button) findViewById(R.id.btnSend);
        TextInputEditText txtUsername=(TextInputEditText)findViewById(R.id.txtUsernameMail);
        TextInputEditText txtMessage=(TextInputEditText)findViewById(R.id.txtMessage);
        DaoMail daoMail=new DaoMail();


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Mail mail=new Mail(txtUsername.getText().toString(),txtMessage.getText().toString());
                daoMail.add(mail).addOnSuccessListener(suc->
                {
                    Toast.makeText(getApplicationContext(),"Message Sent",Toast.LENGTH_SHORT).show();

                }).addOnFailureListener(er->{
                    Toast.makeText(getApplicationContext(),""+er.getMessage(),Toast.LENGTH_SHORT).show();
                });

                Intent intentDashboard=new Intent(MailUsActivity.this,DashboardActivity.class);
                startActivity(intentDashboard);
            }
        });
    }
}