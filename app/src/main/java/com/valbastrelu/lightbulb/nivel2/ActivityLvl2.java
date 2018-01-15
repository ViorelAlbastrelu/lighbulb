package com.valbastrelu.lightbulb.nivel2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;

import com.valbastrelu.lightbulb.R;
import com.valbastrelu.lightbulb.finish.FinishActivity;
import com.valbastrelu.lightbulb.main.Decorator;
import com.valbastrelu.lightbulb.main.LevelActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class ActivityLvl2 extends LevelActivity implements Lvl2ViewI {

    private Lvl2Presenter lvl2Presenter;
    @BindView(R.id.energyBarlvl2)
    ProgressBar energyBar;
    @BindView(R.id.ivIsOn)
    ImageView imageShowOn;
    @BindView(R.id.switch1)
    Switch switch1;
    @BindView(R.id.switch2)
    Switch switch2;
    @BindView(R.id.switch3)
    Switch switch3;
    @BindView(R.id.btnFinishlvl2)
    Button btnFinishlvl2;
    @BindView(R.id.textScor)
    TextView textScor;
    @BindView(R.id.imgBec) ImageView imgBec;
    private boolean levelFinished;
    private Decorator bec;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl2);
        ButterKnife.bind(this);
        lvl2Presenter = new Lvl2Presenter(this);
        lvl2Presenter.updateScor();
        bec = new Decorator(this, imgBec);
    }

    @Override
    public void clearSwitches() {
        switch1.setChecked(false);
        switch2.setChecked(false);
    }

    @OnCheckedChanged({R.id.switch1, R.id.switch2, R.id.switch3})
    public void checkCode(CompoundButton button, boolean checked) {
        lvl2Presenter.updateScor();
        if (checked) {
            switch (button.getId()) {
                case R.id.switch1:
                    lvl2Presenter.switch1Changed(1, true);
                    Log.i(TAG, "Changed switch 1 state!");
                    break;
                case R.id.switch2:
                    lvl2Presenter.switch2Changed(2);
                    break;
                case R.id.switch3:
                    lvl2Presenter.switch3Changed(3);
                    break;
            }
        } else {
            switch (button.getId()) {
                case R.id.switch1:
                    lvl2Presenter.switch1Changed(1, false);
                    break;
                case R.id.switch2:
                    lvl2Presenter.switch2Changed(2);
                    break;
                case R.id.switch3:
                    lvl2Presenter.switch3Changed(3);
                    break;
            }
        }
    }

    @Override
    public void updateProgressBar(int progress) {
        energyBar.setProgress(progress);
    }

    @Override
    public void changeImIndicator(boolean green) {
        if (green)
            imageShowOn.setImageResource(android.R.drawable.presence_online);
        else
            imageShowOn.setImageResource(android.R.drawable.presence_invisible);
    }

    @Override
    public void levelFinished() {
        bec.start();
        levelFinished = true;
    }

    @Override
    public void setTextLabel(String text) {
        textScor.setText(text);
    }

    @OnClick(R.id.imgBec)
    public void next(){
        if (levelFinished) {
            Intent i = new Intent(this, FinishActivity.class);
            this.startActivity(i);
        }
    }
}
