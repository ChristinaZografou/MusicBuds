package com.unipi.musicbuds;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class NotificationsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        View search = findViewById(R.id.search_icon);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(NotificationsActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        View profile = findViewById(R.id.profile_icon);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntent = new Intent(NotificationsActivity.this, ProfilePostsActivity.class);
                startActivity(profileIntent);
            }
        });

        View home = findViewById(R.id.home_icon);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(NotificationsActivity.this, HomeActivity.class);
                startActivity(homeIntent);
            }
        });
    }
}
