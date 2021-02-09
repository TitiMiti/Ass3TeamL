package com.teamH.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    //Intent to launch activities
    private Intent intent_alex_activity;

    private Intent intent_zhuldyz_activity;

    private Intent intent_eugene_activity;

    private Intent intent_carlos_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try { this.getSupportActionBar().hide(); } catch (NullPointerException e){}
        intent_alex_activity = new Intent(this, AlexActivity.class);
        intent_zhuldyz_activity = new Intent(this, ZhuldyzActivity.class);
        intent_eugene_activity = new Intent(this, EugeneActivity.class);
        intent_carlos_activity = new Intent(this, CarlosActivity.class);
    }

    //Listener for buttons, onClick checks which button was activated
    //and launches the according user page activity
    public void launchPersonalPageActivity(View view){

        Button button = (Button) view;
        CharSequence button_text = button.getText().toString();
        String alex_activity_key = getString(R.string.button_2);
        String zhuldyz_activity = getString(R.string.zhuldyz);
        String eugene_activity = getString(R.string.button_1);
        String carlos_activity = getString(R.string.Carlos_Activity);

        if(button_text.equals(alex_activity_key)) {
            startActivity(intent_alex_activity);
        }

        if(button_text.equals(zhuldyz_activity)) {
            startActivity(intent_zhuldyz_activity);
        }

        if(button_text.equals(eugene_activity)) {
            startActivity(intent_eugene_activity);
        }

        if (button_text.equals(carlos_activity)) {
            startActivity(intent_carlos_activity);

        }
    }

}