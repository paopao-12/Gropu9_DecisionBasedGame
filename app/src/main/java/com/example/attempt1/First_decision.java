package com.example.attempt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First_decision extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstdecision);

        Button TokomiBTN = findViewById(R.id.TOKOMI);
        TokomiBTN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(First_decision. this, TokomiR.class);
                startActivity(intent);
            }
        });
    }
    }
