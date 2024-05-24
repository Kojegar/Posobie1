package com.example.posobie;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class blok1 extends AppCompatActivity implements View.OnClickListener {
    Button test_1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blok1);
        test_1 = findViewById(R.id.test_1);
        test_1.setOnClickListener(this);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this, MainActivity.class);
        finish();
        startActivity(i);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this, test_blok1.class);
        finish();
        startActivity(i);
    }
}