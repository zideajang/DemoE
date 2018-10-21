package com.example.jangwoo.demoe;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

public class App extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        //调用LeakCanary.install()的方法来进行必要的初始化工作，来监听内存泄漏。
        LeakCanary.install(this);

    }
}
