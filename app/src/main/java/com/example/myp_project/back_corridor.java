package com.example.myp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class back_corridor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_corridor);

        ImageView bctlc = findViewById(R.id.bctlc);
        ImageView bctrc = findViewById(R.id.bctrc);

        bctlc.setOnClickListener(v -> bctlc());
        bctrc.setOnClickListener(v -> bctrc());
    }

    private void bctlc(){
        Intent intent = new Intent(this, left_corridor.class);
        startActivity(intent);
    }

    private void bctrc(){
        Intent intent = new Intent(this, right_corridor.class);
        startActivity(intent);
    }
}