package com.example.posobie;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class test_blok1 extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
RadioGroup q11;
public int c11,c21,c31,c41,c51,c61;
public String w11="0",w21="0",w31="0",w41="0",w51="0",w61="0",w71="0",w81="0",w91="0",w101="0",w111="0",w121="0",r11="0",r21="0",r31="0",r41="0",r51="0",r61="0";
RadioGroup q21;
RadioGroup q31;
RadioGroup q41;
RadioGroup q51;
RadioGroup q61;
ProgressBar progressBar1;
Button res1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_blok1);
        q11 = findViewById(R.id.q11);
        q21 = findViewById(R.id.q21);
        q31 = findViewById(R.id.q31);
        q41 = findViewById(R.id.q41);
        q51 = findViewById(R.id.q51);
        q61 = findViewById(R.id.q61);
        q11.setOnCheckedChangeListener(this);
        progressBar1 = findViewById(R.id.progressBar2);
        q21.setOnCheckedChangeListener(this);
        q31.setOnCheckedChangeListener(this);
        q41.setOnCheckedChangeListener(this);
        q51.setOnCheckedChangeListener(this);
        q61.setOnCheckedChangeListener(this);
        res1 = findViewById(R.id.res);
        res1.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i_back = new Intent(this, MainActivity.class);
        finish();
        startActivity(i_back);
    }


    @Override
    public void onCheckedChanged(RadioGroup radioGroup1, int i) {
        String id1 = String.valueOf(i);
        switch (id1){
            case "1":
                progressBar1.setProgress(16);
                w11 = "1";
                w21 = "0";
                r11="0";
                c11=0;
                break;
            case "22":
                progressBar1.setProgress(16);
                w11 = "1";
                w21 = "0";
                r11="0";
                c11=0;
                break;
            case "2":
                progressBar1.setProgress(16);
                c11=1;
                w11="0";
                r11="1";
                w21="0";
                break;
            case "23":
                progressBar1.setProgress(16);
                c11=1;
                w11="0";
                r11="1";
                w21="0";
                break;
            case "3":
                progressBar1.setProgress(16);
                w21="1";
                w11="0";
                c11=0;
                r11="0";
                break;
            case "24":
                progressBar1.setProgress(16);
                w21="1";
                w11="0";
                c11=0;
                r11="0";
                break;
            case "4":
                w31="1";
                c21=0;
                w41="0";
                r21="0";
                progressBar1.setProgress(33);
                break;
            case "25":
                w31="1";
                c21=0;
                w41="0";
                r21="0";
                progressBar1.setProgress(33);
                break;
            case "5":
                w41="1";
                w31="0";
                r21="0";
                c21=0;
                progressBar1.setProgress(33);
                break;
            case "26":
                w41="1";
                w31="0";
                r21="0";
                c21=0;
                progressBar1.setProgress(33);
                break;
            case "6":
                progressBar1.setProgress(33);
                w31="0";
                w41="0";
                r21="1";
                c21=1;
                break;
            case "27":
                progressBar1.setProgress(33);
                w31="0";
                w41="0";
                r21="1";
                c21=1;
                break;
            case "7":
                w51="1";
                w61="0";
                r31="0";
                c31=0;
                progressBar1.setProgress(50);
                break;
            case "28":
                w51="1";
                w61="0";
                r31="0";
                c31=0;
                progressBar1.setProgress(50);
                break;
            case "8":
                w61="1";
                w51="0";
                r31="0";
                c31=0;
                progressBar1.setProgress(50);
                break;
            case "29":
                w61="1";
                w51="0";
                r31="0";
                c31=0;
                progressBar1.setProgress(50);
                break;
            case "9":
                w51="0";
                w61="0";
                r31="1";
                progressBar1.setProgress(50);
                c31=1;
                break;
            case "30":
                w51="0";
                w61="0";
                r31="1";
                progressBar1.setProgress(50);
                c31=1;
                break;
            case "10":
                w71="1";
                w81="0";
                r41="0";
                c41=0;
                progressBar1.setProgress(67);
                break;
            case "31":
                w71="1";
                w81="0";
                r41="0";
                c41=0;
                progressBar1.setProgress(67);
                break;
            case "11":
                w71="0";
                w81="0";
                r41="1";
                progressBar1.setProgress(67);
                c41=1;
                break;
            case "32":
                w71="0";
                w81="0";
                r41="1";
                progressBar1.setProgress(67);
                c41=1;
                break;
            case "12":
                w81="1";
                w71="0";
                r41="0";
                c41=0;
                progressBar1.setProgress(67);
                break;
            case "33":
                w81="1";
                w71="0";
                r41="0";
                c41=0;
                progressBar1.setProgress(67);
                break;
            case "13":
                w101="0";
                w91="0";
                r51="1";
                progressBar1.setProgress(88);
                c51=1;
                break;
            case "34":
                w101="0";
                w91="0";
                r51="1";
                progressBar1.setProgress(88);
                c51=1;
                break;
            case "14":
                w101="0";
                w91="1";
                r51="0";
                c51=0;
                progressBar1.setProgress(88);
                break;
            case "35":
                w101="0";
                w91="1";
                r51="0";
                c51=0;
                progressBar1.setProgress(88);
                break;
            case "15":
                w101="1";
                w91="0";
                r51="0";
                c51=0;
                progressBar1.setProgress(88);
                break;
            case "36":
                w101="1";
                w91="0";
                r51="0";
                c51=0;
                progressBar1.setProgress(88);
                break;
            case "16":
                w111="1";
                w121="0";
                r61="0";
                c61=0;
                progressBar1.setProgress(100);
                break;
            case "37":
                w111="1";
                w121="0";
                r61="0";
                c61=0;
                progressBar1.setProgress(100);
                break;
            case "17":
                w111="0";
                w121="1";
                r61="0";
                c61=0;
                progressBar1.setProgress(100);
                break;
            case "38":
                w111="0";
                w121="1";
                r61="0";
                c61=0;
                progressBar1.setProgress(100);
                break;
            case "18":
                w111="0";
                w121="0";
                r61="1";
                progressBar1.setProgress(100);
                c61=1;
                break;
            case "39":
                w111="0";
                w121="0";
                r61="1";
                progressBar1.setProgress(100);
                c61=1;
                break;

        }
        }

    @Override
    public void onClick(View view) {
        String k = String.valueOf(((c11+c21+c31+c41+c51+c61)*100)/6);
        Intent i1 = new Intent(this, Finish_1.class);
        i1.putExtra("res1",k);
        i1.putExtra("w11",w11);
        i1.putExtra("w21",w21);
        i1.putExtra("w31",w31);
        i1.putExtra("w41",w41);
        i1.putExtra("w51",w51);
        i1.putExtra("w61",w61);
        i1.putExtra("w71",w71);
        i1.putExtra("w81",w81);
        i1.putExtra("w91",w91);
        i1.putExtra("w101",w101);
        i1.putExtra("w111",w111);
        i1.putExtra("w121",w121);
        i1.putExtra("r11",r11);
        i1.putExtra("r21",r21);
        i1.putExtra("r31",r31);
        i1.putExtra("r41",r41);
        i1.putExtra("r51",r51);
        i1.putExtra("r61",r61);
        finish();
        startActivity(i1);
    }
}
