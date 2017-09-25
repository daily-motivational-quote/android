package com.dailyquote.animations;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.dailyquote.R;
import com.dailyquote.network.DailyQuoteApplication;
import com.dailyquote.view_utils.ScreenUtils;

import java.util.ArrayList;

/**
 * Created by stoyan-ivanov on 23.09.17.
 */

public class AnimationController {

    public AnimationController() {
    }

    public void moveAnimationLeft(final ImageView cloud) {
        int width = ScreenUtils.getScreenWidth();
        cloud.measure( View.MeasureSpec.makeMeasureSpec(width, View.MeasureSpec.AT_MOST),
                View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));


        final Animation anim = new TranslateAnimation(0, -width, 0 , 0);
        anim.setDuration(5000);
        anim.setRepeatCount(0);

        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                cloud.setClickable(false);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                cloud.setVisibility(View.INVISIBLE);
                cloud.clearAnimation();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        cloud.startAnimation(anim);

    }

}
