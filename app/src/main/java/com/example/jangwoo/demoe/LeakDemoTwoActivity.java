package com.example.jangwoo.demoe;

import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.lang.ref.WeakReference;

public class LeakDemoTwoActivity extends AppCompatActivity implements Singleton.Callback{




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak_demo_two);
//        new MyAsyncTask(this).execute();
        Singleton.getInstance().setCallback(this);
    }

    @Override
    public void callback() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Singleton.getInstance().setCallback(null);
    }

    private static class MyAsyncTask extends AsyncTask{

        private WeakReference<LeakDemoTwoActivity> leakDemoTwoActivityWeakReference;

        public MyAsyncTask(LeakDemoTwoActivity leakDemoTwoActivityWeakReference) {
            this.leakDemoTwoActivityWeakReference = new WeakReference<>(leakDemoTwoActivityWeakReference);
        }

        @Override
        protected Object doInBackground(Object[] objects) {
            return doSomeStuff();
        }

        private Object doSomeStuff(){
            return new Object();
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
            if(leakDemoTwoActivityWeakReference.get() != null){

            }
        }
    }
}
