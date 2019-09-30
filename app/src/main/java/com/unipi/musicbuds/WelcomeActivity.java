package com.unipi.musicbuds;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__welcome);
    }

    public void addMusic(View view){
        Intent addMusicIntent = new Intent(WelcomeActivity.this, AddMusicActivity.class);
        startActivity(addMusicIntent);
    }
}
