package com.example.ekasilabalexcdtb.quizeme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ArtistsScore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists_score);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView txtScore = (TextView) findViewById(R.id.artScore);

        // recieve the score from the last activity by intent
        Intent intent = getIntent();
        int score = intent.getIntExtra("score2", 0);
        //set the current score at screen
        txtScore.setText("Your score: " + score);

    }


    public void Artists(View view) {
        Intent intent = new Intent(ArtistsScore.this, ArtistsActivity.class);
        startActivity(intent);
    }
}

