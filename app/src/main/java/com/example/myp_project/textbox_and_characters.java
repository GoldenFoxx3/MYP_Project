package com.example.myp_project;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class textbox_and_characters extends Fragment {

    public textbox_and_characters() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        TextView textBox = getView().findViewById(R.id.textbox_text);
        ImageView to_school = getView().findViewById(R.id.imageView5);

        textBox.setText("Here's the school...");
        to_school.setOnClickListener(v -> into_school());
        GlobalClass appState = ((GlobalClass)getActivity().getApplicationContext());
        int n = appState.getN();
        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_textbox_and_characters, container, false);
    }

    private void into_school() {
        Intent x = new Intent(getActivity(), school_front_corridor.class);
        startActivity(x);
    }
    private void switchCase() {
        TextView textBox = getView().findViewById(R.id.textbox_text);
                switch (textBox.getText().toString()){
            case "Here's the school...":
                textBox.setText("The email said to go to the office...");
                break;
            case "The email said to go to the office...":
                textBox.setText("I'm willing to bet that that's inside the school. I should go inside.");
                break;
            case "I'm willing to bet that that's inside the school. I should go inside.":
                GlobalClass appState = ((GlobalClass)getActivity().getApplicationContext());
                appState.setN(4);
                break;
        }
    }




}