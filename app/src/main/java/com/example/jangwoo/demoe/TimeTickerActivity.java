package com.example.jangwoo.demoe;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.jangwoo.demoe.splash.SplashActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TimeTickerActivity extends AppCompatActivity {


    private final String TAG = "ActivityLifecycle" + this.getClass().getSimpleName();

    @BindView(R.id.time_ticker_button)
    Button incrementBtn;
    @BindView(R.id.time_ticker_textView)
    TextView counterTextView;


    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_ticker);


        ButterKnife.bind(this);
        counterTextView.setText(String.valueOf(count));

        if(savedInstanceState != null){
            int mCount = savedInstanceState.getInt("key_ticker_counter",0);
            Log.d(TAG, "onCreate: mCount=" + mCount);
            counterTextView.setText(mCount);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putInt("key_ticker_counter",count);
        Log.d(TAG, "onSaveInstanceState: ");
    }


    @OnClick(R.id.time_ticker_call_transulent_button)
    public void clickOnTransulentButton(){
        Intent intent = new Intent(this, TransparentActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.time_ticker_call_another_button)
    public void clickOnCallAnotherButton(){
        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.time_ticker_button)
    public void clickOnTimeTickerBtn(){
        counterTextView.setText(String.valueOf(++count));
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: ");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: ");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: ");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: ");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: ");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: ");
        super.onDestroy();
    }
}
