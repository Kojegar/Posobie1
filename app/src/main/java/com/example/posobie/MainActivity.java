package com.example.posobie;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {
    ImageButton blok1;
    ImageButton blok2;
    ImageButton blok3;
    ImageButton blok4;
    Button cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blok1 = findViewById(R.id.blok1);
        blok2 = findViewById(R.id.blok2);
        blok3 = findViewById(R.id.blok3);
        blok4 = findViewById(R.id.blok4);
        cal = findViewById(R.id.cal);
        blok1.setOnClickListener(this);
        blok2.setOnClickListener(this);
        blok3.setOnClickListener(this);
        blok4.setOnClickListener(this);
        cal.setOnTouchListener(this);


    }


    @Override
    public void onClick(View view) {
        String s = String.valueOf(view.getId());
        switch (s){
            case "2131230814":
                Intent i = new Intent(this, blok1.class);
                finish();
                startActivity(i);
                break;
            case "2131230815":
                Intent a = new Intent(this, blok2.class);
                finish();
                startActivity(a);
                break;
            case "2131230816":
                Intent b = new Intent(this, blok3.class);
                finish();
                startActivity(b);
                break;
            case "2131230817":
                Intent c = new Intent(this, blok4.class);
                finish();
                startActivity(c);
                break;
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Intent i = new Intent(this, Calculator.class);
        finish();
        startActivity(i);
        return false;
    }
}