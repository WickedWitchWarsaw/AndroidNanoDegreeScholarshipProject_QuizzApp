package com.wickedwitchwarsaw.udacityscholarshipprojectquizzapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_enter)
    public void enterQuizzApp(){
        startQuizzAppIntent(this);
    }



    public void startQuizzAppIntent(Context context) {
        Intent startQuizz = new Intent(context, QuizzAppPage1.class);
        context.startActivity(startQuizz);
    }
}

