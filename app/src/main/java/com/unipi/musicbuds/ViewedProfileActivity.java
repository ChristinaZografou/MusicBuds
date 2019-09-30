package com.unipi.musicbuds;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ViewedProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_music_viewed);

        View profile = findViewById(R.id.profile_icon);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntent = new Intent(ViewedProfileActivity.this, ProfileMusicActivity.class);
                startActivity(profileIntent);
            }
        });

        View search = findViewById(R.id.search_icon);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(ViewedProfileActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        View home = findViewById(R.id.home_icon);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(ViewedProfileActivity.this, HomeActivity.class);
                startActivity(homeIntent);
            }
        });

        View notifications = findViewById(R.id.notifications_icon);

        notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent notificationsIntent = new Intent(ViewedProfileActivity.this, NotificationsActivity.class);
                startActivity(notificationsIntent);
            }
        });
    }
}
