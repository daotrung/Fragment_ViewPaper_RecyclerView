package com.daotrung.fragment_viewpaper_recyclerview;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class tab_sports extends Fragment {
    ArrayList<NewsMode> arrayList = new ArrayList<>();
    RecyclerView recyclerView ;
    MyNewsAdapter adapter ;
    Context context ;

    public tab_sports(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       return inflater.inflate(R.layout.fragment_tab_entertain, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.context = getContext();
        recyclerView = view.findViewById(R.id.rv_main);
        addData();
        adapter = new MyNewsAdapter(arrayList,context);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        arrayList.add(new NewsMode(R.drawable.img_bd_1,"Bong da 1"));
        arrayList.add(new NewsMode(R.drawable.img_bd_2,"Bong da 2"));
        arrayList.add(new NewsMode(R.drawable.img_bd_3,"Bong da 3"));
        arrayList.add(new NewsMode(R.drawable.img_bd_4,"Bong da 4"));
        arrayList.add(new NewsMode(R.drawable.img_gt_2,"Bong da 5"));
        arrayList.add(new NewsMode(R.drawable.img_gt_4,"Bong da 6"));
    }
}