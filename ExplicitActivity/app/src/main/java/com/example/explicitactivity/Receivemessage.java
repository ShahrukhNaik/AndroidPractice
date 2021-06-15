package com.example.explicitactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Receivemessage extends AppCompatActivity {

    public static final String EXTRAMESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receivemessage);
        Intent intent=getIntent();
        String msgtxt=intent.getStringExtra(EXTRAMESSAGE);
        TextView tv=findViewById(R.id.message);
        tv.setText(msgtxt);
    }
}