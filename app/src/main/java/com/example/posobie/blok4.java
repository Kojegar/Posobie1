package com.example.posobie;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class blok4 extends AppCompatActivity implements View.OnClickListener {
Button test4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blok4);
        test4=findViewById(R.id.test4);
        test4.setOnClickListener(this);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this, MainActivity.class);
        finish();
        startActivity(i);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, test_blok4.class);
        finish();
        startActivity(i);
    }
}