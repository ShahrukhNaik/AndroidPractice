 package com.hfad.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void OnHelloBtnClicked(View view){
        TextView textView=findViewById(R.id.txtview);
        textView.setText("Hello Again....!");
    }
}