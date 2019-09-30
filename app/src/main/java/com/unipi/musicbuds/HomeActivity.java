package com.unipi.musicbuds;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        View search = findViewById(R.id.search_icon);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(HomeActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        View profile = findViewById(R.id.profile_icon);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntent = new Intent(HomeActivity.this, ProfilePostsActivity.class);
                startActivity(profileIntent);
            }
        });

        View notifications = findViewById(R.id.notifications_icon);

        notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent notificationsIntent = new Intent(HomeActivity.this, NotificationsActivity.class);
                startActivity(notificationsIntent);
            }
        });
    }
}
