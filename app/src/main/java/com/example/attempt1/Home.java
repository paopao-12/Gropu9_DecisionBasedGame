package com.example.attempt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    TextView txt;
    ImageButton btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txt=(TextView) findViewById(R.id.Home1);
        btn=(ImageButton) findViewById(R.id.Next2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("Justine: \n" +
                        "As If I know? She even has the guts to get angry after what she did");

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        txt.setText("Ayane: \n" +
                                "What year does she belong to anyway? \n" +
                                "She acts like a senpai..");

                        btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                txt.setText("Justine: \n" +
                                        "I think she is in the same level as we are");

                                btn.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        txt.setText("Ayane: \n " +
                                                "Just forget it! Let's just go home!");


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