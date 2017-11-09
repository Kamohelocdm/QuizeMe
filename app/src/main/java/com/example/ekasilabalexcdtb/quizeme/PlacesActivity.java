package com.example.ekasilabalexcdtb.quizeme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ekasilabalexcdtb.quizeme.clasess.QuestionRom;

public class PlacesActivity extends AppCompatActivity  {


    private QuestionRom pQuestionRoom = new QuestionRom();

    private TextView pScoreView;
    private TextView pQuestionView;
    private Button pButtonChoice1;
    private Button pButtonChoice2;
    private Button pButtonChoice3;

    private String mAnswer;
    private int pScore = 0;
    private int pQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pScoreView = (TextView) findViewById(R.id.score_place);
        pQuestionView = (TextView) findViewById(R.id.pquestion);
        pButtonChoice1 = (Button) findViewById(R.id.place_choice1);
        pButtonChoice2 = (Button) findViewById(R.id.place_choice2);
        pButtonChoice3 = (Button) findViewById(R.id.place_choice3);

        updateQuestion();

        //Start of the Button Listener for Button1
        pButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //MY LOGIC FOR BUTTON START HERE
                if (pButtonChoice1.getText() == mAnswer) {
                    pScore = pScore + 1;
                    UpdateScore(pScore);
                    updateQuestion();
                    //Toast Massage if the answer is wrong or correct
                    Toast.makeText(PlacesActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(PlacesActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of the Button Listener for Button1
        pButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //MY LOGIC FOR BUTTON START HERE
                if (pButtonChoice2.getText() == mAnswer) {
                    pScore = pScore + 1;
                    UpdateScore(pScore);
                    updateQuestion();
                    //Toast Massage if the answer is wrong or correct
                    Toast.makeText(PlacesActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(PlacesActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button2

        //Start of the Button Listener for Button1
        pButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //MY LOGIC FOR BUTTON START HERE
                if (pButtonChoice3.getText() == mAnswer) {
                    pScore = pScore + 1;
                    UpdateScore(pScore);
                    updateQuestion();
                    //Toast Massage if the answer is wrong or correct
                    Toast.makeText(PlacesActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(PlacesActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button3

    }

    private void updateQuestion() {
        // check if we not outside of array bounds for questions
        if (pQuestionNumber < pQuestionRoom.getLenths()) {
            pQuestionView.setText(pQuestionRoom.getQuestions(pQuestionNumber));
            pButtonChoice1.setText(pQuestionRoom.getChoice4(pQuestionNumber));
            pButtonChoice2.setText(pQuestionRoom.getChoice5(pQuestionNumber));
            pButtonChoice3.setText(pQuestionRoom.getChoice6(pQuestionNumber));
            mAnswer = pQuestionRoom.getCorrectAnswers(pQuestionNumber);
            pQuestionNumber++;

        }
        else {
            Toast.makeText(PlacesActivity.this, "It was the last question!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent (PlacesActivity.this,ScorePlace.class);
            intent.putExtra("score1", pScore);// pass the current score to the second screen
            startActivity(intent);
        }
    }

    private void UpdateScore(int point) {
        pScoreView.setText("" + pScore + "/" + pQuestionRoom.getLenths());
    }
}