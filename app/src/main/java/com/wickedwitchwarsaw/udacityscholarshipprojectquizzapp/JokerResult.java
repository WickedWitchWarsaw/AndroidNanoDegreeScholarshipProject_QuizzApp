package com.wickedwitchwarsaw.udacityscholarshipprojectquizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class JokerResult extends AppCompatActivity {

    @BindView(R.id.scorePointJoker)
    protected TextView scorePointJoker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joker_result);
        ButterKnife.bind(this);

        Intent jokerIntent = getIntent();
        String collectedPoints = jokerIntent.getStringExtra("PointsPage2");
        scorePointJoker.setText(collectedPoints);
    }
}
