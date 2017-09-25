package com.dailyquote.view_utils;

import android.content.res.Resources;

/**
 * Created by stoyan-ivanov on 25.09.17.
 */

public class ScreenUtils {

    public static int getScreenWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int getScreenHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }
}
