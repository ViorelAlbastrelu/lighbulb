package com.valbastrelu.lightbulb.main;

import android.content.Context;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.widget.ImageView;

import com.valbastrelu.lightbulb.R;

/**
 * Created by Crow on 13/1/2018.
 */

public class Decorator {

    private AnimatedVectorDrawableCompat drawable;

    public Decorator(Context context, ImageView imageView) {
                drawable = AnimatedVectorDrawableCompat.create(context, R.drawable.lightbulb_animation);
                imageView.setImageDrawable(drawable);
    }

    public void start() {
        drawable.start();
    }

    public boolean isRunning(){
        return drawable.isRunning();
    }

}
