package com.valbastrelu.lightbulb.nivel1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.valbastrelu.lightbulb.R;
import com.valbastrelu.lightbulb.main.Decorator;
import com.valbastrelu.lightbulb.main.LevelActivity;
import com.valbastrelu.lightbulb.main.Scor;
import com.valbastrelu.lightbulb.nivel2.ActivityLvl2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class ActivityLvl1 extends LevelActivity implements Lvl1ViewI {

    @BindView(R.id.imgBec)
    ImageView imgBec;
    @BindView(R.id.textScor)
    TextView textScor;
    @BindView(R.id.textView)
    TextView textView;
    private Lvl1Presenter presenter;

    @BindView(R.id.switch6)
    Switch switch6;
    private Decorator bec;
    private boolean levelFinnished;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1);
        ButterKnife.bind(this);
        presenter = new Lvl1Presenter(this);
        presenter.updateScor();

        bec = new Decorator(this, imgBec);
        Log.i(TAG, "Activity onCreate() called!");
        Log.i(TAG, "Scor singleton: " + Scor.getScor());
    }

    @OnCheckedChanged({R.id.switch1, R.id.switch2, R.id.switch3, R.id.switch4, R.id.switch5, R.id.switch6})
    public void checkCode(CompoundButton button, boolean checked) {
        presenter.updateScor();
        if (checked) {
            switch (button.getId()) {
                case R.id.switch1:
                    presenter.updateCheckCode(0, 1);
                    Log.i(TAG, "Changed switch 1 state to 1!");
                    break;
                case R.id.switch2:
                    presenter.updateCheckCode(1, 1);
                    break;
                case R.id.switch3:
                    presenter.updateCheckCode(2, 1);
                    break;
                case R.id.switch4:
                    presenter.updateCheckCode(3, 1);
                    break;
                case R.id.switch5:
                    presenter.updateCheckCode(4, 1);
                    break;
                case R.id.switch6:
                    presenter.updateCheckCode(5, 1);
                    break;
            }
        } else {
            switch (button.getId()) {
                case R.id.switch1:
                    presenter.updateCheckCode(0, 0);
                    break;
                case R.id.switch2:
                    presenter.updateCheckCode(1, 0);
                    break;
                case R.id.switch3:
                    presenter.updateCheckCode(2, 0);
                    break;
                case R.id.switch4:
                    presenter.updateCheckCode(3, 0);
                    break;
                case R.id.switch5:
                    presenter.updateCheckCode(4, 0);
                    break;
                case R.id.switch6:
                    presenter.updateCheckCode(5, 0);
                    break;
            }
        }
    }

    @Override
    public void setTextLabel(String text) {
        textScor.setText(text);
    }

    public void levelFinished() {
        textView.setText("WIN!!!");
        bec.start();
        levelFinnished = true;
    }

    @OnClick(R.id.imgBec)
    public void next(View view) {
        if (levelFinnished) {
            Intent i = new Intent(this, ActivityLvl2.class);
            this.startActivity(i);
        }
    }
}
