package com.example.familylove;

import androidx.appcompat.app.AppCompatActivity;


import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN=2500;

    //variables
    Animation topAnimation,bottomAnimation;
    ImageView imageView;
    TextView logo,slogon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Animations
        topAnimation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation=AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //Hooks
        imageView=findViewById(R.id.imageView);
        logo=findViewById(R.id.textView);
        slogon=findViewById(R.id.textView2);

        //Assign Animations
        imageView.setAnimation(topAnimation);
        logo.setAnimation(bottomAnimation);
        slogon.setAnimation(bottomAnimation);

        //go to login
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
//                startActivity(intent);
//                finish();
                Pair[] pairs=new Pair[2];
                pairs[0]=new Pair<View,String>(imageView,"imgLogo");
                pairs[1]=new Pair<View,String>(imageView,"txtLogo");

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                    startActivity(intent,options.toBundle());
                }
            }
        },SPLASH_SCREEN);
    }
}