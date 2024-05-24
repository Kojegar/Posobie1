package com.example.posobie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity implements View.OnClickListener {
    ImageButton ental;
    ImageButton entrop;
    ImageButton gibs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        ental = findViewById(R.id.ental);
        entrop = findViewById(R.id.entrop);
        gibs = findViewById(R.id.gibs);
        gibs.setOnClickListener(this);
        ental.setOnClickListener(this);
        entrop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (String.valueOf(view.getId())) {
            case "2131230920":
                Intent i = new Intent(this, Ental.class);
                finish();
                startActivity(i);
                break;
            case "2131230923":
                Intent a = new Intent(this, Entrop.class);
                finish();
                startActivity(a);
                break;
            case "2131230946":
                Intent b = new Intent(this, Gibs.class);
                finish();
                startActivity(b);
                break;
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this, MainActivity.class);
        finish();
        startActivity(i);
    }
}