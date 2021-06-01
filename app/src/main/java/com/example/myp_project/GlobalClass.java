package com.example.myp_project;

import android.app.Application;

public class GlobalClass extends Application {
    public int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
