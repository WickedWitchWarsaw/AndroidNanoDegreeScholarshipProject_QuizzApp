package com.wickedwitchwarsaw.udacityscholarshipprojectquizzapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QuizzAppPage3 extends AppCompatActivity {

    @BindView(R.id.answerQ10text)
    protected EditText answerQ10text;

    @BindView(R.id.answerQ11text)
    protected EditText answerQ11text;

    @BindView(R.id.answerQ12text)
    protected EditText answerQ12text;

    @BindView(R.id.answerQ13text)
    protected EditText answerQ13text;

    String answerQ10 = "fi";
    String answerQ11 = "pwd";
    String answerQ12 = "cd..";
    String answerQ13 = "read";

    int points;
    int tempPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_app_page3);
        ButterKnife.bind(this);

        Intent startIntentPage3 = getIntent();
        tempPoints = startIntentPage3.getIntExtra(QuizzAppPage2.KEY_POINTS_PAGE_2, points);
    }

    public int getPointsPage3() {
        checkStringAnswer(answerQ10text, answerQ10);
        checkStringAnswer(answerQ11text, answerQ11);
        checkStringAnswer(answerQ12text, answerQ12);
        checkStringAnswer(answerQ13text, answerQ13);
        return points;
    }


    //RESULT PAGE INTENTS -> King, Dracula, Joker with putExtra POINT
    public void startJokerResult() {
        Intent jokerIntent = new Intent(this, JokerResult.class);
        String intentPoints = getStringPoints();
        jokerIntent.putExtra(QuizzAppPage2.KEY_POINTS_PAGE_2, intentPoints);
        startActivity(jokerIntent);
    }

    public void startDraculaResult() {
        Intent draculaIntent = new Intent(this, DraculaResult.class);
        String intentPoints = getStringPoints();
        draculaIntent.putExtra(QuizzAppPage2.KEY_POINTS_PAGE_2, intentPoints);
        startActivity(draculaIntent);
    }

    public void startKingResult() {
        Intent kingIntent = new Intent(this, KingResult.class);
        String intentPoints = getStringPoints();
        kingIntent.putExtra(QuizzAppPage2.KEY_POINTS_PAGE_2, intentPoints);
        startActivity(kingIntent);
    }


    //refactored methods
    public void checkStringAnswer(EditText editText, String answer) {
        String submittedAnswer = String.valueOf(editText.getText());
        if (submittedAnswer.equals(answer)) {
            addPoint(1);
        }
    }

    public void addPoint(int point) {
        points = points + point;
    }

    private String getStringPoints() {
        return String.valueOf(points);
    }


    //DISPLAY RESULT PAGE
    @OnClick(R.id.btn_submit)
    protected void submitAnswers() {
        getPointsPage3();
        points = points + tempPoints;
        Toast.makeText(this, "Quizz ended... Points collected: " + points, Toast.LENGTH_SHORT).show();
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
