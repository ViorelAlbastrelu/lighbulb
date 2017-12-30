package com.valbastrelu.lightbulb.nivel1;

import android.view.View;
import android.widget.Switch;

/**
 * Created by Crow on 9/12/2017.
 */

class Lvl1Presenter implements Lvl1PresenterI {
    private Lvl1ViewI viewI;
    private Lvl1Model lightBulbModel;

    public Lvl1Presenter(Lvl1ViewI viewI) {

        this.viewI = viewI;
        this.lightBulbModel = new Lvl1Model(this);
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
