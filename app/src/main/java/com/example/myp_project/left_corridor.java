package com.example.myp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class left_corridor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left_corridor);

        ImageView lctbc = findViewById(R.id.lc_to_bc);
        ImageView lctfc = findViewById(R.id.lc_to_fc);

        lctbc.setOnClickListener(v -> lctbc());
        lctfc.setOnClickListener(v -> lctfc());
    }

    private void lctbc() {
        Intent intent = new Intent(this, back_corridor.class);
        startActivity(intent);
    }

    private void lctfc() {
        Intent intent = new Intent(this, school_front_corridor.class);
        startActivity(intent);
    }
}