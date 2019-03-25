package com.example.currencyconversionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView tv = findViewById(R.id.tv_result);
        Intent intent = getIntent();
        String usD = intent.getStringExtra("us");
        String auD = intent.getStringExtra("au");
        String euD = intent.getStringExtra("eu");
        String text = usD + "\n" + auD + "\nEuros: "+euD;

        tv.setText(text);
    }
}
