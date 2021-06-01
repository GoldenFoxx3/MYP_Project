package com.example.myp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class right_corridor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right_corridor);

        ImageView rctfc = findViewById(R.id.rctfc);
        ImageView rctbc = findViewById(R.id.rctbc);

        rctfc.setOnClickListener(v -> rctfc());
        rctbc.setOnClickListener(v -> rctbc());
    }

    private void rctfc(){
        Intent intent = new Intent(this, school_front_corridor.class);
        startActivity(intent);
    }

    private void rctbc(){
        Intent intent = new Intent(this, back_corridor.class);
        startActivity(intent);
    }
}