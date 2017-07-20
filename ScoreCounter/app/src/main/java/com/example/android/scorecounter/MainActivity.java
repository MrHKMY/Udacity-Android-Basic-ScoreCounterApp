package com.example.android.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreFighterA = 0;
    int scoreFighterB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Increase the score for Fighter A by 3 points.
    public void fighterAPlus3 (View v) {
        scoreFighterA = scoreFighterA + 3;
        displayForA(scoreFighterA);
    }

    //Increase the score for Fighter A by 2 points.
    public void fighterAPlus2 (View v) {
        scoreFighterA = scoreFighterA + 2;
        displayForA(scoreFighterA);
    }

    //Increase the score for Fighter A by 5 points.
    public void fighterASpecial (View v) {
        scoreFighterA = scoreFighterA + 5;
        displayForA(scoreFighterA);
    }

    //Increase the score for Fighter B by 3 points.
    public void fighterBPlus3 (View v) {
        scoreFighterB = scoreFighterB + 3;
        displayForB(scoreFighterB);
    }

    //Increase the score for Fighter B by 2 points.
    public void fighterBPlus2 (View v) {
        scoreFighterB = scoreFighterB + 2;
        displayForB(scoreFighterB);
    }

    //Increase the score for Fighter B by 5 points.
    public void fighterBSpecial (View v) {
        scoreFighterB = scoreFighterB + 5;
        displayForB(scoreFighterB);
    }

    //Reset the score for both Fighter to 0.
    public void resetScore (View v) {
        scoreFighterA = 0;
        scoreFighterB = 0;
        displayForA(scoreFighterA);
        displayForB(scoreFighterB);
    }

    //Display the score for Fighter A
    public void displayForA (int score) {
        TextView scoreView = (TextView) findViewById(R.id.a_score);
        scoreView.setText(String.valueOf(score));
    }

    //Display the score for Fighter B
    public void displayForB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.b_score);
        scoreView.setText(String.valueOf(score));
    }

}
