package com.valbastrelu.lightbulb.main;

/**
 * Created by Crow on 13/1/2018.
 */

public class Scor {
    private static final Scor ourInstance = new Scor();

    private static int scor;

    public static Scor getInstance() {
        return ourInstance;
    }

    private Scor() {
        scor = 100;
    }

    public static void scorPenalty() {
        scor -= 10;
    }

    public static void scorBonus() {
        scor += 100;
    }
}
