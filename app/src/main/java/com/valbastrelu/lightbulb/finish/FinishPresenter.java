package com.valbastrelu.lightbulb.finish;

import com.valbastrelu.lightbulb.main.LevelPresenter;
import com.valbastrelu.lightbulb.main.LevelCommonBehaviour;
import com.valbastrelu.lightbulb.main.Scor;

/**
 * Created by Crow on 13/1/2018.
 */

public class FinishPresenter implements LevelPresenter {
    LevelCommonBehaviour levelViewI;

    public FinishPresenter(LevelCommonBehaviour levelViewI) {
        this.levelViewI = levelViewI;
    }

    @Override
    public void updateScor() {
        String scor = String.format("Scor: %d", Scor.getScor());
        levelViewI.setTextLabel(scor);
    }
}
