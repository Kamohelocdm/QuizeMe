package com.example.ekasilabalexcdtb.quizeme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ekasilabalexcdtb.quizeme.clasess.QuestionRom;


public class BibleActivity extends AppCompatActivity {


    private QuestionRom mQuestionRoom = new QuestionRom();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bible);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);

        updateQuestion();

        //Start of the Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //MY LOGIC FOR BUTTON START HERE
                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    UpdateScore(mScore);
                    updateQuestion();
                    //Toast Massage if the answer is wrong or correct
                    Toast.makeText(BibleActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(BibleActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of the Button Listener for Button1
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //MY LOGIC FOR BUTTON START HERE
                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    UpdateScore(mScore);
                    updateQuestion();
                    //Toast Massage if the answer is wrong or correct
                    Toast.makeText(BibleActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(BibleActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button2

        //Start of the Button Listener for Button1
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //MY LOGIC FOR BUTTON START HERE
                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    UpdateScore(mScore);
                    updateQuestion();
                    //Toast Massage if the answer is wrong or correct
                    Toast.makeText(BibleActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(BibleActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button3

    }

    public void onClick(View view) {
        Intent intent = new Intent(BibleActivity.this, BibleActivity.class);
        startActivity(intent);
    }

    private void updateQuestion() {
        // check if we not outside of array bounds for questions
        if (mQuestionNumber < mQuestionRoom.getLenth()) {
            mQuestionView.setText(mQuestionRoom.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionRoom.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionRoom.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionRoom.getChoice3(mQuestionNumber));
            mAnswer = mQuestionRoom.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;

        }
        else {
            Toast.makeText(BibleActivity.this, "It was the last question!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent (BibleActivity.this,ScoreActivity.class);
            intent.putExtra("score", mScore);// pass the current score to the second screen
            startActivity(intent);
        }
    }

    private void UpdateScore(int point) {
        mScoreView.setText("" + mScore + "/" + mQuestionRoom.getLenth());
    }

    public void quite_cat(View view) {

    }
}