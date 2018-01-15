package com.valbastrelu.lightbulb.finish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.valbastrelu.lightbulb.R;
import com.valbastrelu.lightbulb.main.LevelCommonBehaviour;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FinishActivity extends AppCompatActivity  implements LevelCommonBehaviour {

    @BindView(R.id.textScor) TextView textScor;
    FinishPresenter finishPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish);
        ButterKnife.bind(this);
        finishPresenter = new FinishPresenter(this);
        finishPresenter.updateScor();
    }

    @Override
    public void levelFinished() {
    }

    @Override
    public void setTextLabel(String text) {
        textScor.setText(text);
    }
}
