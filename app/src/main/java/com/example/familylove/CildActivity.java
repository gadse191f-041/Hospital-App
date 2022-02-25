package com.example.familylove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cild);

        TextView textVideo1=(TextView) findViewById(R.id.txtClick1);
        TextView textVideo2=(TextView) findViewById(R.id.txtClick2);
        TextView textVideo3=(TextView) findViewById(R.id.txtClick3);
        TextView textVideo4=(TextView) findViewById(R.id.txtClick4);
        TextView textVideo5=(TextView) findViewById(R.id.txtClick5);

        textVideo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent video1Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=dhpCdqOtuj0"));
                startActivity(video1Intent);
            }
        });
        textVideo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent video2Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=D5BtnvQqbWs"));
                startActivity(video2Intent);
            }
        });
        textVideo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent video3Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=YimuIdEZSNY"));
                startActivity(video3Intent);
            }
        });
        textVideo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent video4Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=EhfOZMOF9W4"));
                startActivity(video4Intent);
            }
        });
        textVideo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent video5Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=fojOMDS-PqI"));
                startActivity(video5Intent);
            }
        });
    }
}