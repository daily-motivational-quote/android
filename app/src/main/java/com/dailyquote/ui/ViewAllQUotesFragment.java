package com.dailyquote.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dailyquote.MyRecyclerViewAdapter;
import com.dailyquote.R;
import com.dailyquote.network.DailyQuoteApplication;
import com.dailyquote.network.Quote;

import java.util.ArrayList;

public class ViewAllQUotesFragment extends Fragment {

    public ViewAllQUotesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view  = inflater.inflate(R.layout.fragment_view_all_quotes, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(DailyQuoteApplication.getStaticContext());
        recyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        RecyclerView.Adapter mAdapter = new MyRecyclerViewAdapter(new ArrayList<Quote>());
        recyclerView.setAdapter(mAdapter);

        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
