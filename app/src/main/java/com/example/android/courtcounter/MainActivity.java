package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    Save instance of variables so they aren't lost when screen is rotated
     */
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate if the process is
        // killed and restarted.
        savedInstanceState.putInt("scoreTeamA", scoreTeamA);
        savedInstanceState.putInt("scoreTeamB", scoreTeamB);
        super.onSaveInstanceState(savedInstanceState);
    }
    //onRestoreInstanceState
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.
        scoreTeamA = savedInstanceState.getInt("scoreTeamA");
        scoreTeamB = savedInstanceState.getInt("scoreTeamB");
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /*
    * RESETS BOTH COUNTERS TO 0
    * */
    public void resetAll(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /*
    FOR TEAM A
     */
    /*
    * increases the score by 3
    * */
    public void three_points(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void two_points(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void free_throw(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /*
    * Resets the value of score to zero
    * */
    public void reset(View view){
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /*
    * FOR TEAM B
    * */

    /*
  * increases the score by 3
  * */
    public void three_pointsB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void two_pointsB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void free_throwB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /*
    * Resets the value of score to zero
    * */
    public void resetB(View view){
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
