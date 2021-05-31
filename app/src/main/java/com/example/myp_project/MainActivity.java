package com.example.myp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.TextView);
        textView.setOnClickListener(v -> startClass());
    }
    private void startClass() {
        Intent startClass = new Intent(this, front_of_school.class);
        startActivity(startClass);
    }
}