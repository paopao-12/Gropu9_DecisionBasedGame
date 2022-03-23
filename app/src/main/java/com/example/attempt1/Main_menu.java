package com.example.attempt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;


public class Main_menu extends AppCompatActivity {
    MediaPlayer mysong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mysong = MediaPlayer.create(Main_menu.this,R.raw.music_1);
        mysong.start();


        Button NewGameBTN = findViewById(R.id.BTN_start);
        TextView TextviewBTN = findViewById(R.id.BTN_TITLE);
        Button QuitBTN = findViewById(R.id.BTN_Quit);
        Button LoadGameBTN = findViewById(R.id.BTN_LoadGame);
        Button HelpBTN = findViewById(R.id.BTN_Help);



        QuitBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });

        NewGameBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Start();
            }
        });
    }
    @Override
    protected void onPause() {
        super.onPause();
        mysong.release();
        finish();

    }

    private void Start(){
        Intent intent = new Intent(this, Game_screen.class);
        startActivity(intent);

    }

    private void enableFullscreen() {
        View decorView = getWindow().getDecorView();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                            View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                            View.SYSTEM_UI_FLAG_FULLSCREEN |
                            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        }
    }
}

