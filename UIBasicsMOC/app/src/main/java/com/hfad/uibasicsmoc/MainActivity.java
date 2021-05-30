package com.hfad.uibasicsmoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    EditText edtTextName;
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.btnClick:
                Toast.makeText(this, "Hello Again", Toast.LENGTH_SHORT).show();
                textView.setText("Hello "+edtTextName.getText().toString());
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.btnClick);
        btn.setOnClickListener(this);
        textView=findViewById(R.id.txtName);
        edtTextName=findViewById(R.id.edttxtName);
    }
}