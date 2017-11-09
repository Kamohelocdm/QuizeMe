package com.example.ekasilabalexcdtb.quizeme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView txtScore = (TextView) findViewById(R.id.textScore);

        // recieve the score from the last activity by intent
        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        //set the current score at screen
        txtScore.setText("Your score: " + score);

    }
    public void onClick(View view) {
        Intent intent = new Intent(ScoreActivity.this, BibleActivity.class);
        startActivity(intent);
    }
}

