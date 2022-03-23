package com.example.attempt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;

public class Game_screen extends AppCompatActivity {
    TextView txt;
    ImageButton btn;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        txt=(TextView) findViewById(R.id.dialogue_1);
        btn=(ImageButton) findViewById(R.id.next_1);




                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        txt.setText("Justine: \n " +
                                "*yawns* w-where am I? HUH?");

                        btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                txt.setText("Ayane \n" +
                                        "You slept through the class goofy");

                                btn.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        txt.setText("Ayane \n " +
                                                "Hey, wanna hangout?");

                                        btn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                txt.setText("Ayane \n" +
                                                        "So, where do you wanna go");

                                                btn.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        txt.setText("You will be presented by 4 choices\n" +
                                                                "but you can only choose 2 for now.");

                                                        btn.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                Intent intent = new Intent();
                                                                intent.setClass(Game_screen.this, First_decision.class);
                                                                startActivity(intent);
                                                            }
                                                        });
                                                    }
                                                });

                                            }
                                        });
                                    }
                                });
                            }
                        });

                    }
                });
        }
    }