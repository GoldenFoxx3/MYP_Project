package com.example.myp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class school_front_corridor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_front_corridor);

        //to l(eft), f(ront) o(f) s(chool), or r(ight) corridor
        ImageView tlc = findViewById(R.id.fc_to_lft);
        ImageView tfos = findViewById(R.id.fc_to_fos);
        ImageView trc = findViewById(R.id.fc_to_rght);

        tlc.setOnClickListener(v -> to_left_corridor());
        trc.setOnClickListener(v -> to_right_corridor());
        tfos.setOnClickListener(v -> to_fos());
    }

    private void to_left_corridor(){
        Intent intent = new Intent(this, left_corridor.class);
        startActivity(intent);
    }

    private void to_right_corridor(){
        Intent intent = new Intent(this, right_corridor.class);
        startActivity(intent);
    }

    private void to_fos(){
        Intent intent = new Intent(this, front_of_school.class);
        startActivity(intent);
    }
}