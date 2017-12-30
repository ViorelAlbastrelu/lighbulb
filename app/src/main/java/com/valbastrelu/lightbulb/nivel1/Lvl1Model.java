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
    List<Integer> cod;
    List<Integer> codToCheck;

    public Lvl1Model(Lvl1PresenterI bulbPresenter) {
        this.bulbPresenter = bulbPresenter;

        codAscuns = new Integer[]{1, 1, 0, 0, 0, 0};
        codDeGhicit = new Integer[]{0, 0, 0, 0, 0, 0};
        cod = new ArrayList<>(5);
        codToCheck = new ArrayList<>(5);
        cod = Arrays.asList(1, 1, 0, 0, 0, 0);
        codToCheck = Arrays.asList(0, 0, 0, 0, 0, 0);
    }

    public void pushAction(int index, Integer element) {
        for (int i = 0; i < codDeGhicit.length; i++) {
            if (i == index) codDeGhicit[index] = element;
        }
        System.out.println("ADD: index = " + index + " value = " + element);
        System.out.println("COD: " + Arrays.toString(codAscuns));
        System.out.println("COD2CHECK: " + Arrays.toString(codDeGhicit));
        boolean valid = Arrays.equals(codAscuns, codDeGhicit);
//        codToCheck.add(index, element);
//        codToCheck.remove(6);
//        boolean valid = cod.equals(codToCheck);
        bulbPresenter.presentEqualityState(valid);
    }

}
