package com.dailyquote;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.dailyquote.ui.QuoteFragment;
import com.dailyquote.ui.ViewAllQUotesFragment;

import java.util.ArrayList;

/**
 * Created by stoyan-ivanov on 15.09.17.
 */

public class QuoteActivity extends FragmentActivity {
    String currDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);

        currDate = getIntent().getStringExtra("currentDate");

        ViewPager pager = (ViewPager) findViewById(R.id.view_pager);
        FragmentPagerAdapter fragmentPagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), getFragments());
        pager.setAdapter(fragmentPagerAdapter);
    }

    private ArrayList<Fragment> getFragments() {
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(QuoteFragment.newInstance(currDate));
        fragments.add(ViewAllQUotesFragment.newInstance());

        return fragments;
    }
}
