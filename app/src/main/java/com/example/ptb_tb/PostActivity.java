package com.example.ptb_tb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
    }

    public void toPostWebinar(View view) {
        Intent PostWebinarIntent = new Intent(this, PostWebinarActivity.class);
        startActivity(PostWebinarIntent);
    }

    public void toPostSeminar(View view) {
        Intent PostSeminarIntent = new Intent(this, PostSeminarActivity.class);
        startActivity(PostSeminarIntent);
    }

    public void toHome(View view) {
        Intent homeIntent = new Intent(this, HomeActivity.class);
        startActivity(homeIntent);
    }
}