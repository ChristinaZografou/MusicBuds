package com.unipi.musicbuds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signIn(View view){
        Intent welcomeIntent = new Intent(MainActivity.this, WelcomeActivity.class);
        startActivity(welcomeIntent);
    }
}