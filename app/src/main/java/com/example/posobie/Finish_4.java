package com.example.posobie;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Finish_4 extends AppCompatActivity implements View.OnTouchListener, View.OnClickListener {
    TextView res;
    TextView sw1;
    TextView sr1;
    TextView sr2;
    TextView sr3;
    TextView sw2;
    TextView sw3;
    TextView sw4;
    TextView sw5;
    TextView sw6;
    Button back;
    Button prov;
    public String w1,w2,w3,w4,w5,w6,r1,r2,r3;

    @SuppressLint({"MissingInflatedId", "ResourceAsColor"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish4);
        Intent i= getIntent();
        String c = i.getStringExtra("res");
        sw1 = findViewById(R.id.w1);
        sr1 = findViewById(R.id.r1);
        sw2 = findViewById(R.id.w2);
        sr2 = findViewById(R.id.r2);
        sw3 = findViewById(R.id.w3);
        sr3 = findViewById(R.id.r3);
        sw4 = findViewById(R.id.w4);
        sw5 = findViewById(R.id.w5);
        sw6 = findViewById(R.id.w6);
        r1 = i.getStringExtra("r14");
        r2 = i.getStringExtra("r24");
        r3 = i.getStringExtra("r34");
        w1 = i.getStringExtra("w14");
        w2 = i.getStringExtra("w24");
        w3 = i.getStringExtra("w34");
        w4 = i.getStringExtra("w44");
        w5 = i.getStringExtra("w54");
        w6 = i.getStringExtra("w64");
        res = findViewById(R.id.res);
        res.setText("Ваш результат: "+c+"%");
        back = findViewById(R.id.back);
        prov = findViewById(R.id.prov);
        back.setOnTouchListener(this);
        prov.setOnClickListener(this);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View view) {
        switch (w1){
            case "1": sw1.setTextColor(Color.argb(255,255,0,0));
                sr1.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w2){
            case "1": sw2.setTextColor(Color.argb(255,255,0,0));
                sr1.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w3){
            case "1": sw3.setTextColor(Color.argb(255,255,0,0));
                sr2.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w4){
            case "1": sw4.setTextColor(Color.argb(255,255,0,0));
                sr2.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w5){
            case "1": sw5.setTextColor(Color.argb(255,255,0,0));
                sr3.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w6){
            case "1": sw6.setTextColor(Color.argb(255,255,0,0));
                sr3.setTextColor(Color.argb(255,0,255,0));
        }
        switch (r1){
            case "1": sr1.setTextColor(Color.argb(255,0,255,0));
        }
        switch (r2){
            case "1": sr2.setTextColor(Color.argb(255,0,255,0));
        }
        switch (r3){
            case "1": sr3.setTextColor(Color.argb(255,0,255,0));
        }
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Intent a = new Intent(this, MainActivity.class);
        finish();
        startActivity(a);

        return false;
    }

}