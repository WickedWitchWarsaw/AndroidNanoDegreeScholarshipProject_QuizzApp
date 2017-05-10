package com.wickedwitchwarsaw.udacityscholarshipprojectquizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DraculaResult extends AppCompatActivity {

    @BindView(R.id.scorePointDracula)
    protected TextView scorePointDracula;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dracula_result);
        ButterKnife.bind(this);

        Intent draculaIntent = getIntent();
        String collectedPoints = draculaIntent.getStringExtra("PointsPage1");
        scorePointDracula.setText(collectedPoints);

    }
}
