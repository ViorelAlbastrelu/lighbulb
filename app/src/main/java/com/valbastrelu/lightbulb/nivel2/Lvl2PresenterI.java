package com.valbastrelu.lightbulb.nivel2;

/**
 * Created by Crow on 28/12/2017.
 */

public interface Lvl2PresenterI {
    void switch1Changed(int i, boolean checked);
    void switch2Changed(int i);
    void switch3Changed(int i);

    void clearSwitch();

    void updateProgress(int progress);
}
