package com.example.jangwoo.demoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.jangwoo.demoe.adapters.SimpleRVAdapter;
import com.example.jangwoo.demoe.models.Tut;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;

public class DemoThreeActivity extends AppCompatActivity {

//    @BindView(R.id.demo_three_recyclerview)
//    RecyclerView recyclerView;

    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("hello");

        RecyclerView recyclerView = new RecyclerView(this);

//        setContentView(R.layout.activity_demo_three);
        linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false);

        List<Tut> tutList = Arrays.asList(new Tut("java"),new Tut("angularjs"), new Tut("okhttp"));

        recyclerView.setLayoutManager(linearLayoutManager);
        setContentView(recyclerView);
        recyclerView.setAdapter(new SimpleRVAdapter(tutList));


    }
}
