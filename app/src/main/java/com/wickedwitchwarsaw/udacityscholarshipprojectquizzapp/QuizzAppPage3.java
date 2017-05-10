package com.wickedwitchwarsaw.udacityscholarshipprojectquizzapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ContentFrameLayout;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class QuizzAppPage3 extends AppCompatActivity {

    int points = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_app_page3);
        ButterKnife.bind(this);
    }




    //RESULT PAGE INTENTS -> King, Dracula, Joker with putExtra POINT
    public void startJokerResult() {
        String intentPoints = getStringPoints();
        Intent jokerIntent = new Intent(this, JokerResult.class);
        jokerIntent.putExtra("PointsPage2", intentPoints);
        startActivity(jokerIntent);
    }

    public void startDraculaResult() {
        String intentPoints = getStringPoints();
        Intent draculaIntent = new Intent(this, DraculaResult.class);
        draculaIntent.putExtra("PointsPage2", intentPoints);
        startActivity(draculaIntent);
    }

    public void startKingResult() {
        String intentPoints = getStringPoints();
        Intent kingIntent = new Intent(this, KingResult.class);
        kingIntent.putExtra("PointsPage2", intentPoints);
        startActivity(kingIntent);
    }


    @NonNull
    private String getStringPoints() {
        return String.valueOf(points);
    }

    //DISPLAY RESULT PAGE
    @OnClick(R.id.btn_submit)
    protected void submitAnswers() {
        if (points <= 6) {
            startJokerResult();
        }
        if (points > 6 && points <= 10) {
            startDraculaResult();
        }
        if (points > 10) {
            startKingResult();
        }
    }
}
