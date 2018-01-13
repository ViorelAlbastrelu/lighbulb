package com.valbastrelu.lightbulb.nivel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Crow on 10/12/2017.
 */

public class Lvl1Model {

    private final Lvl1PresenterI bulbPresenter;

    Integer[] codAscuns, codDeGhicit;

    public Lvl1Model(Lvl1PresenterI bulbPresenter) {
        this.bulbPresenter = bulbPresenter;

        codAscuns = new Integer[]{1, 0, 1, 0, 1, 0};
        codDeGhicit = new Integer[]{0, 0, 0, 0, 0, 0};
    }

    public void pushAction(int index, Integer element) {
        for (int i = 0; i < codDeGhicit.length; i++) {
            if (i == index) codDeGhicit[index] = element;
        }
        System.out.println("ADD: index = " + index + " value = " + element);
        System.out.println("COD: " + Arrays.toString(codAscuns));
        System.out.println("COD2CHECK: " + Arrays.toString(codDeGhicit));
        boolean valid = Arrays.equals(codAscuns, codDeGhicit);
        bulbPresenter.presentEqualityState(valid);
    }

}
