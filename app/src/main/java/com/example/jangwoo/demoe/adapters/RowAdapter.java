package com.example.jangwoo.demoe.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jangwoo.demoe.R;
import com.example.jangwoo.demoe.models.ListItem;

import java.util.List;
import java.util.zip.Inflater;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RowAdapter extends BaseAdapter {

    List<ListItem> mList;
    private LayoutInflater mInflater = null;

    public RowAdapter(Context context,List<ListItem> mList) {
        this.mList = mList;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mList.size();
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
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ViewHolder holder = null;



        if(convertView == null)
        {
            convertView = this.mInflater.inflate(R.layout.panel_list_item, null);
            holder = new ViewHolder(convertView);

            convertView.setTag(holder);
        }else
        {
            holder = (ViewHolder)convertView.getTag();
        }
        holder.leftTextView.setText(mList.get(position).getLeft());
        holder.rightTextView.setText(mList.get(position).getRight());

        return convertView;
    }

    static class ViewHolder{
        @BindView(R.id.panel_table_row_left_textView)
        TextView leftTextView;
        @BindView(R.id.panel_table_row_right_textVew)
        TextView rightTextView;
        ViewHolder(View view){
            ButterKnife.bind(this,view);
        }

    }
}
