package com.example.jangwoo.demoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LeakDemoTwoActivity extends AppCompatActivity {


    private static View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak_demo_two);

        view = findViewById(R.id.leak_demo_two_title_textView);

    }
}
