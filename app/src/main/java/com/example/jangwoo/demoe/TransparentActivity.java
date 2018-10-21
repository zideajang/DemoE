package com.example.jangwoo.demoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class TransparentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transparent);

        Window window=getWindow();
        WindowManager.LayoutParams wl = window.getAttributes();
        wl.flags= WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON;
        wl.alpha=0.6f;
        //这句就是设置窗口里崆件的透明度的．０.０全透明．１.０不透明．
        window.setAttributes(wl);

    }
}
