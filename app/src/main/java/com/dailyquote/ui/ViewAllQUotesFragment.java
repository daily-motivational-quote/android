package com.dailyquote.ui;

import android.content.Context;
import android.content.SharedPreferences;
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
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.dailyquote.ui.QuoteFragment.ALL_QUOTES_PREFERENCE;
import static com.dailyquote.ui.QuoteFragment.MY_PREFERENCES;

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

        ArrayList<Quote> allSavedQuotes = new ArrayList<>();

        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = sharedPreferences.getString(ALL_QUOTES_PREFERENCE, null);

        if(json != null) {
            Type type = new TypeToken<List<Quote>>() {}.getType();
            allSavedQuotes = gson.fromJson(json, type);
            Collections.reverse(allSavedQuotes);
        }

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new MyRecyclerViewAdapter(allSavedQuotes));

        return view;
    }
}
