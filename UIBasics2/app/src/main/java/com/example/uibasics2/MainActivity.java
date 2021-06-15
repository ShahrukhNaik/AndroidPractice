package com.example.uibasics2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edt;
    @Override
    public void onClick(View v) {
         switch (v.getId()){
             case R.id.btn:
                 TextView txt=findViewById(R.id.text);
                 txt.setText(edt.getText().toString());
                 break;
             case R.id.edttxt:
                 Toast.makeText(this, "edit TExt clicked", Toast.LENGTH_LONG).show();
                 break;
             default:
                 break;
         }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.btn);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "button Clicked", Toast.LENGTH_SHORT).show();
//            }
//        });
        btn.setOnClickListener(this);
        edt=findViewById(R.id.edttxt);
        edt.setOnClickListener(this);
    }


}