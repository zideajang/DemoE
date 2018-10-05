package com.example.jangwoo.demoe;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.jangwoo.demoe.adapters.SimpleRVAdapter;
import com.example.jangwoo.demoe.models.Tut;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DemoEightActivity extends AppCompatActivity {

    @BindView(R.id.demo_eight_recyclerView)
    RecyclerView recyclerView;

    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_eight);

        linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        ButterKnife.bind(this);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new SimpleRVAdapter(getData()));

    }

    private List<Tut> getData(){

        List<Tut> list = new ArrayList<Tut>();
        list.add(new Tut("java"));
        list.add(new Tut("list"));
        list.add(new Tut("haskell"));
        list.add(new Tut("cpp"));
        list.add(new Tut("javascript"));
        list.add(new Tut("rust"));
        list.add(new Tut("typescript"));
        list.add(new Tut("c"));
        list.add(new Tut("cshap"));
        list.add(new Tut("scala"));
        list.add(new Tut("R"));
        list.add(new Tut("List"));
        list.add(new Tut("golang"));
        list.add(new Tut("coffee"));
        list.add(new Tut("c"));
        list.add(new Tut("python"));
        list.add(new Tut("php"));

        return list;
    }

    @OnClick(R.id.demo_eight_fab)
    public void clickOnTab(View view){
        Snackbar.make(view, "That Was Easy…", Snackbar.LENGTH_SHORT).show();
    }
}
