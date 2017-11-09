package com.example.ekasilabalexcdtb.quizeme;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {

                case R.id.navigation_bible:
                    Intent intent = new Intent(MainActivity.this,BibleActivity.class);
                    startActivity(intent);
                    mImageView.setVisibility(View.VISIBLE);

                    return true;


                case R.id.navigation_places:
                    Intent intent1 = new Intent(MainActivity.this,PlacesActivity.class);
                    startActivity(intent1);
                    return true;

                case R.id.navigation_artists:
                    Intent intent2 = new Intent(MainActivity.this,ArtistsActivity.class);
                    startActivity(intent2);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = (ImageView)findViewById(R.id.quiz_pic);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
