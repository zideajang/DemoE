package com.example.jangwoo.demoe.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jangwoo.demoe.R;
import com.example.jangwoo.demoe.models.Tut;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SimpleRVAdapter extends RecyclerView.Adapter<SimpleRVAdapter.SimpleViewHolder>{

    List<Tut> tutList;

    public SimpleRVAdapter(List<Tut> tutList) {
        this.tutList = tutList;
    }

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_item, parent, false);

        SimpleViewHolder viewHolder = new SimpleViewHolder(v);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        holder.titleTextView.setText(tutList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return tutList == null ? 0: tutList.size();
    }

    public static class SimpleViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.simple_item_title_textView)
        TextView titleTextView;

        public SimpleViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
