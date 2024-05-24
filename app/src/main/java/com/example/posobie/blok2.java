package com.example.posobie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class blok2 extends AppCompatActivity implements View.OnClickListener {
    Button test_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blok2);
        test_2 = findViewById(R.id.test_2);
        test_2.setOnClickListener(this);
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
            Intent i = new Intent(this, test_blok2.class);
            finish();
            startActivity(i);
    }
}