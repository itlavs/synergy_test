package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    @SuppressLint("SetTextI18n")
    public void numberClick(View view){
        Button button = (Button) view;
        if (textView.getText().toString().equals("0")){
            textView.setText(button.getText().toString());
        } else {
            textView.setText(textView.getText().toString() + button.getText().toString());
        }
    }
}