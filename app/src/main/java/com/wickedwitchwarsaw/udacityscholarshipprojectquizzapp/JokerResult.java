package com.wickedwitchwarsaw.udacityscholarshipprojectquizzapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JokerResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joker_result);
    }

    public static void startJokerResult(Context context){
        Intent startJokerIntent = new Intent (context, JokerResult.class);
        context.startActivity(startJokerIntent);
    }
}
