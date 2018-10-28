package com.example.jangwoo.demoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.jangwoo.demoe.demos.User;
import com.example.jangwoo.demoe.statereactive.UserManager;
import com.example.jangwoo.demoe.statereactive.UserManagerImpl;

import java.io.IOException;

import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Cancellable;
import io.reactivex.functions.Consumer;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RxDemoOneActivity extends AppCompatActivity {

    private  Call mCall;
    private static final String TAG = "RxDemoOneActivity";


    private View paintView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_demo_one);

        UserManager um = new UserManagerImpl();

        TextView textView = findViewById(R.id.rx_demo_username_textView);
        textView.setText(um.getUser().toString());

        um.setName("zidea", new UserManager.Listener() {
            @Override
            public void success(User user) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if(isDestroyed()){
                            textView.setText(um.getUser().toString());
                        }
                    }
                });

            }

            @Override
            public void failure(IOException e) {
                Log.d(TAG, "failure: " + e.getMessage());
            }
        });




        Observable observableHello = Observable.just("hell");

        Observable observableRange = Observable.range(0,10);

        Completable completable = observableRange.ignoreElements();
        Single single = observableRange.first(null);

        OkHttpClient client = new OkHttpClient();
        Request.Builder builder = new Request.Builder()
                .url("https://api.github.com/users/zideajang");

        builder.method("GET",null);
        Request request = builder.build();

        mCall = client.newCall(request);

        Disposable callDispoble = Observable.create(new ObservableOnSubscribe<String>() {

            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {

                emitter.setCancellable(new Cancellable() {
                    @Override
                    public void cancel() throws Exception {
                        mCall.cancel();
                    }
                });

                mCall.enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {

                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        emitter.onNext(response.body().string());
                    }
                });
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                Log.d(TAG, "accept: " + s);
            }
        });


        Disposable disposable = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {

            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {

            }
        });



        Disposable disposableOne = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> emitter) {
                emitter.onNext("Hello");
                emitter.onComplete();
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {

            }
        });
    }
}
