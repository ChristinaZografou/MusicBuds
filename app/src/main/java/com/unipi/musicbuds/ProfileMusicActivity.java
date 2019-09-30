package com.unipi.musicbuds;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_music_editable);

        TextView posts = (TextView) findViewById(R.id.posts);

        posts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent postsIntent = new Intent(ProfileMusicActivity.this, ProfilePostsActivity.class);
                startActivity(postsIntent);
            }
        });

        View search = findViewById(R.id.search_icon);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(ProfileMusicActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        View home = findViewById(R.id.home_icon);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(ProfileMusicActivity.this, HomeActivity.class);
                startActivity(homeIntent);
            }
        });

        View notifications = findViewById(R.id.notifications_icon);

        notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent notificationsIntent = new Intent(ProfileMusicActivity.this, NotificationsActivity.class);
                startActivity(notificationsIntent);
            }
        });
    }

}
