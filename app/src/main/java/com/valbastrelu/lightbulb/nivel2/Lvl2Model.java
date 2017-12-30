package com.valbastrelu.lightbulb.nivel2;

/**
 * Created by Crow on 28/12/2017.
 */

public class Lvl2Model {

    private Lvl2PresenterI lvl2PresenterI;
    private boolean isOn;
    private int progress = 0;

    public Lvl2Model(Lvl2PresenterI lvl2PresenterI) {
        this.lvl2PresenterI = lvl2PresenterI;
    }


    public void changeOnIndicator(boolean checked) {
        this.isOn = checked;
    }

    public void updateProgress() {
        if (isOn) {
            progress += 20;
        } else progress -= 20;
        lvl2PresenterI.clearSwitch();
        lvl2PresenterI.updateProgress(progress);
    }
}
