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

    public static ViewAllQUotesFragment newInstance() {
        return new ViewAllQUotesFragment();
    }

    public ViewAllQUotesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.fragment_view_all_quotes, container, false);

        ArrayList<Quote> allQuotes = new ArrayList<>();
        allQuotes.add(new Quote("1.02.2017", "tova e proba"));
        allQuotes.add(new Quote("2.02.2017", "tova e proba"));
        allQuotes.add(new Quote("4.02.2017", "tova e proba"));
        allQuotes.add(new Quote("3.02.2017", "tova e proba"));
        allQuotes.add(new Quote("5.02.2017", "tova e proba"));
        allQuotes.add(new Quote("6.02.2017", "tova e proba"));
        allQuotes.add(new Quote("7.02.2017", "tova e proba"));
        allQuotes.add(new Quote("8.02.2017", "tova e proba"));
        allQuotes.add(new Quote("9.02.2017", "tova e proba"));
        allQuotes.add(new Quote("10.02.2017", "tova e proba"));
        allQuotes.add(new Quote("11.02.2017", "tova e proba"));
        allQuotes.add(new Quote("12.02.2017", "tova e proba"));

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setAdapter(new MyRecyclerViewAdapter(allQuotes));

        return view;
    }
}
