package com.dailyquote;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.dailyquote.ui.QuoteFragment;
import com.dailyquote.view_utils.CustomTextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static com.dailyquote.ui.QuoteFragment.DATE_PREFERENCE;

public class StartActivity extends AppCompatActivity {

    CustomTextView dateWidget;
    String currDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        setDate();

        Button startButton = (Button) findViewById(R.id.btn_start);
        startButton.getBackground().setAlpha(180);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, QuoteActivity.class);
                intent.putExtra("currentDate", currDate);
                startActivity(intent);
            }
        });
    }

    private void setDate() {
        dateWidget = (CustomTextView) findViewById(R.id.date_widget);
        DateFormat df = new SimpleDateFormat("EEE, d MMM yyyy");
        currDate = df.format(Calendar.getInstance().getTime());
        dateWidget.setText(currDate);
    }
}
