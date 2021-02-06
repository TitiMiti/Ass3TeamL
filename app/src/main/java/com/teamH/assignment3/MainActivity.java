package com.teamH.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    //Intent to launch Alex activity
    private Intent intent_alex_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent_alex_activity = new Intent(this, AlexActivity.class);
    }

    //Listener for buttons, onClick checks which button was activated
    //and launches the according user page activity
    public void launchPersonalPageActivity(View view){

        Button button = (Button) view;
        CharSequence button_text = button.getText().toString();
        String alex_activity_key = getString(R.string.button_2);

        if(button_text.equals(alex_activity_key)){
            startActivity(intent_alex_activity);
        }
    }
}