package com.example.posobie;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class search3 extends AppCompatActivity implements View.OnClickListener {
    EditText search;
    TextView textView;
    Button button;
    ScrollView scrollView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);
        search = findViewById(R.id.editText);
        textView = findViewById(R.id.scrollableText);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
        scrollView = findViewById(R.id.textViewWrapper);
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == 0) {
                    String fullText = textView.getText().toString();
                    fullText = fullText.replace("<font color='red'>", "");
                    fullText = fullText.replace("</font>", "");
                    textView.setText(fullText);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this, Gibs.class);
        finish();
        startActivity(i);
    }

    @Override
    public void onClick(View view) {
        String criteria = search.getText().toString();
        String fullText = textView.getText().toString();
        if (fullText.contains(criteria)) {
            int indexOfCriteria = fullText.indexOf(criteria);
            int lineNumber = textView.getLayout().getLineForOffset(indexOfCriteria);
            String highlighted = "<font color='red'>"+criteria+"</font>";
            fullText = fullText.replace(criteria, highlighted).replaceAll("\\n", "<br />");
            textView.setText(Html.fromHtml(fullText));

            scrollView.scrollTo(0, textView.getLayout().getLineTop(lineNumber));
        }
    }


}