package com.example.jangwoo.demoe.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.jangwoo.demoe.R;
import com.example.jangwoo.demoe.models.Tut;

import java.util.List;

public class TutAdapter extends BaseAdapter{

    List<Tut> mList;
    private LayoutInflater layoutInflater;

    public TutAdapter(List<Tut> mList, Context context) {
        this.mList = mList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mList == null ? 0:mList.size();
    }

    @Override
    public Object getItem(int i) {
        return mList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = layoutInflater.inflate(R.layout.simple_item,null);
        TextView titleView = view.findViewById(R.id.simple_item_title_textView);
        titleView.setText(mList.get(i).getTitle());

        return view;
    }


}
