package com.example.jangwoo.demoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.example.jangwoo.demoe.adapters.SimpleRVAdapter;
import com.example.jangwoo.demoe.models.Tut;
import com.squareup.picasso.Picasso;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DemoTwoActivity extends AppCompatActivity {

    @BindView(R.id.demo_two_toolbar)
    Toolbar toolbar;

    @BindView(R.id.demo_two_expanded_imageView)
    ImageView imageView;

    @BindView(R.id.demo_two_recyclerview)
    RecyclerView recyclerView;

    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_two);

        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        List<Tut> tuts = Arrays.asList(
                new Tut("cpp"),
                new Tut("haskell"),
                new Tut("javascript"),
                new Tut("golang"),
                new Tut("java")
        );
        linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new SimpleRVAdapter(tuts));

        Picasso.get()
                .load("https://www.imaginea.com/design/wp-content/uploads/2016/08/Android-L-Material-Design-Wallpapers-5.png")
                .into(imageView);

    }
}
