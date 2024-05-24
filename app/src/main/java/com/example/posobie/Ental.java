package com.example.posobie;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ental extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {
    EditText ishod1;
    EditText ishod2;
    EditText ishod3;
    EditText ishod4;
    EditText ikef1;
    EditText ikef2;
    EditText ikef3;
    EditText ikef4;
    EditText prod1;
    EditText prod2;
    EditText prod3;
    EditText prod4;
    EditText pkef1;
    EditText pkef2;
    EditText pkef3;
    EditText pkef4;
    TextView ans;
    Button ras;
    Double i1;
    Double i2;
    Double i3;
    Double i4;
    Double ik1;
    Double ik2;
    Double ik3;
    Double ik4;
    Double p1;
    Double p2;
    Double p3;
    Double p4;
    Double pk1;
    Double pk2;
    Double pk3;
    Double pk4;
Button cons;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ental);
        prod1 = findViewById(R.id.editText);
        prod2 = findViewById(R.id.editText5);
        prod3 = findViewById(R.id.editText6);
        prod4 = findViewById(R.id.editText7);
        ishod1 = findViewById(R.id.editText8);
        ishod2 = findViewById(R.id.editText9);
        ishod3 = findViewById(R.id.editText10);
        ishod4 = findViewById(R.id.editText11);
        pkef1 = findViewById(R.id.editText12);
        pkef2 = findViewById(R.id.editText13);
        pkef3 = findViewById(R.id.editText14);
        pkef4 = findViewById(R.id.editText15);
        ikef1 = findViewById(R.id.editText16);
        ikef2 = findViewById(R.id.editText17);
        ikef3 = findViewById(R.id.editText18);
        ikef4 = findViewById(R.id.editText19);
        ans = findViewById(R.id.textView);
        ras = findViewById(R.id.ras);
        cons = findViewById(R.id.button2);
        cons.setOnTouchListener(this);
        ras.setOnClickListener(this);

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this, Calculator.class);
        finish();
        startActivity(i);
    }

    @Override
    public void onClick(View view) {
        String insh1 = ishod1.getText().toString();
        String insh2 = ishod2.getText().toString();
        String insh3 = ishod3.getText().toString();
        String insh4 = ishod4.getText().toString();
        String ink1 = ikef1.getText().toString();
        String ink2 = ikef2.getText().toString();
        String ink3 = ikef3.getText().toString();
        String ink4 = ikef4.getText().toString();
        String pr1 = prod1.getText().toString();
        String pr2 = prod2.getText().toString();
        String pr3 = prod3.getText().toString();
        String pr4 = prod4.getText().toString();
        String prk1 = pkef1.getText().toString();
        String prk2 = pkef2.getText().toString();
        String prk3 = pkef3.getText().toString();
        String prk4 = pkef4.getText().toString();
        if (insh1.matches("")){
            i1 = 0.0;
        }
        else {
            i1 = Double.parseDouble(ishod1.getText().toString().replace(",","."));
        }
        if (insh2.matches("")){
            i2 = 0.0;
        }
        else {
            i2 = Double.parseDouble(ishod2.getText().toString().replace(",","."));
        }
        if (insh3.matches("")){
            i3 = 0.0;
        }
        else {
            i3 = Double.parseDouble(ishod3.getText().toString().replace(",","."));
        }
        if (insh4.matches("")){
            i4 = 0.0;
        }
        else {
            i4 = Double.parseDouble(ishod4.getText().toString().replace(",","."));
        }
        if (ink1.matches("")){
            ik1 = 1.0;
        }
        else {
            ik1 = Double.parseDouble(ikef1.getText().toString().replace(",","."));
        }
        if (ink2.matches("")){
            ik2 = 1.0;
        }
        else {
            ik2 = Double.parseDouble(ikef2.getText().toString().replace(",","."));
        }
        if (ink3.matches("")){
            ik3 = 1.0;
        }
        else {
            ik3 = Double.parseDouble(ikef3.getText().toString().replace(",","."));
        }
        if (ink4.matches("")){
            ik4 = 1.0;
        }
        else {
            ik4 = Double.parseDouble(ikef4.getText().toString().replace(",","."));
        }
        if (pr1.matches("")){
            p1 = 0.0;
        }
        else {
            p1 = Double.parseDouble(prod1.getText().toString().replace(",","."));
        }
        if (pr2.matches("")){
            p2 = 0.0;
        }
        else {
            p2 = Double.parseDouble(prod2.getText().toString().replace(",","."));
        }
        if (pr3.matches("")){
            p3 = 0.0;
        }
        else {
            p3 = Double.parseDouble(prod3.getText().toString().replace(",","."));
        }
        if (pr4.matches("")){
            p4 = 0.0;
        }
        else {
            p4 = Double.parseDouble(prod4.getText().toString().replace(",","."));
        }
        if (prk1.matches("")){
            pk1 = 1.0;
        }
        else {
            pk1 = Double.parseDouble(pkef1.getText().toString().replace(",","."));
        }
        if (prk2.matches("")){
            pk2 = 1.0;
        }
        else {
            pk2 = Double.parseDouble(pkef2.getText().toString().replace(",","."));
        }
        if (prk3.matches("")){
            pk3 = 1.0;
        }
        else {
            pk3 = Double.parseDouble(pkef3.getText().toString().replace(",","."));
        }
        if (prk4.matches("")){
            pk4 = 1.0;
        }
        else {
            pk4 = Double.parseDouble(pkef4.getText().toString().replace(",","."));
        }
        Double g = (p1*pk1+p2*pk2+p3*pk3+p4*pk4) - (i1*ik1+i2*ik2+i3*ik3+i4*ik4);
        String s = g.toString();
        ans.setText(s);

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Intent i = new Intent(this, search1.class);
        finish();
        startActivity(i);
        return false;
    }
}