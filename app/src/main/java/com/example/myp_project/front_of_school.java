package com.example.myp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

public class front_of_school extends AppCompatActivity {

    public int n;
    public TextView textbox = findViewById(R.id.textbox_text);
    ImageView fos_shell = findViewById(R.id.fos_shell);
    ImageView to_school = findViewById(R.id.to_school_im);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_of_school);

        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.fragment_textbox_and_characters, null);
        PopupWindow popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);

        findViewById(R.id.fos_layout).post(new Runnable() {
            public void run() {
                setn(1);
                popupWindow.showAtLocation(findViewById(R.id.fos_layout), Gravity.CENTER, 0, 0);
            }
        });

    }
    private void switchCase() {
        switch (getn()){
            case 1:
                textbox.setText("Here's the school...");
                setn(2);
                break;
            case 2:
                textbox.setText("The email said to go to the office...");
                setn(3);
                break;
            case 3:
                textbox.setText("I'm willing to bet that that's inside the school. I should go inside.");
                setn(4);
                break;
            case 4:

        }
    }

    private void setn(int n){
        this.n = n;
    }
    private int getn(){
        return n;
    }
}

