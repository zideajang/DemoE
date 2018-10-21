package com.example.jangwoo.demoe;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LeakDemoOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak_demo_one);
    }

    Bitmap createSignaturedBitmap(int width, int height){
        return Bitmap.createBitmap(width,height, Bitmap.Config.ALPHA_8);
    }
}
