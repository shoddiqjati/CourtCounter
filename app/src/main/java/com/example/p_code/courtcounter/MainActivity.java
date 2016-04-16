package com.example.p_code.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    String summary;

    Button btnA3;
    Button btnA2;
    Button btnA1;
    Button btnB3;
    Button btnB2;
    Button btnB1;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnA1 = (Button) findViewById(R.id.btn_1_A);
        btnA2 = (Button) findViewById(R.id.btn_2_A);
        btnA3 = (Button) findViewById(R.id.btn_3_A);
        btnB1 = (Button) findViewById(R.id.btn_1_B);
        btnB2 = (Button) findViewById(R.id.btn_2_B);
        btnB3 = (Button) findViewById(R.id.btn_3_B);
        btnReset = (Button) findViewById(R.id.resetBtn);

        /*
        Example of direct EventHandler
        btnA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freeThrowTeamA();
            }
        });
         */

        btnA1.setOnClickListener(this);
        btnA2.setOnClickListener(this);
        btnA3.setOnClickListener(this);
        btnB1.setOnClickListener(this);
        btnB2.setOnClickListener(this);
        btnB3.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsTeamA(){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointsTeamA(){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrowTeamA(){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void threePointsTeamB(){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointsTeamB(){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowTeamB(){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetButton(){
        scoreTeamA = 0;
        scoreTeamB = 0;
        summary = "";
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        //displaySummary(summary);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_1_A:
                freeThrowTeamA();
                break;
            case R.id.btn_1_B:
                freeThrowTeamB();
                break;
            case R.id.btn_2_A:
                twoPointsTeamA();
                break;
            case R.id.btn_2_B:
                twoPointsTeamB();
                break;
            case R.id.btn_3_A:
                threePointsTeamA();
                break;
            case R.id.btn_3_B:
                threePointsTeamB();
                break;
            case R.id.resetBtn:
                resetButton();
                break;
        }
    }

    /*
    Kumpulan Method onClick
     */

    /*public void threePointA (View view) {
        threePointsTeamA();
    }
    public void threePointB (View view) {
        threePointsTeamB();
    }
    public void twoPointA (View view) {
        twoPointsTeamA();
    }
    public void twoPointB (View view) {
        twoPointsTeamB();
    }
    public void freeThrowBtnA (View view) {
        freeThrowTeamA();
    }
    public void freeThrowBtnB (View view) {
        freeThrowTeamB();
    }*/
}
