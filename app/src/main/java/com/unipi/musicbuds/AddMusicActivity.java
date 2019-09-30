package com.unipi.musicbuds;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AddMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_music);
    }

    public void landOnPage(View view){
        Intent landingIntent = new Intent(AddMusicActivity.this, ProfilePostsActivity.class);
        startActivity(landingIntent);
    }
}
