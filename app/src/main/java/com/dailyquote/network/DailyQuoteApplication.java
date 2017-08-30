package com.dailyquote.network;

import android.app.Application;
import android.content.Context;

import com.dailyquote.view_utils.FontManager;

/**
 * Created by stoyan-ivanov on 18.08.17.
 */

public class DailyQuoteApplication extends Application{

    private static Context applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationContext = getApplicationContext();

        FontManager.init(getAssets());
    }

    public static Context getStaticContext() {
        return applicationContext;
    }
}
