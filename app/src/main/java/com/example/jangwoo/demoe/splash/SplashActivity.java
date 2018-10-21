package com.example.jangwoo.demoe.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.example.jangwoo.demoe.R;
import com.example.jangwoo.demoe.adapters.RowAdapter;
import com.example.jangwoo.demoe.models.ListItem;

import org.xml.sax.XMLReader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {

    private static final String TAG = "SplashActivity";

    @BindView(R.id.splash_one_textview)
    TextView oneTextView;

    @BindView(R.id.splash_two_text)
    TextView twoTextView;

    @BindView(R.id.panel_list_listview)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ButterKnife.bind(this);

        String htmlStr = "hello <ztag>zidea</ztag> <ztag> tutorial</ztag>";
        String clickable = "文本内容/n 查看更多";


        oneTextView.setText(Html.fromHtml(htmlStr,Html.FROM_HTML_MODE_LEGACY,null,new ZTagHandler()));
        twoTextView.setText(clickable);

        List<ListItem> listItems = new ArrayList<>();
        String leftStr = "名称" + "江南甲第";
        String rightStr = "地址" + "沈北新区";

        SpannableString letfSbStr = new SpannableString(leftStr);
        SpannableString rightSbStr = new SpannableString(rightStr);

        listItems.add(new ListItem(letfSbStr,rightSbStr));

        listView.setAdapter(new RowAdapter(getApplicationContext(),listItems));

    }

    private static class ZTagHandler implements Html.TagHandler{


        @Override
        public void handleTag(boolean isOpen, String tagName, Editable output, XMLReader xmlReader) {
            //先判断一下 tag 是不是我们需要的 tag
            if(!"ztag".equalsIgnoreCase(tagName)){
                return;
            }
            Log.d(TAG, "handleTag: " + tagName);
            Log.d(TAG, "handleTag: " + isOpen);
            Log.d(TAG, "handleTag: " + output);
            Log.d(TAG, "handleTag: " + output.length());
            int len = output.length();

            if (isOpen) {
                output.setSpan(new ZTagSpan(), len, len, Spannable.SPAN_MARK_MARK);
            } else {
                Object obj = getLast(output, ZTagSpan.class);
                int where = output.getSpanStart(obj);

                output.removeSpan(obj);

                if (where != len) {
                    output.setSpan(new ZTagSpan(), where, len, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                }
            }

        }

        private Object getLast(Editable text, Class kind) {

            //获取 span 注意这里不是标签而是 span 也就是要查找下一个
            Object[] objs = text.getSpans(0, text.length(), kind);

            Log.d(TAG, "getLast: " + objs.length);

            if (objs.length == 0) {
                return null;
            } else {
                for (int i = objs.length - 1; i >= 0; --i) {
                    //判断 span 的类型
                    if(text.getSpanFlags(objs[i]) == Spannable.SPAN_MARK_MARK) {
                        return objs[i];
                    }
                }
                return null;
            }
        }
    }

    private static class ZTagSpan extends MetricAffectingSpan{

        @Override
        public void updateMeasureState(TextPaint textPaint) {
            textPaint.setTextScaleX(1.2f);
            textPaint.setARGB(255,255,0,0);
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setTextScaleX(1.2f);
            textPaint.setARGB(255,255,0,0);

        }
    }
}
