package com.example.lenovo.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecViewHolder> {
    private List<Data> datas;
    private Context mContext;
    public RecyclerAdapter(List<Data> datas,Context context) {
        this.datas = datas;
        mContext=context;
    }

    @NonNull
    @Override
    public RecViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item,viewGroup,false);
        return new RecViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecViewHolder recViewHolder, int i) {
        recViewHolder.title.setText(datas.get(i).getTitle());
        Glide.with(mContext).load(datas.get(i).getImageUrl()).into(recViewHolder.imageView);//??????
    }


    @Override
    public int getItemCount() {
        return datas.size();
    }

    class RecViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title;
        public RecViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            title=itemView.findViewById(R.id.title);
        }
    }
}
