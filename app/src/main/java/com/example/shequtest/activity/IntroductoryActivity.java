package com.example.shequtest.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.shequtest.R;

public class IntroductoryActivity extends AppCompatActivity{

    ImageView logo,appName,splashImg;
    LottieAnimationView lottieAnimationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lntroductory_activiity);
        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.app_name);
        splashImg = findViewById(R.id.img);
        lottieAnimationView = findViewById(R.id.lottie);

        splashImg.animate().translationY(-2200).setDuration(1000).setStartDelay(4000);
        appName.animate().translationY(1600).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(2100).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1600).setDuration(1000).setStartDelay(4000);

        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(4845);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                ivit();
            }
        };
        thread.start();
    }

    public void ivit(){
        Intent intent = new Intent(IntroductoryActivity.this,IntroductoryActivity1.class);
        startActivity(intent);
//        finish();
    }
}