package com.example.familylove;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class DoctorAppointmentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_appointment);

        RelativeLayout rlDoctor1= (RelativeLayout) findViewById(R.id.rlDoctor1);
        RelativeLayout rlDoctor2= (RelativeLayout) findViewById(R.id.rlDoctor2);
        RelativeLayout rlDoctor3= (RelativeLayout) findViewById(R.id.rlDoctor3);
        RelativeLayout rlDoctor4= (RelativeLayout) findViewById(R.id.rlDoctor4);
        RelativeLayout rlDoctor5= (RelativeLayout) findViewById(R.id.rlDoctor5);
        RelativeLayout rlDoctor6= (RelativeLayout) findViewById(R.id.rlDoctor6);
        RelativeLayout rlDoctor7= (RelativeLayout) findViewById(R.id.rlDoctor7);
        RelativeLayout rlDoctor8= (RelativeLayout) findViewById(R.id.rlDoctor8);
        RelativeLayout rlDoctor9= (RelativeLayout) findViewById(R.id.rlDoctor9);
        RelativeLayout rlDoctor10= (RelativeLayout) findViewById(R.id.rlDoctor10);
        RelativeLayout rlDoctor11= (RelativeLayout) findViewById(R.id.rlDoctor11);
        RelativeLayout rlDoctor12= (RelativeLayout) findViewById(R.id.rlDoctor12);
        RelativeLayout rlDoctor13= (RelativeLayout) findViewById(R.id.rlDoctor13);

        ImageView btnBack= (ImageView) findViewById(R.id.btnBack);

        rlDoctor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Your Appointment Added",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Be On Time",Toast.LENGTH_SHORT).show();
                displayDashboard();
            }
        });
        rlDoctor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Your Appointment Added",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Be On Time",Toast.LENGTH_SHORT).show();
                displayDashboard();
            }
        });
        rlDoctor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Your Appointment Added",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Be On Time",Toast.LENGTH_SHORT).show();
                displayDashboard();
            }
        });
        rlDoctor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Your Appointment Added",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Be On Time",Toast.LENGTH_SHORT).show();
                displayDashboard();
            }
        });
        rlDoctor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Your Appointment Added",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Be On Time",Toast.LENGTH_SHORT).show();
                displayDashboard();
            }
        });
        rlDoctor6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Your Appointment Added",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Be On Time",Toast.LENGTH_SHORT).show();
                displayDashboard();
            }
        });
        rlDoctor7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Your Appointment Added",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Be On Time",Toast.LENGTH_SHORT).show();
                displayDashboard();
            }
        });
        rlDoctor8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Your Appointment Added",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Be On Time",Toast.LENGTH_SHORT).show();
                displayDashboard();
            }
        });
        rlDoctor9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Your Appointment Added",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Be On Time",Toast.LENGTH_SHORT).show();
                displayDashboard();
            }
        });
        rlDoctor10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Your Appointment Added",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Be On Time",Toast.LENGTH_SHORT).show();
                displayDashboard();
            }
        });
        rlDoctor11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Your Appointment Added",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Be On Time",Toast.LENGTH_SHORT).show();
                displayDashboard();
            }
        });
        rlDoctor12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Your Appointment Added",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Be On Time",Toast.LENGTH_SHORT).show();
                displayDashboard();
            }
        });
        rlDoctor13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Your Appointment Added",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Be On Time",Toast.LENGTH_SHORT).show();
                displayDashboard();
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDashboard();
            }
        });
    }
    public void displayDashboard(){
        Intent intent=new Intent(DoctorAppointmentActivity.this,DashboardActivity.class);
        startActivity(intent);
    }
}