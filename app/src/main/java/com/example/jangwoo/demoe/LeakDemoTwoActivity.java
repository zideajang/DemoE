package com.example.jangwoo.demoe;

import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LeakDemoTwoActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak_demo_two);
        new MyAsyncTask().execute();
    }

    private class MyAsyncTask extends AsyncTask{

        @Override
        protected Object doInBackground(Object[] objects) {
            return doSomeStuff();
        }

        private Object doSomeStuff(){
            return new Object();
        }
    }
}
