package com.example.posobie;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class test_blok2 extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    RadioGroup q12;
    public int c12,c22,c32,c42,c52,c62,c72,moj=0;
    RadioGroup q22;
    RadioGroup q32;
    RadioGroup q42;
    RadioGroup q52;
    RadioGroup q62;
    RadioGroup q72;
    ProgressBar progressBar2;
    public String w12="0",w22="0",w32="0",w42="0",w52="0",w62="0",w72="0",w82="0",w92="0",w102="0",w112="0",w122="0",w132="0",w142="0",r12="0",r22="0",r32="0",r42="0",r52="0",r62="0",r72="0";
    Button res2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_blok2);
        q12 = findViewById(R.id.q12);
        q22 = findViewById(R.id.q22);
        q32 = findViewById(R.id.q32);
        q42 = findViewById(R.id.q42);
        q52 = findViewById(R.id.q52);
        q62 = findViewById(R.id.q62);
        q72= findViewById(R.id.q72);
        q12.setOnCheckedChangeListener(this);
        progressBar2 = findViewById(R.id.progressBar3);
        q22.setOnCheckedChangeListener(this);
        q32.setOnCheckedChangeListener(this);
        q42.setOnCheckedChangeListener(this);
        q52.setOnCheckedChangeListener(this);
        q62.setOnCheckedChangeListener(this);
        q72.setOnCheckedChangeListener(this);
        res2 = findViewById(R.id.res);
        res2.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this, MainActivity.class);
        finish();
        startActivity(i);
    }


    @Override
    public void onCheckedChanged(RadioGroup radioGroup2, int k) {
        String id2 = String.valueOf(k);
            switch (id2) {
                case "19":
                    progressBar2.setProgress(14);
                    w12 = "1";
                    w22 = "0";
                    r12 = "0";
                    c12 = 0;
                    break;
                case "20":
                    progressBar2.setProgress(14);
                    w12 = "0";
                    r12 = "1";
                    w22 = "0";
                    c12 = 1;
                    break;
                case "21":
                    progressBar2.setProgress(14);
                    w22 = "1";
                    w12 = "0";
                    r12 = "0";
                    c12 = 0;
                    break;
                case "22":
                    w32 = "0";
                    w42 = "0";
                    r22 = "1";
                    c22 = 1;
                    progressBar2.setProgress(28);
                    break;
                case "23":
                    w42 = "0";
                    w32 = "1";
                    r22 = "0";
                    c22 = 0;
                    progressBar2.setProgress(28);
                    break;
                case "24":
                    progressBar2.setProgress(28);
                    w32 = "0";
                    w42 = "1";
                    r22 = "0";
                    c22 = 0;
                    break;
                case "25":
                    w52 = "1";
                    w62 = "0";
                    r32 = "0";
                    c32 = 0;
                    progressBar2.setProgress(40);
                    break;
                case "26":
                    w62 = "1";
                    w52 = "0";
                    r32 = "0";
                    c32 = 0;
                    progressBar2.setProgress(40);
                    break;
                case "27":
                    w52 = "0";
                    w62 = "0";
                    r32 = "1";
                    progressBar2.setProgress(40);
                    c32 = 1;
                    break;
                case "28":
                    w72 = "1";
                    w82 = "0";
                    r42 = "0";
                    c42 = 0;
                    progressBar2.setProgress(57);
                    break;
                case "29":
                    w72 = "0";
                    w82 = "0";
                    r42 = "1";
                    progressBar2.setProgress(57);
                    c42 = 1;
                    break;
                case "30":
                    w82 = "1";
                    w72 = "0";
                    r42 = "0";
                    c42 = 0;
                    progressBar2.setProgress(57);
                    break;
                case "31":
                    w102 = "0";
                    w92 = "1";
                    r52 = "0";
                    progressBar2.setProgress(73);
                    c52 = 0;
                    break;
                case "32":
                    w102 = "0";
                    w92 = "0";
                    r52 = "1";
                    c52 = 1;
                    progressBar2.setProgress(73);
                    break;
                case "33":
                    w102 = "1";
                    w92 = "0";
                    r52 = "0";
                    c52 = 0;
                    progressBar2.setProgress(73);
                    break;
                case "34":
                    w112 = "1";
                    w122 = "0";
                    r62 = "0";
                    c62 = 0;
                    progressBar2.setProgress(86);
                    break;
                case "35":
                    w112 = "0";
                    w122 = "1";
                    r62 = "0";
                    c62 = 0;
                    progressBar2.setProgress(86);
                    break;
                case "36":
                    w112 = "0";
                    w122 = "0";
                    r62 = "1";
                    progressBar2.setProgress(86);
                    c62 = 1;
                    break;
                case "37":
                    w142 = "0";
                    w132 = "0";
                    r72 = "1";
                    c72 = 1;
                    progressBar2.setProgress(100);
                    break;
                case "38":
                    w142 = "0";
                    w132 = "1";
                    r72 = "0";
                    c72 = 0;
                    progressBar2.setProgress(100);
                    break;
                case "39":
                    w142 = "1";
                    w132 = "0";
                    r72 = "0";
                    c72 = 0;
                    progressBar2.setProgress(100);
                    break;

            }
    }

@Override
    public void onClick(View view) {
        String k2 = String.valueOf(((c12+c22+c32+c42+c52+c62+c72)*100)/7);
        Intent i2 = new Intent(this, Finish_2.class);
        i2.putExtra("res2",k2);
    i2.putExtra("w12",w12);
    i2.putExtra("w22",w22);
    i2.putExtra("w32",w32);
    i2.putExtra("w42",w42);
    i2.putExtra("w52",w52);
    i2.putExtra("w62",w62);
    i2.putExtra("w72",w72);
    i2.putExtra("w82",w82);
    i2.putExtra("w92",w92);
    i2.putExtra("w102",w102);
    i2.putExtra("w112",w112);
    i2.putExtra("w122",w122);
    i2.putExtra("w132",w132);
    i2.putExtra("w142",w142);
    i2.putExtra("r12",r12);
    i2.putExtra("r22",r22);
    i2.putExtra("r32",r32);
    i2.putExtra("r42",r42);
    i2.putExtra("r52",r52);
    i2.putExtra("r62",r62);
    i2.putExtra("r72",r72);
    finish();
    startActivity(i2);
    }
}