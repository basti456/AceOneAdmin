package com.ads.web.one.aceoneadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class ApproveLoanActivity extends AppCompatActivity {
    TabLayout tab;
    ViewPager viewPager;
    AdapterApproveLoan adapterApproveLoan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_approve_loan);
        //link XML components
        tab = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
        adapterApproveLoan = new AdapterApproveLoan(getSupportFragmentManager());
        //set the adapter
        viewPager.setAdapter(adapterApproveLoan);
        //used to sync tab layout with view pager
        tab.setupWithViewPager(viewPager);
    }
}