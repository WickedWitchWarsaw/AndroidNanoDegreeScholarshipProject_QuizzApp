package com.wickedwitchwarsaw.udacityscholarshipprojectquizzapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class QuizzAppPage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_app_page2);
        ButterKnife.bind(this);
    }

    public static void startIntentPage2(Context context) {
        Intent startPage2intent = new Intent(context, QuizzAppPage2.class);
        context.startActivity(startPage2intent);
    }










    // ========> Go to page 2 <========

    @OnClick(R.id.btnNextPage2)
    public void goToPage3() {
        QuizzAppPage3.startIntentPage3(this);

    }
}
