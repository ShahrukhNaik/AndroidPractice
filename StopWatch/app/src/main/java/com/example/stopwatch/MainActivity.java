    package com.example.stopwatch;

import androidx.annotation.NonNull;
//this class gives the life cycle methods to the app we want...
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private int seconds=0;
    private boolean running;
    private boolean wasRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null){
            seconds=savedInstanceState.getInt("seconds");
            running=savedInstanceState.getBoolean("running");
            wasRunning=savedInstanceState.getBoolean("wasRunning");
        }
        runTimer();
    }
    //allows you to save the current state of the activity before getting destroyed..
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt("seconds",seconds);
        outState.putBoolean("running",running);
        outState.putBoolean("wasRunning",wasRunning);
        super.onSaveInstanceState(outState);
    }
//life cycle methods
    @Override
    protected void onResume() {
        super.onResume();
        if(wasRunning){
            running=true;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        wasRunning=running;
        running=false;
    }

    public void onClickStart(View view) {
        running=true;
    }

    public void onClickStop(View view) {
        running=false;
    }

    public void onClickReset(View view) {
        running=false;
        seconds=0;
    }
    private void runTimer(){
        //these handlers are like the thread in normall java
        //since normal threads cant update the UI in andriod we have to use handlers..
        final TextView tv=findViewById(R.id.time);
        final Handler handler=new Handler();

        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours=seconds/3600;
                int minutes=(seconds%3600)/60;
                int sec=seconds%60;

                String time=String.format(Locale.getDefault(),"%d:%02d:%02d",hours,minutes,sec);
                tv.setText(time);
                if(running){
                    seconds++;
                }
                handler.postDelayed(this,1000);
            }
        });
    }
}