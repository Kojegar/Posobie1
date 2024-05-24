package com.example.posobie;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class test_blok3 extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    RadioGroup q13;
    public int c13,c23,c33,c43,c53,c63;
    RadioGroup q23;
    RadioGroup q33;
    RadioGroup q43;
    RadioGroup q53;
    RadioGroup q63;
    ProgressBar progressBar3;
    public String w13="0",w23="0",w33="0",w43="0",w53="0",w63="0",w73="0",w83="0",w93="0",w103="0",w113="0",w123="0",r13="0",r23="0",r33="0",r43="0",r53="0",r63="0";
    Button res3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_blok3);
        q13 = findViewById(R.id.q13);
        q23 = findViewById(R.id.q23);
        q33 = findViewById(R.id.q33);
        q43 = findViewById(R.id.q43);
        q53 = findViewById(R.id.q53);
        q63 = findViewById(R.id.q63);
        q13.setOnCheckedChangeListener(this);
        progressBar3 = findViewById(R.id.progressBar2);
        q23.setOnCheckedChangeListener(this);
        q33.setOnCheckedChangeListener(this);
        q43.setOnCheckedChangeListener(this);
        q53.setOnCheckedChangeListener(this);
        q63.setOnCheckedChangeListener(this);
        res3 = findViewById(R.id.res3);
        res3.setOnClickListener(this);
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
        String id3 = String.valueOf(i);
        switch (id3){
            case "40":
                progressBar3.setProgress(16);
                w13 = "0";
                w23 = "0";
                r13="1";
                c13=1;
                break;
            case "41":
                progressBar3.setProgress(16);
                w13="1";
                r13="0";
                w23="0";
                c13=0;
                break;
            case "42":
                progressBar3.setProgress(16);
                w23="1";
                w13="0";
                r13="0";
                c13=0;
                break;
            case "43":
                w33="0";
                w43="0";
                r23="1";
                c23=1;
                progressBar3.setProgress(33);
                break;
            case "44":
                w43="1";
                w33="0";
                r23="0";
                c23=0;
                progressBar3.setProgress(33);
                break;
            case "45":
                progressBar3.setProgress(33);
                w33="1";
                w43="0";
                r23="0";
                c23=0;
                break;
            case "46":
                w53="0";
                w63="0";
                r33="1";
                c33=1;
                progressBar3.setProgress(49);
                break;
            case "47":
                w63="0";
                w53="1";
                r33="0";
                c33=0;
                progressBar3.setProgress(49);
                break;
            case "48":
                w53="0";
                w63="1";
                r33="0";
                c33=0;
                progressBar3.setProgress(49);
                break;
            case "49":
                w73="0";
                w83="0";
                r43="1";
                c43=1;
                progressBar3.setProgress(64);
                break;
            case "50":
                w73="1";
                w83="0";
                r43="0";
                c43=0;
                progressBar3.setProgress(64);
                break;
            case "51":
                w83="1";
                w73="0";
                r43="0";
                c43=0;
                progressBar3.setProgress(64);
                break;
            case "52":
                w103="1";
                w93="0";
                r53="0";
                c53=0;
                progressBar3.setProgress(82);
                break;
            case "53":
                w103="0";
                w93="1";
                r53="0";
                c53=0;
                progressBar3.setProgress(82);
                break;
            case "54":
                w103="0";
                w93="0";
                r53="1";
                c53=1;
                progressBar3.setProgress(82);
                break;
            case "55":
                w113="1";
                w123="0";
                r63="0";
                c63=0;
                progressBar3.setProgress(100);
                break;
            case "56":
                w113="0";
                w123="0";
                r63="1";
                c63=1;
                progressBar3.setProgress(100);
                break;
            case "57":
                w113="0";
                w123="1";
                r63="0";
                c63=0;
                progressBar3.setProgress(100);
                break;
        }
    }

    @Override
    public void onClick(View view) {
        String m = String.valueOf(((c13+c23+c33+c43+c53+c63)*100)/6);
        Intent i3 = new Intent(this, Finish_3.class);
        i3.putExtra("res",m);
        i3.putExtra("w13",w13);
        i3.putExtra("w23",w23);
        i3.putExtra("w33",w33);
        i3.putExtra("w43",w43);
        i3.putExtra("w53",w53);
        i3.putExtra("w63",w63);
        i3.putExtra("w73",w73);
        i3.putExtra("w83",w83);
        i3.putExtra("w93",w93);
        i3.putExtra("w103",w103);
        i3.putExtra("w113",w113);
        i3.putExtra("w123",w123);
        i3.putExtra("r13",r13);
        i3.putExtra("r23",r23);
        i3.putExtra("r33",r33);
        i3.putExtra("r43",r43);
        i3.putExtra("r53",r53);
        i3.putExtra("r63",r63);
        finish();
        startActivity(i3);
    }

}