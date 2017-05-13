package com.wickedwitchwarsaw.udacityscholarshipprojectquizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

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

    public static final String KEY_POINTS_PAGE_2 = "PointsPage2";
    private int points = 0;
    int tempPoints;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_app_page2);
        ButterKnife.bind(this);

        Intent startPage2intent = getIntent();
        tempPoints = startPage2intent.getIntExtra(QuizzAppPage1.KEY_POINTS_PAGE_1, points);
    }

    // CHECK ANSWERS AND GET POINTS FROM PAGE 2
    public int getPointsPage2() {
        checkCheckBoxQuestion6();
        checkCheckBoxQuestion7();
        checkCheckBoxQuestion8();
        checkCheckBoxQuestion9();
        return points;
    }


    @OnClick(R.id.btnNextPage2)
    public void goToPage3() {
        getPointsPage2();
        points = points + tempPoints;
        Toast.makeText(this, "Phase two complete, points collected: " + points, Toast.LENGTH_SHORT).show();
        startIntentPage3();
    }

    public void startIntentPage3() {
        Intent startPage3intent = new Intent(this, QuizzAppPage3.class);
        startPage3intent.putExtra(KEY_POINTS_PAGE_2, points);
        startActivity(startPage3intent);
    }


    //Checkbox checking methods
    public void checkCheckBoxQuestion6() {
        if (answerQ6checkBox1.isChecked() && answerQ6checkBox2.isChecked()
                && answerQ6checkBox3.isChecked() && answerQ6checkBox4.isChecked()) {
            addPoint(1);
        } else {
            addPoint(0);
        }
    }

    public void checkCheckBoxQuestion7() {
        if (answerQ7checkBox1.isChecked() && answerQ7checkBox2.isChecked()
                && !answerQ7checkBox3.isChecked() && !answerQ7checkBox4.isChecked()) {
            addPoint(1);
        } else {
            addPoint(0);
        }
    }

    public void checkCheckBoxQuestion8() {
        if (answerQ8checkBox1.isChecked() && !answerQ8checkBox2.isChecked()
                && !answerQ8checkBox3.isChecked() && answerQ8checkBox4.isChecked()) {
            addPoint(1);
        } else {
            addPoint(0);
        }
    }

    public void checkCheckBoxQuestion9() {
        if (!answerQ9checkBox1.isChecked() && !answerQ9checkBox2.isChecked()
                && answerQ9checkBox3.isChecked() && !answerQ9checkBox4.isChecked()) {
            addPoint(1);
        } else {
            addPoint(0);
        }
    }

    public void addPoint(int point) {
        points = points + point;
    }
}

