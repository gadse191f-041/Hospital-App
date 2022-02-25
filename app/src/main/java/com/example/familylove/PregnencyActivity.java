package com.example.familylove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PregnencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregnency);

        TextView txtPreg1=(TextView) findViewById(R.id.txtPreg1);
        TextView txtPreg2=(TextView) findViewById(R.id.txtPreg2);
        TextView txtPreg3=(TextView) findViewById(R.id.txtPreg3);
        TextView txtPreg4=(TextView) findViewById(R.id.txtPreg4);
        TextView txtPreg5=(TextView) findViewById(R.id.txtPreg5);

        txtPreg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txtPreg1Video=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=BIbFyKmtpCQ"));
                startActivity(txtPreg1Video);
            }
        });
        txtPreg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txtPreg2Video=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=I6_Y1TtPGsI"));
                startActivity(txtPreg2Video);
            }
        });
        txtPreg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txtPreg3Video=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Qsm8ac4nLg0"));
                startActivity(txtPreg3Video);
            }
        });
        txtPreg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txtPreg4Video=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=mVlklWmEp5s"));
                startActivity(txtPreg4Video);
            }
        });
        txtPreg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txtPreg5Video=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=dYu-0rOnLpA"));
                startActivity(txtPreg5Video);
            }
        });
    }
}