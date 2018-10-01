package com.example.jangwoo.demoe;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Shader shader;
    private TextView gradientTextView;
    private TextView htmlTextView;

    @BindView(R.id.main_home_button)
    Button homeBtn;
    @BindView(R.id.main_app_toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textView = findViewById(R.id.main_app_name_textView);
        gradientTextView = findViewById(R.id.main_gradient_title_textView);
        htmlTextView = findViewById(R.id.main_html_textView);

        startAnimation(textView);

        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        shader = new LinearGradient(0,0,0,gradientTextView.getTextSize(), Color.RED,Color.BLUE,Shader.TileMode.CLAMP);
        gradientTextView.getPaint().setShader(shader);

        String html = getString(R.string.from_html_text);
        htmlTextView.setMovementMethod(LinkMovementMethod.getInstance());

        htmlTextView.setText(Html.fromHtml(html));

    }

    @OnClick(R.id.main_home_button)
    public void clickOnButton(){
        homeBtn.setEnabled(false);
    }

    private void startAnimation(TextView textView){
        Drawable[] drawables = textView.getCompoundDrawables();
        for(Drawable drawable : drawables){
            if(drawable != null && drawable instanceof Animatable){
                ((Animatable)drawable).start();
            }
        }
    }


}
