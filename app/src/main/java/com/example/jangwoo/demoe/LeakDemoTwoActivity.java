package com.example.jangwoo.demoe;

import android.app.FragmentManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.jangwoo.demoe.fragments.AFragment;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LeakDemoTwoActivity extends AppCompatActivity {

    private static final String COMMON_TAG = "common";
    private static final String TAG = "LeakDemoTwoActivity";


    @BindView(R.id.leak_demo_two_title_textView)
    TextView titleTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak_demo_two);


        Log.d(TAG, "onCreate: ");
        ButterKnife.bind(this);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.leak_demo_two_frameLayout,new AFragment());
        transaction.commit();

        String tag = "应用\t前端\t编程";

        String tagOne = "前端web";
        String tagTwo = "移动";
        String tagThree = "研发";

        List<String> tagStrList = new ArrayList<>();
        tagStrList.add(tagOne);
        tagStrList.add(tagTwo);
        tagStrList.add(tagThree);

        String tagStr = "";

        for(int i = 0; i < tagStrList.size();i++){
            if(i != (tagStrList.size() - 1)){
                tagStr += "x" + tagStrList.get(i) + "x\t";
            }else {
                tagStr += "x" + tagStrList.get(i) + "x";
            }
        }

        Log.d(TAG, "onCreate: " + tagStr);

//        String tagStr = tagOne + "\t" + tagTwo + "\t" + tagThree + "\t";


        SpannableString spannableString = new SpannableString(tagStr);

        for(int i = 0; i < tagStrList.size(); i++){
            String tagItem = tagStrList.get(i);
            int start = tagStr.indexOf(tagItem);
            int end = start  + tagTwo.length();
            spannableString.setSpan(new BackgroundColorSpan(Color.parseColor("#00ff00")),(start -1),(end+1),0);

            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#00ff00")),(start-1),start,0);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#00ff00")),end,end+1,0);
        }

        titleTextView.setText(spannableString);

//        new MyAsyncTask(this).execute();
        Singleton.getInstance().setCallback(new Singleton.Callback() {
            @Override
            public void callback() {

            }
        });
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
