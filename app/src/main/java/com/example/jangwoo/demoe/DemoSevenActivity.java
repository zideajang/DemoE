package com.example.jangwoo.demoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.compiler.TutDemo;
import com.example.jangwoo.demoe.auto.TutZidea;
import com.example.jangwoo.demoe.models.Tut;

@TutDemo(
        name = "Tut",
        text = "welcome "
)
public class DemoSevenActivity extends AppCompatActivity {

    private static final String TAG = "DemoSevenActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_seven);

        TutZidea zidea = new TutZidea();


        Log.d(TAG, "onCreate: " + zidea.getMessage());
    }
}
