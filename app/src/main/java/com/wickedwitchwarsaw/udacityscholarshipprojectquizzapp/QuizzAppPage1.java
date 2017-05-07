package com.wickedwitchwarsaw.udacityscholarshipprojectquizzapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class QuizzAppPage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_app_page1);
        ButterKnife.bind(this);
    }





    // ========> Go to page 2 <========

    @OnClick(R.id.btnNextPage1)
    protected void goToPage2(){
        QuizzAppPage2.startIntentPage2(this);
    }
}
