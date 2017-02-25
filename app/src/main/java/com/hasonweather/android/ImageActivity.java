package com.hasonweather.android;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class ImageActivity extends AppCompatActivity {
private final int SPLASH_DISPLAY_LENGHT=2000;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_image);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(ImageActivity.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.alpha_in,R.anim.alpha_exit);
                ImageActivity.this.finish();
            }
        },SPLASH_DISPLAY_LENGHT);
    }
    /*private Handler mMainHandler =new Handler(){
        @Override
        public void handleMessage(Message msg) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
intent.setClass(getApplication(),MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            overridePendingTransition(R.anim.alpha_in,R.anim.alpha_exit);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setBackgroundDrawableResource(R.drawable.start);
        mMainHandler.sendEmptyMessageDelayed(0,2000);*/
    }

