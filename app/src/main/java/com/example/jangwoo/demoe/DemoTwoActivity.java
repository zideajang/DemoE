package com.example.jangwoo.demoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DemoTwoActivity extends AppCompatActivity {

    @BindView(R.id.demo_two_toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_two);

        ButterKnife.bind(this);
        setSupportActionBar(toolbar);



    }
}
