package com.unipi.musicbuds;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfilePostsActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_posts);

        TextView music = (TextView) findViewById(R.id.music);

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicIntent = new Intent(ProfilePostsActivity.this, ProfileMusicActivity.class);
                startActivity(musicIntent);
            }
        });

        View search = findViewById(R.id.search_icon);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(ProfilePostsActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        View home = findViewById(R.id.home_icon);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(ProfilePostsActivity.this, HomeActivity.class);
                startActivity(homeIntent);
            }
        });

        View notifications = findViewById(R.id.notifications_icon);

        notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent notificationsIntent = new Intent(ProfilePostsActivity.this, NotificationsActivity.class);
                startActivity(notificationsIntent);
            }
        });
    }
}
