package com.wickedwitchwarsaw.udacityscholarshipprojectquizzapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ContentFrameLayout;

public class QuizzAppPage3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_app_page3);
    }

    public static void startIntentPage3(Context context){
        Intent startPage3intent = new Intent(context, QuizzAppPage3.class);
        context.startActivity(startPage3intent);
    }
}
