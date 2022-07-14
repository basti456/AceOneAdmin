package com.ads.web.one.aceoneadmin;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;


public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        TabLayout tab = view.findViewById(R.id.tab_layout);
        ViewPager viewPager = view.findViewById(R.id.view_pager);
        assert getFragmentManager() != null;
        AdapterDetails viewPagerLoanDetailsAdapter = new AdapterDetails(getFragmentManager());
        viewPager.setAdapter(viewPagerLoanDetailsAdapter);
        //used to sync tab layout with view pager
        tab.setupWithViewPager(viewPager);
        return view;

    }
}