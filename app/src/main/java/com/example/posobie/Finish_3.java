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

public class Finish_3 extends AppCompatActivity implements View.OnTouchListener, View.OnClickListener {
    TextView res;
    TextView sw1;
    TextView sr1;
    TextView sr2;
    TextView sr3;
    TextView sr4;
    TextView sr5;
    TextView sr6;
    TextView sw2;
    TextView sw3;
    TextView sw4;
    TextView sw5;
    TextView sw6;
    TextView sw7;
    TextView sw8;
    TextView sw9;
    TextView sw10;
    TextView sw11;
    TextView sw12;
    Button back;
    Button prov;
    public String w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11,w12,r1,r2,r3,r4,r5,r6;

    @SuppressLint({"MissingInflatedId", "ResourceAsColor"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish3);
        Intent i= getIntent();
        String c = i.getStringExtra("res");
        sw1 = findViewById(R.id.w1);
        sr1 = findViewById(R.id.r1);
        sw2 = findViewById(R.id.w2);
        sr2 = findViewById(R.id.r2);
        sw3 = findViewById(R.id.w3);
        sr3 = findViewById(R.id.r3);
        sw4 = findViewById(R.id.w4);
        sr4 = findViewById(R.id.r4);
        sw5 = findViewById(R.id.w5);
        sr5 = findViewById(R.id.r5);
        sw6 = findViewById(R.id.w6);
        sr6 = findViewById(R.id.r6);
        sw7 = findViewById(R.id.w7);
        sw8 = findViewById(R.id.w8);
        sw9 = findViewById(R.id.w9);
        sw10 = findViewById(R.id.w10);
        sw11 = findViewById(R.id.w11);
        sw12 = findViewById(R.id.w12);
        r1 = i.getStringExtra("r13");
        r2 = i.getStringExtra("r23");
        r3 = i.getStringExtra("r33");
        r4 = i.getStringExtra("r43");
        r5 = i.getStringExtra("r53");
        r6 = i.getStringExtra("r63");
        w1 = i.getStringExtra("w13");
        w2 = i.getStringExtra("w23");
        w3 = i.getStringExtra("w33");
        w4 = i.getStringExtra("w43");
        w5 = i.getStringExtra("w53");
        w6 = i.getStringExtra("w63");
        w7 = i.getStringExtra("w73");
        w8 = i.getStringExtra("w83");
        w9 = i.getStringExtra("w93");
        w10 = i.getStringExtra("w103");
        w11 = i.getStringExtra("w113");
        w12 = i.getStringExtra("w123");
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
        switch (w7){
            case "1": sw7.setTextColor(Color.argb(255,255,0,0));
                sr4.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w8){
            case "1": sw8.setTextColor(Color.argb(255,255,0,0));
                sr4.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w9){
            case "1": sw9.setTextColor(Color.argb(255,255,0,0));
                sr5.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w10){
            case "1": sw10.setTextColor(Color.argb(255,255,0,0));
                sr5.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w11){
            case "1": sw11.setTextColor(Color.argb(255,255,0,0));
                sr6.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w12){
            case "1": sw12.setTextColor(Color.argb(255,255,0,0));
                sr6.setTextColor(Color.argb(255,0,255,0));
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
        switch (r4){
            case "1": sr4.setTextColor(Color.argb(255,0,255,0));
        }
        switch (r5){
            case "1": sr5.setTextColor(Color.argb(255,0,255,0));
        }
        switch (r6){
            case "1": sr6.setTextColor(Color.argb(255,0,255,0));
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