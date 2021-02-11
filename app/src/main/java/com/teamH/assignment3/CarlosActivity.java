package com.teamH.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CarlosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_carlos);
    }
}