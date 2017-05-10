package com.wickedwitchwarsaw.udacityscholarshipprojectquizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QuizzAppPage2 extends AppCompatActivity {

    //QUESTION 6
    @BindView(R.id.answerQ6checkBox1)       //true
    protected CheckBox answerQ6checkBox1;

    @BindView(R.id.answerQ6checkBox2)       //true
    protected CheckBox answerQ6checkBox2;

    @BindView(R.id.answerQ6checkBox3)       //true
    protected CheckBox answerQ6checkBox3;

    @BindView(R.id.answerQ6checkBox4)       //true
    protected CheckBox answerQ6checkBox4;

    //QUESTION 7
    @BindView(R.id.answerQ7checkBox1)       //true
    protected CheckBox answerQ7checkBox1;

    @BindView(R.id.answerQ7checkBox2)       //true
    protected CheckBox answerQ7checkBox2;

    @BindView(R.id.answerQ7checkBox3)
    protected CheckBox answerQ7checkBox3;

    @BindView(R.id.answerQ7checkBox4)
    protected CheckBox answerQ7checkBox4;

    //QUESTION 8
    @BindView(R.id.answerQ8checkBox1)       //true
    protected CheckBox answerQ8checkBox1;

    @BindView(R.id.answerQ8checkBox2)
    protected CheckBox answerQ8checkBox2;

    @BindView(R.id.answerQ8checkBox3)
    protected CheckBox answerQ8checkBox3;

    @BindView(R.id.answerQ8checkBox4)       //true
    protected CheckBox answerQ8checkBox4;

    //QUESTION 9
    @BindView(R.id.answerQ9checkBox1)
    protected CheckBox answerQ9checkBox1;

    @BindView(R.id.answerQ9checkBox2)
    protected CheckBox answerQ9checkBox2;

    @BindView(R.id.answerQ9checkBox3)       //true
    protected CheckBox answerQ9checkBox3;

    @BindView(R.id.answerQ9checkBox4)
    protected CheckBox answerQ9checkBox4;

    private int points = 0;
    int tempPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_app_page2);
        ButterKnife.bind(this);

        Intent startPage2intent = getIntent();
        tempPoints = startPage2intent.getIntExtra("PointsPage1", points);
    }


    // CHECK ANSWERS AND GET POINTS FROM PAGE 2
    public int getPointsPage3() {
        checkCheckBoxGetPoint(answerQ6checkBox1);
        checkCheckBoxGetPoint(answerQ6checkBox2);
        checkCheckBoxGetPoint(answerQ6checkBox3);
        checkCheckBoxGetPoint(answerQ6checkBox4);
        checkCheckBoxGetPoint(answerQ7checkBox1);
        checkCheckBoxGetPoint(answerQ7checkBox2);
        checkCheckBoxGetPoint(answerQ8checkBox1);
        checkCheckBoxGetPoint(answerQ8checkBox4);
        checkCheckBoxGetPoint(answerQ9checkBox3);
        return points;
    }


    // ========> Go to page 3 <========

    @OnClick(R.id.btnNextPage2)
    public void goToPage3() {
        getPointsPage3();
        points = points + tempPoints;
        startIntentPage3();

    }

    public void startIntentPage3() {
        Intent startPage3intent = new Intent(this, QuizzAppPage3.class);
        startPage3intent.putExtra("PointsPage2", points);
        startActivity(startPage3intent);
    }


    //refactored methods
    public void checkCheckBoxGetPoint(CheckBox checkBox) {
        if (checkBox.isChecked()) {
            addPoint(1);
        }
    }

    public void addPoint(int point) {
        points = points + point;
    }

}

