package com.hdfa.explicitactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE ="Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent=getIntent();
        String s=intent.getStringExtra(EXTRA_MESSAGE);
        TextView textView=findViewById(R.id.txtview);
        textView.setText(s);
    }
}