package com.valbastrelu.lightbulb.main;

/**
 * Created by Crow on 13/1/2018.
 */

public class Scor {

    private static Scor scorInstance = null;

    private static int scor = 100;

    public synchronized static Scor getInstance() {
        if (scorInstance == null)
            scorInstance = new Scor();
        return scorInstance;
    }

    private Scor() {
    }

    public static void scorPenalty() {
        scor -= 10;
    }

    public static void scorBonus() {
        scor += 100;
    }

    public static int getScor() {
        return scor;
    }
}
