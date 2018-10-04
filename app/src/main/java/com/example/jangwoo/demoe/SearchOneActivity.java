package com.example.jangwoo.demoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchOneActivity extends AppCompatActivity {

    @BindView(R.id.search_one_autoCompleteTV)
    AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_one);

        ButterKnife.bind(this);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, getData());


        autoCompleteTextView.setAdapter(arrayAdapter);


    }

    private String[] getData(){
        return new String[] { "javascript", "java","nodejs", "python", "cpp","android" };
    }
}
