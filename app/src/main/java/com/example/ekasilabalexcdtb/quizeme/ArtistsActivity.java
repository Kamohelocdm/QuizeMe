package com.example.ekasilabalexcdtb.quizeme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ekasilabalexcdtb.quizeme.clasess.QuestionRom;

public class ArtistsActivity extends AppCompatActivity {


    private QuestionRom aQuestionRoom = new QuestionRom();

    private TextView aScoreView;
    private TextView aQuestionView;
    private Button aButtonChoice1;
    private Button aButtonChoice2;
    private Button aButtonChoice3;

    private String mAnswer;
    private int aScore = 0;
    private int aQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        aScoreView = (TextView) findViewById(R.id.art_score);
        aQuestionView = (TextView) findViewById(R.id.art_question);
        aButtonChoice1 = (Button) findViewById(R.id.art_choice1);
        aButtonChoice2 = (Button) findViewById(R.id.art_choice2);
        aButtonChoice3 = (Button) findViewById(R.id.art_choice3);

        updateQuestion();

        //Start of the Button Listener for Button1
        aButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //MY LOGIC FOR BUTTON START HERE
                if (aButtonChoice1.getText() == mAnswer) {
                    aScore = aScore + 1;
                    UpdateScore(aScore);
                    updateQuestion();
                    //Toast Massage if the answer is wrong or correct
                    Toast.makeText(ArtistsActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ArtistsActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of the Button Listener for Button1
        aButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //MY LOGIC FOR BUTTON START HERE
                if (aButtonChoice2.getText() == mAnswer) {
                    aScore = aScore + 1;
                    UpdateScore(aScore);
                    updateQuestion();
                    //Toast Massage if the answer is wrong or correct
                    Toast.makeText(ArtistsActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ArtistsActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button2

        //Start of the Button Listener for Button1
        aButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //MY LOGIC FOR BUTTON START HERE
                if (aButtonChoice3.getText() == mAnswer) {
                    aScore = aScore + 1;
                    UpdateScore(aScore);
                    updateQuestion();
                    //Toast Massage if the answer is wrong or correct
                    Toast.makeText(ArtistsActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ArtistsActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button3

    }

    private void updateQuestion() {
        // check if we not outside of array bounds for questions
        if (aQuestionNumber < aQuestionRoom.getLenthss()) {
            aQuestionView.setText(aQuestionRoom.getQuestionss(aQuestionNumber));
            aButtonChoice1.setText(aQuestionRoom.getChoice7(aQuestionNumber));
            aButtonChoice2.setText(aQuestionRoom.getChoice8(aQuestionNumber));
            aButtonChoice3.setText(aQuestionRoom.getChoice9(aQuestionNumber));
            mAnswer = aQuestionRoom.getCorrectAnswerss(aQuestionNumber);
            aQuestionNumber++;

        }
        else {
            Toast.makeText(ArtistsActivity.this, "It was the last question!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent (ArtistsActivity.this,ArtistsScore.class);
            intent.putExtra("score2", aScore);// pass the current score to the second screen
            startActivity(intent);
        }
    }

    private void UpdateScore(int point) {
        aScoreView.setText("" + aScore + "/" + aQuestionRoom.getLenthss());
    }
}
