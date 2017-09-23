package com.dailyquote;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.dailyquote.ui.QuoteFragment;
import com.dailyquote.ui.ViewAllQUotesFragment;

import java.util.ArrayList;

/**
 * Created by stoyan-ivanov on 15.09.17.
 */

public class QuoteActivity extends FragmentActivity {
    private String currDate;
    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);

        currDate = getIntent().getStringExtra("currentDate");

        pager = (ViewPager) findViewById(R.id.view_pager);
        FragmentPagerAdapter fragmentPagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), getFragments());
        pager.setAdapter(fragmentPagerAdapter);
    }

    private ArrayList<Fragment> getFragments() {
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(QuoteFragment.newInstance(currDate));
        fragments.add(ViewAllQUotesFragment.newInstance());

        return fragments;
    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager =  getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);

        pager.setVisibility(View.GONE);
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        pager.setVisibility(View.VISIBLE);
    }
}
