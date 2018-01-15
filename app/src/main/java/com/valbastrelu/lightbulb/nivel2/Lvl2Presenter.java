package com.valbastrelu.lightbulb.nivel2;

import com.valbastrelu.lightbulb.main.Scor;

/**
 * Created by Crow on 28/12/2017.
 */

class Lvl2Presenter implements Lvl2PresenterI {

    Lvl2ViewI lvl2ViewI;
    Lvl2Model lvl2Model;

    public Lvl2Presenter(Lvl2ViewI view) {
        this.lvl2ViewI = view;
        this.lvl2Model = new Lvl2Model(this);
    }

    @Override
    public void switch1Changed(int i, boolean checked) {
        lvl2Model.changeOnIndicator(checked);
        lvl2ViewI.changeImIndicator(checked);
    }

    @Override
    public void switch2Changed(int i) {
        lvl2Model.updateProgress();
    }

    @Override
    public void switch3Changed(int i) {

    }

    @Override
    public void clearSwitch() {
        lvl2ViewI.clearSwitches();
    }

    @Override
    public void updateProgress(int progress) {
        lvl2ViewI.updateProgressBar(progress);
    }

    @Override
    public void levelComplete() {
        Scor.scorBonus();
        lvl2ViewI.levelFinished();
    }

    @Override
    public void updateScor() {
        String scor = String.format("Scor: %d", Scor.getScor());
        lvl2ViewI.setTextLabel(scor);
    }
}
