package com.example.posobie;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class test_blok4 extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {

    RadioGroup q14;
    public int c14,c24,c34;
    RadioGroup q24;
    RadioGroup q34;
    ProgressBar progressBar4;
    public String w14="0",w24="0",w34="0",w44="0",w54="0",w64="0",r14="0",r24="0",r34="0";
    Button res4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_blok4);
        q14 = findViewById(R.id.q14);
        q24 = findViewById(R.id.q24);
        q34 = findViewById(R.id.q34);
        q14.setOnCheckedChangeListener(this);
        progressBar4 = findViewById(R.id.progressBar2);
        q24.setOnCheckedChangeListener(this);
        q34.setOnCheckedChangeListener(this);
        res4 = findViewById(R.id.res4);
        res4.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this, MainActivity.class);
        finish();
        startActivity(i);
    }


    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        String id4 = String.valueOf(i);
        switch (id4){
            case "2131231103":
                progressBar4.setProgress(33);
                w14 = "1";
                w24 = "0";
                r14="0";
                c14=0;
                break;
            case "2131231104":
                progressBar4.setProgress(33);
                w14="0";
                r14="1";
                c14=1;
                w24="0";
                break;
            case "2131231105":
                progressBar4.setProgress(33);
                w24="1";
                w14="0";
                r14="0";
                c14=0;
                break;
            case "58":
                w34="0";
                w44="0";
                r24="1";
                c24=1;
                progressBar4.setProgress(66);
                break;
            case "59":
                w44="0";
                w34="1";
                r24="0";
                c24=0;
                progressBar4.setProgress(66);
                break;
            case "60":
                progressBar4.setProgress(66);
                w34="0";
                w44="1";
                r24="0";
                c24=0;
                break;
            case "61":
                w54="0";
                w64="0";
                r34="1";
                c34=1;
                progressBar4.setProgress(100);
                break;
            case "62":
                w64="0";
                w54="1";
                r34="0";
                c34=0;
                progressBar4.setProgress(100);
                break;
            case "63":
                w54="0";
                w64="1";
                r34="0";
                c34=0;
                progressBar4.setProgress(100);
                break;
        }
    }

    @Override
    public void onClick(View view) {
        String v = String.valueOf(((c14+c24+c34)*100)/3);
        Intent i4 = new Intent(this, Finish_4.class);
        i4.putExtra("res",v);
        i4.putExtra("w14",w14);
        i4.putExtra("w24",w24);
        i4.putExtra("w34",w34);
        i4.putExtra("w44",w44);
        i4.putExtra("w54",w54);
        i4.putExtra("w64",w64);
        i4.putExtra("r14",r14);
        i4.putExtra("r24",r24);
        i4.putExtra("r34",r34);
        finish();
        startActivity(i4);
    }

}