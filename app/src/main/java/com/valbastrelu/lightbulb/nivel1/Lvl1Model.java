package com.valbastrelu.lightbulb.nivel1;

import android.util.Log;

import com.valbastrelu.lightbulb.main.Scor;

import java.util.Arrays;
import java.util.Objects;

import static com.valbastrelu.lightbulb.main.LevelActivity.TAG;

/**
 * Created by Crow on 10/12/2017.
 */

public class Lvl1Model {

    private final Lvl1PresenterI bulbPresenter;

    Integer[] codAscuns, codDeGhicit;

    public Lvl1Model(Lvl1PresenterI bulbPresenter) {
        this.bulbPresenter = bulbPresenter;

        codAscuns = new Integer[]{1, 0, 1, 0, 1, 1};
        codDeGhicit = new Integer[]{0, 0, 0, 0, 0, 0};
    }

    public void pushAction(int index, Integer element) {
        for (int i = 0; i < codDeGhicit.length; i++) {
            if (i == index) codDeGhicit[index] = element;
        }
        if(!Objects.equals(codAscuns[index], codDeGhicit[index]))
            Scor.scorPenalty();
        Log.i(TAG, "ADD: index = " + index + " value = " + element);
        Log.i(TAG, "COD: " + Arrays.toString(codAscuns));
        Log.i(TAG, "COD2CHECK: " + Arrays.toString(codDeGhicit));
        boolean valid = Arrays.equals(codAscuns, codDeGhicit);
        bulbPresenter.presentEqualityState(valid);
    }

}
