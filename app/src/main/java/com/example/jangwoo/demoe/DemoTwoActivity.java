package com.example.jangwoo.demoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DemoTwoActivity extends AppCompatActivity {

//    @BindView(R.id.demo_two_toolbar)
//    Toolbar toolbar;

    @BindView(R.id.demo_two_expanded_imageView)
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_two);

        ButterKnife.bind(this);
//        setSupportActionBar(toolbar);

        Picasso.get()
                .load("http://click-labs.com/wp-content/uploads/2014/05/nodejs_logo_green.jpg")
                .into(imageView);

    }
}
