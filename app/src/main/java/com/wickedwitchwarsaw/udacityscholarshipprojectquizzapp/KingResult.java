package com.wickedwitchwarsaw.udacityscholarshipprojectquizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class KingResult extends AppCompatActivity {

    @BindView(R.id.scorePointKing)
    protected TextView scorePointKing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_king_result);
        ButterKnife.bind(this);

        Intent kingIntent = getIntent();
        String collectedPoints = kingIntent.getStringExtra("PointsPage2");
        scorePointKing.setText(collectedPoints);
    }
}
