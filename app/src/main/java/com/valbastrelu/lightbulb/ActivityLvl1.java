package com.valbastrelu.lightbulb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Observable;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;

public class ActivityLvl1 extends AppCompatActivity implements LightBulbViewI {

//    @BindView(R.id.switch1) Switch switch1;
//    @BindView(R.id.switch2) Switch switch2;
//    @BindView(R.id.switch3) Switch switch3;
//    @BindView(R.id.switch4) Switch switch4;
//    @BindView(R.id.switch5) Switch switch5;

    @BindView(R.id.textView) TextView textView;
    private LightBulbPresenter presenter;
    private Observable observable;

    @Override
    public void setTextLabel(String text) {
        textView.setText(text);
    }

    @BindView(R.id.switch6)
    Switch switch6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1);
        ButterKnife.bind(this);
        presenter = new LightBulbPresenter(this);
        System.out.println("Activity onCreate() called!");
    }

    @OnCheckedChanged({R.id.switch1, R.id.switch2, R.id.switch3, R.id.switch4, R.id.switch5, R.id.switch6})
    public void checkCode(CompoundButton button, boolean checked) {
        if (checked) {
            switch (button.getId()) {
                case R.id.switch1:
                    presenter.updateCheckCode(0, 1);
                    System.out.println("Changed switch 1 state!");
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

}
