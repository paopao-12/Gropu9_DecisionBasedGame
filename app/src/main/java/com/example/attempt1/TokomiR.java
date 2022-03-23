package com.example.attempt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class TokomiR extends AppCompatActivity {
    TextView txt;
    ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokomi_r);

        txt=(TextView) findViewById(R.id.TokomiR);
        btn=(ImageButton) findViewById(R.id.Next2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("Justine \n " +
                        "Do you really have to bring it up again?\n" +
                        "That was before, I'm not a dork anymore");

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        txt.setText("Ayane: \n" +
                                "I am only bringing up good memories, you know? \n" +
                                "Do you remember those times when we still play badminton?");

                        btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                txt.setText("Justine: \n" +
                                        "Yea,  you always lose to m- \n" +
                                        "*shuttlecock hits*");

                                btn.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        txt.setText("Tokomi: \n" +
                                                "Hey you, dumbass! Who do you think you are?\n" +
                                                "Why are you so close to the net?");

                                        btn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                txt.setText("Ayane: \n" +
                                                        "Justine, don't worry it was just an accident.");

                                                btn.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        txt.setText("Justine: \n" +
                                                                "My head hurts \n" +
                                                                "*scratches forehead*");

                                                        btn.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                txt.setText("Tokomi: \n" +
                                                                        "I didn't know, I grazed you. \n" +
                                                                        "Here.... *offers a band-aid*");

                                                                btn.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View view) {
                                                                        Intent intent = new Intent();
                                                                        intent.setClass(TokomiR.this, Home.class);
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
                });
            }
        });

    }
}