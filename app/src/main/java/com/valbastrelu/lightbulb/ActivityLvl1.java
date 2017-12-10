package com.valbastrelu.lightbulb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;

import butterknife.BindView;
import butterknife.OnClick;

public class ActivityLvl1 extends AppCompatActivity implements LightBulbView{

    private LightBulbPresenter presenter;
    @BindView(R.id.switch1) Switch switch1;
    @BindView(R.id.switch2) Switch switch2;
    @BindView(R.id.switch3) Switch switch3;
    @BindView(R.id.switch4) Switch switch4;
    @BindView(R.id.switch5) Switch switch5;
    @BindView(R.id.switch6) Switch switch6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1);

        presenter = new LightBulbPresenter(this, new LightBulbModel());
    }

    @OnClick(R.id.switch1)
    public void ceva(){

    }
}
