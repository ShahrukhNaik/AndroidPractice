package com.hfad.findicecream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Spinner color;
    IceCreamExpert expert=new IceCreamExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.brands);
        color=findViewById(R.id.color);

    }
    //called when the user clicks the button..
    public void onClickFindIceCream(View view){
        String iceCreamType=color.getSelectedItem().toString();
        List<String> brandList=expert.getBrands(iceCreamType);
        StringBuilder sb=new StringBuilder();
        for(String e: brandList){
                sb.append(e).append("\n");
        }
        textView.setText(sb);
    }
}