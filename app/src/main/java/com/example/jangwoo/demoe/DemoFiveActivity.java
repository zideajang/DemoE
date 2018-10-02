package com.example.jangwoo.demoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.jangwoo.demoe.adapters.TutAdapter;
import com.example.jangwoo.demoe.models.Tut;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DemoFiveActivity extends AppCompatActivity {

    @BindView(R.id.demo_five_listview)
    ListView listView;

    @BindView(R.id.demo_five_textView)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_five);

        ButterKnife.bind(this);

        textView.setVisibility(View.GONE);

        listView.setAdapter(new TutAdapter(getData(),this));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText(getData().get(i).getTitle());
                textView.setVisibility(View.VISIBLE);
            }
        });

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
        list.add(new Tut("kotlin"));

        return list;
    }

}
