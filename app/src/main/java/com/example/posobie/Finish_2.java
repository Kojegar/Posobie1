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

public class Finish_2 extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {

    TextView res2;
    TextView sw12;
    TextView sr12;
    TextView sr22;
    TextView sr32;
    TextView sr42;
    TextView sr52;
    TextView sr62;
    TextView sr72;
    TextView sw22;
    TextView sw32;
    TextView sw42;
    TextView sw52;
    TextView sw62;
    TextView sw72;
    TextView sw82;
    TextView sw92;
    TextView sw102;
    TextView sw112;
    TextView sw122;
    TextView sw132;
    TextView sw142;
    Button back;
    Button prov;
    public String w12,w22,w32,w42,w52,w62,w72,w82,w92,w102,w112,w122,w132,w142,r12,r22,r32,r42,r52,r62,r72;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish2);
        Intent i2= getIntent();
        String c = i2.getStringExtra("res2");
        sw12 = findViewById(R.id.w1);
        sr12 = findViewById(R.id.r1);
        sw22 = findViewById(R.id.w2);
        sr22 = findViewById(R.id.r2);
        sw32 = findViewById(R.id.w3);
        sr32 = findViewById(R.id.r3);
        sw42 = findViewById(R.id.w4);
        sr42 = findViewById(R.id.r4);
        sw52 = findViewById(R.id.w5);
        sr52 = findViewById(R.id.r5);
        sw62 = findViewById(R.id.w6);
        sr62 = findViewById(R.id.r6);
        sr72 = findViewById(R.id.r7);
        sw72 = findViewById(R.id.w7);
        sw82 = findViewById(R.id.w8);
        sw92 = findViewById(R.id.w9);
        sw102 = findViewById(R.id.w10);
        sw112 = findViewById(R.id.w11);
        sw122 = findViewById(R.id.w12);
        sw132 = findViewById(R.id.w13);
        sw142 = findViewById(R.id.w14);
        r12 = i2.getStringExtra("r12");
        r22 = i2.getStringExtra("r22");
        r32 = i2.getStringExtra("r32");
        r42 = i2.getStringExtra("r42");
        r52 = i2.getStringExtra("r52");
        r62 = i2.getStringExtra("r62");
        r72 = i2.getStringExtra("r72");
        w12 = i2.getStringExtra("w12");
        w22 = i2.getStringExtra("w22");
        w32 = i2.getStringExtra("w32");
        w42 = i2.getStringExtra("w42");
        w52 = i2.getStringExtra("w52");
        w62 = i2.getStringExtra("w62");
        w72 = i2.getStringExtra("w72");
        w82 = i2.getStringExtra("w82");
        w92 = i2.getStringExtra("w92");
        w102 = i2.getStringExtra("w102");
        w112 = i2.getStringExtra("w112");
        w122 = i2.getStringExtra("w122");
        w132 = i2.getStringExtra("w132");
        w142 = i2.getStringExtra("w142");
        res2 = findViewById(R.id.res);
        res2.setText("Ваш результат: "+c+"%");
        back = findViewById(R.id.back);
        back.setOnTouchListener(this);
        prov = findViewById(R.id.prov);
        prov.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (w12){
            case "1": sw12.setTextColor(Color.argb(255,255,0,0));
                sr12.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w22){
            case "1": sw22.setTextColor(Color.argb(255,255,0,0));
                sr12.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w32){
            case "1": sw32.setTextColor(Color.argb(255,255,0,0));
                sr22.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w42){
            case "1": sw42.setTextColor(Color.argb(255,255,0,0));
                sr22.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w52){
            case "1": sw52.setTextColor(Color.argb(255,255,0,0));
                sr32.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w62){
            case "1": sw62.setTextColor(Color.argb(255,255,0,0));
                sr32.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w72){
            case "1": sw72.setTextColor(Color.argb(255,255,0,0));
                sr42.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w82){
            case "1": sw82.setTextColor(Color.argb(255,255,0,0));
                sr42.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w92){
            case "1": sw92.setTextColor(Color.argb(255,255,0,0));
                sr52.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w102){
            case "1": sw102.setTextColor(Color.argb(255,255,0,0));
                sr52.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w112){
            case "1": sw112.setTextColor(Color.argb(255,255,0,0));
                sr62.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w122){
            case "1": sw122.setTextColor(Color.argb(255,255,0,0));
                sr62.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w132){
            case "1": sw132.setTextColor(Color.argb(255,255,0,0));
                sr72.setTextColor(Color.argb(255,0,255,0));
        }
        switch (w142){
            case "1": sw142.setTextColor(Color.argb(255,255,0,0));
                sr72.setTextColor(Color.argb(255,0,255,0));
        }
        switch (r12){
            case "1": sr12.setTextColor(Color.argb(255,0,255,0));
        }
        switch (r22){
            case "1": sr22.setTextColor(Color.argb(255,0,255,0));
        }
        switch (r32){
            case "1": sr32.setTextColor(Color.argb(255,0,255,0));
        }
        switch (r42){
            case "1": sr42.setTextColor(Color.argb(255,0,255,0));
        }
        switch (r52){
            case "1": sr52.setTextColor(Color.argb(255,0,255,0));
        }
        switch (r62){
            case "1": sr62.setTextColor(Color.argb(255,0,255,0));
        }
        switch (r72){
            case "1": sr72.setTextColor(Color.argb(255,0,255,0));
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Intent a = new Intent(this, MainActivity.class);
        finish();
        startActivity(a);
        return false;
    }
}