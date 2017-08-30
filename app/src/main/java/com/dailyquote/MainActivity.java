package com.dailyquote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dailyquote.ui.StartFragment;

public class MainActivity extends AppCompatActivity {

    private android.app.FragmentManager fragmentManagaer;
    private android.app.FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManagaer = getFragmentManager();

        attachFragment(new StartFragment());

    }

    public void attachFragment(android.app.Fragment fragment) {
        fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment)
                .commit();
    }
}
