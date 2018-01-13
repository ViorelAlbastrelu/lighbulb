package com.valbastrelu.lightbulb.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.valbastrelu.lightbulb.nivel2.ActivityLvl2;

/**
 * Created by Crow on 6/1/2018.
 */

public abstract class LevelActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setTitle("");
    }

    void nextLevel(String className){
        Scor.scorBonus();
        Intent i = null;
        try {
            i = new Intent(this, Class.forName(className).getClass());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        this.startActivity(i);
    }
}
