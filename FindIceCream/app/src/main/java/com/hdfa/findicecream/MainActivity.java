package com.hdfa.findicecream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    IceCreamExpert ie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSelection(View view) {
        TextView selection=findViewById(R.id.txtview);
        Spinner spin=findViewById(R.id.color);
        String res=spin.getSelectedItem().toString();
        ie=new IceCreamExpert();
        List<String> finalresult=ie.expert(res);
        StringBuilder sb=new StringBuilder();
        for (String s:finalresult){
            sb.append(s).append("\n");
        }
        selection.setText(sb);
    }
}