package com.example.ptb_tb;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = HomeActivity.class.getSimpleName();
    private BottomNavigationView bottomNavigation;
    private Activity activity;
    private ActivityManager activityManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
//        bottomNavigation = (BottomNavigationView) findViewById(R.id.bottom_nav);
//        bottomNavigation.inflateMenu(R.menu.bottom_nav);
//        activityManager = getSupportActivityManager();
//
//        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.home :
//                        Intent home = new Intent(HomeActivity.this, HomeActivity.class);
//                        startActivity(home);
//                        finish();
//                        break;
//                    case R.id.post :
//                        Intent post = new Intent(PostActivity.this, PostActivity.class);
//                        startActivity(post);
//                        finish();
//                        break;
//                    case R.id.profil :
//                        Intent profil = new Intent(ProfilActivity.this, ProfilActivity.class);
//                        startActivity(profil);
//                        finish();
//                        break;
//                }
//                return true;
//            }
//        });
//    }

    public void toPost(View view) {
        Intent postIntent = new Intent(this, PostActivity.class);
        startActivity(postIntent);
    }
}