package com.daotrung.fragment_viewpaper_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyNewsAdapter  extends RecyclerView.Adapter<MyNewsAdapter.MyViewHolder> {
    public List<NewsMode> newsModeList ;
    public Context mcontext ;

    public MyNewsAdapter(List<NewsMode> newsModeList, Context mcontext) {
        this.newsModeList = newsModeList;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_dong,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        NewsMode newsMode = newsModeList.get(position);
        holder.name.setText(newsMode.getName());
        holder.img.setImageResource(newsMode.getImg());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView img ;
        public TextView name ;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.name_main);
        }
    }

}
