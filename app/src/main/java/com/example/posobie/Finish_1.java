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

public class Finish_1 extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {
TextView res;
TextView sw11;
TextView sr11;
TextView sr21;
TextView sr31;
TextView sr41;
TextView sr51;
TextView sr61;
TextView sw21;
TextView sw31;
TextView sw41;
TextView sw51;
TextView sw61;
TextView sw71;
TextView sw81;
TextView sw91;
TextView sw101;
TextView sw111;
TextView sw121;
Button back;
Button prov;
    public String w11,w21,w31,w41,w51,w61,w71,w81,w91,w101,w111,w121,r11,r21,r31,r41,r51,r61;

    @SuppressLint({"MissingInflatedId", "ResourceAsColor"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish1);
        Intent i1= getIntent();
        String c = i1.getStringExtra("res1");
        sw11 = findViewById(R.id.w1);
        sr11 = findViewById(R.id.r1);
        sw21 = findViewById(R.id.w2);
        sr21 = findViewById(R.id.r2);
        sw31 = findViewById(R.id.w3);
        sr31 = findViewById(R.id.r3);
        sw41 = findViewById(R.id.w4);
        sr41 = findViewById(R.id.r4);
        sw51 = findViewById(R.id.w5);
        sr51 = findViewById(R.id.r5);
        sw61 = findViewById(R.id.w6);
        sr61 = findViewById(R.id.r6);
        sw71 = findViewById(R.id.w7);
        sw81 = findViewById(R.id.w8);
        sw91 = findViewById(R.id.w9);
        sw101 = findViewById(R.id.w10);
        sw111 = findViewById(R.id.w11);
        sw121 = findViewById(R.id.w12);
        r11 = i1.getStringExtra("r11");
        r21 = i1.getStringExtra("r21");
        r31 = i1.getStringExtra("r31");
        r41 = i1.getStringExtra("r41");
        r51 = i1.getStringExtra("r51");
        r61 = i1.getStringExtra("r61");
        w11 = i1.getStringExtra("w11");
        w21 = i1.getStringExtra("w21");
        w31 = i1.getStringExtra("w31");
        w41 = i1.getStringExtra("w41");
        w51 = i1.getStringExtra("w51");
        w61 = i1.getStringExtra("w61");
        w71 = i1.getStringExtra("w71");
        w81 = i1.getStringExtra("w81");
        w91 = i1.getStringExtra("w91");
        w101 = i1.getStringExtra("w101");
        w111 = i1.getStringExtra("w111");
        w121 = i1.getStringExtra("w121");
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
        switch (w11){
            case "1": sw11.setTextColor(Color.argb(255,255,0,0));
                sr11.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w21){
            case "1": sw21.setTextColor(Color.argb(255,255,0,0));
                sr11.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w31){
            case "1": sw31.setTextColor(Color.argb(255,255,0,0));
                sr21.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w41){
            case "1": sw41.setTextColor(Color.argb(255,255,0,0));
                sr21.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w51){
            case "1": sw51.setTextColor(Color.argb(255,255,0,0));
                sr31.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w61){
            case "1": sw61.setTextColor(Color.argb(255,255,0,0));
                sr31.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w71){
            case "1": sw71.setTextColor(Color.argb(255,255,0,0));
                sr41.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w81){
            case "1": sw81.setTextColor(Color.argb(255,255,0,0));
                sr41.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w91){
            case "1": sw91.setTextColor(Color.argb(255,255,0,0));
                sr51.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w101){
            case "1": sw101.setTextColor(Color.argb(255,255,0,0));
                sr51.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w111){
            case "1": sw111.setTextColor(Color.argb(255,255,0,0));
                sr61.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w121){
            case "1": sw121.setTextColor(Color.argb(255,255,0,0));
                sr61.setTextColor(Color.argb(255,0,255,0));
        }
        switch (r11){
            case "1": sr11.setTextColor(Color.argb(255,0,255,0));
        }
        switch (r21){
            case "1": sr21.setTextColor(Color.argb(255,0,255,0));
        }
        switch (r31){
            case "1": sr31.setTextColor(Color.argb(255,0,255,0));
        }
        switch (r41){
            case "1": sr41.setTextColor(Color.argb(255,0,255,0));
        }
        switch (r51){
            case "1": sr51.setTextColor(Color.argb(255,0,255,0));
        }
        switch (r61){
            case "1": sr61.setTextColor(Color.argb(255,0,255,0));
        }
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Intent a = new Intent(this,MainActivity.class);
        finish();
        startActivity(a);
        return false;
    }
}