package com.unipi.musicbuds;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        View recommendation = findViewById(R.id.recom_image3);

        recommendation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recommendationIntent = new Intent(SearchActivity.this, ViewedProfileActivity.class);
                startActivity(recommendationIntent);
            }
        });

        View profile = findViewById(R.id.profile_icon);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntent = new Intent(SearchActivity.this, ProfilePostsActivity.class);
                startActivity(profileIntent);
            }
        });

        View home = findViewById(R.id.home_icon);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(SearchActivity.this, HomeActivity.class);
                startActivity(homeIntent);
            }
        });

        View notifications = findViewById(R.id.notifications_icon);

        notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent notificationsIntent = new Intent(SearchActivity.this, NotificationsActivity.class);
                startActivity(notificationsIntent);
            }
        });
    }
}
