package com.dailyquote.ui;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.dailyquote.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class StartFragment extends Fragment {
//    TextView dateWidget;
//    String currDate;
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.activity_start, container, false);
//
//        setDate(view);
//
//        Button startButton = (Button) view.findViewById(R.id.btn_start);
//        startButton.getBackground().setAlpha(180);
//
//        startButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //((MainActivity) getActivity()).attachFragment(putExtraArguments());
//            }
//        });
//
//        return view;
//    }
//
//    private QuoteFragment putExtraArguments() {
//        Bundle bundle = new Bundle();
//        bundle.putString("currentDate", currDate);
//
//        QuoteFragment quoteFragment = new QuoteFragment();
//        quoteFragment.setArguments(bundle);
//
//        return quoteFragment;
//    }
//
//    private void setDate(View view) {
//        dateWidget = (TextView) view.findViewById(R.id.date_widget);
//        DateFormat df = new SimpleDateFormat("EEE, d MMM yyyy");
//        currDate = df.format(Calendar.getInstance().getTime());
//        dateWidget.setText(currDate);
//    }
}
