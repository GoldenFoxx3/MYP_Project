package com.example.myp_project;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

public class front_of_school extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_of_school);
        GlobalClass appState = new GlobalClass();
        int n = appState.getN();
        ImageView to_school = findViewById(R.id.to_school_im);
//        LayoutInflater inflater = LayoutInflater.from(this);
//        View view = inflater.inflate(R.layout.fragment_textbox_and_characters, null);
//        PopupWindow popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);
//
//        findViewById(R.id.fos_layout).post(new Runnable() {
//            public void run() {
//                popupWindow.showAtLocation(findViewById(R.id.fos_layout), Gravity.CENTER, 0, 0);
//            }
//        });
//
//
//        if(n == 4){
//            view.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    popupWindow.dismiss();
//                }
//            });
//        }
        to_school.setOnClickListener(v -> in_school());

    }
    private void in_school() {
        Intent x = new Intent(this, school_front_corridor.class);
        startActivity(x);
    }

}

