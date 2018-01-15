package com.valbastrelu.lightbulb.nivel2;

import com.valbastrelu.lightbulb.main.LevelCommonBehaviour;

/**
 * Created by Crow on 28/12/2017.
 */

public interface Lvl2ViewI extends LevelCommonBehaviour {

    void updateProgressBar(int progress);
    void changeImIndicator(boolean green);
    void clearSwitches();
}
