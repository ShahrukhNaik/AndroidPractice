package com.example.findicecream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    TextView txt; Spinner spinner;
    IceCreamExpert ie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View view){
        txt=findViewById(R.id.res);
        spinner=findViewById(R.id.color);
        ie=new IceCreamExpert();
        String s=spinner.getSelectedItem().toString();
        List<String> getres=ie.GetBrands(s);
        StringBuilder sb=new StringBuilder();
        for(String brand: getres){
            sb.append(brand).append("\n");
        }
        txt.setText(sb);
    }
}