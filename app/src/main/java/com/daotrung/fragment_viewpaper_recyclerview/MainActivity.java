package com.daotrung.fragment_viewpaper_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout ;
    private ViewPager viewPager ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tbl_main);
        viewPager = findViewById(R.id.vpg_main);

        VPaperAdapter vPaperAdapter = new VPaperAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vPaperAdapter.addFragment(new tab_entertain(),"Entertainment");
        vPaperAdapter.addFragment(new tab_sports(),"Sports");
        vPaperAdapter.addFragment(new tab_economy(),"Economy");

        viewPager.setAdapter(vPaperAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}