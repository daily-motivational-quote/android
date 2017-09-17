package com.dailyquote;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dailyquote.network.DailyQuoteApplication;
import com.dailyquote.network.Quote;
import com.dailyquote.ui.StartFragment;
import com.dailyquote.ui.ViewAllQUotesFragment;

import java.util.ArrayList;

/**
 * Created by stoyan-ivanov on 15.09.17.
 */

public class TestClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);

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



        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(DailyQuoteApplication.getStaticContext());
        recyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        RecyclerView.Adapter mAdapter = new MyRecyclerViewAdapter(allQuotes);
        recyclerView.setAdapter(mAdapter);

    }
}
