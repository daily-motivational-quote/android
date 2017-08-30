package com.dailyquote.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dailyquote.MainActivity;
import com.dailyquote.R;
import com.dailyquote.view_utils.CustomButton;
import com.dailyquote.view_utils.CustomTextView;


public class QuoteFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quote, container, false);

        CustomTextView tv = (CustomTextView) view.findViewById(R.id.tv_quote);

        return view;
    }

}