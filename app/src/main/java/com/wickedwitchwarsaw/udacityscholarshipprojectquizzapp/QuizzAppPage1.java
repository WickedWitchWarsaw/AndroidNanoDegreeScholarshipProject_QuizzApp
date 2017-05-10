package com.wickedwitchwarsaw.udacityscholarshipprojectquizzapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QuizzAppPage1 extends AppCompatActivity {

    @BindView(R.id.answerQ1True)
    protected RadioButton answerQ1True;

    @BindView(R.id.answerQ2False)
    protected RadioButton answerQ2False;

    @BindView(R.id.answerQ3True)
    protected RadioButton answerQ3True;

    @BindView(R.id.answerQ4True)
    protected RadioButton answerQ4True;

    @BindView(R.id.answerQ5False)
    protected RadioButton answerQ5False;

    private int points = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_app_page1);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnNextPage1)
    protected void goToPage2() {
        getPointsPage1();
        startIntentPage2();
    }


    // CHECK ANSWERS AND GET POINTS FROM PAGE 1
    public int getPointsPage1() {
        checkRadioBntGetPoint(answerQ1True);
        checkRadioBntGetPoint(answerQ2False);
        checkRadioBntGetPoint(answerQ3True);
        checkRadioBntGetPoint(answerQ4True);
        checkRadioBntGetPoint(answerQ5False);
        return points;
    }


    public void startIntentPage2() {
        Intent startPage2intent = new Intent(this, QuizzAppPage2.class);
        startPage2intent.putExtra("PointsPage1", points);
        startActivity(startPage2intent);
    }


    // refactored methods
    public void checkRadioBntGetPoint(RadioButton radioButton) {
        if (radioButton.isChecked()) {
            addPoint(1);
        }
    }

    public void addPoint(int point) {
        points = points + point;
    }
}
