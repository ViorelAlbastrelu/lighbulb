package com.valbastrelu.lightbulb.nivel2;

import com.valbastrelu.lightbulb.main.LevelPresenter;

/**
 * Created by Crow on 28/12/2017.
 */

public interface Lvl2PresenterI extends LevelPresenter{
    void switch1Changed(int i, boolean checked);
    void switch2Changed(int i);
    void switch3Changed(int i);

    void clearSwitch();

    void updateProgress(int progress);

    void levelComplete();
}
