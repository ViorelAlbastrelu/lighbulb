package com.valbastrelu.lightbulb.nivel1;

import android.view.View;
import android.widget.Switch;

import com.valbastrelu.lightbulb.main.Scor;

/**
 * Created by Crow on 9/12/2017.
 */

class Lvl1Presenter implements Lvl1PresenterI {
    private Lvl1ViewI lvl1ViewI;
    private Lvl1Model lightBulbModel;

    public Lvl1Presenter(Lvl1ViewI viewI) {

        this.lvl1ViewI = viewI;
        this.lightBulbModel = new Lvl1Model(this);
    }

    public void clearSwithes(View... views) {
        for (View v : views) {
            Switch s = (Switch) v;
            s.setChecked(false);
        }
    }

    public void updateCheckCode(int i, int e) {
        lightBulbModel.pushAction(i, e);
    }

    @Override
    public void presentEqualityState(boolean state) {
        if (state)
        {
            Scor.scorBonus();
            lvl1ViewI.setTextLabel("WIN!!!");
            lvl1ViewI.levelFinished();
        }
    }

    @Override
    public void updateScor() {
        String scor = String.format("Scor: %d", Scor.getScor());
        lvl1ViewI.setTextLabel(scor);
    }
}
