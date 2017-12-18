package com.valbastrelu.lightbulb;

import android.view.View;
import android.widget.Switch;

/**
 * Created by Crow on 9/12/2017.
 */

class LightBulbPresenter implements LightBulbPresenterI {
    private LightBulbViewI viewI;
    private LightBulbLvl1Model lightBulbModel;

    public LightBulbPresenter(LightBulbViewI viewI) {

        this.viewI = viewI;
        this.lightBulbModel = new LightBulbLvl1Model(this);
    }

    public void clearSwithes(View... views) {
        for (View v : views) {
            Switch s = (Switch) v;
            s.setChecked(false);
        }
    }

    public void changeText(String s) {
        viewI.setTextLabel(s);
    }

    public void updateCheckCode(int i, int e) {
        lightBulbModel.pushAction(i, e);
    }

    @Override
    public void presentEqualityState(boolean state) {
        if (state) changeText("WIN");
    }
}
