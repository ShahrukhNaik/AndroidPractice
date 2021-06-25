package com.example.findicecream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    TextView tv;
    IceCreamExpert ie=new IceCreamExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onbtnClick(View view) {
        sp=findViewById(R.id.color);
        String res=String.valueOf(sp.getSelectedItem());
        tv=findViewById(R.id.brand);
        List<String>getres=ie.getBrand(res);
        StringBuilder sb=new StringBuilder();
        for(String a : getres){
            sb.append(a).append("\n");
        }
        tv.setText(sb);
    }
}