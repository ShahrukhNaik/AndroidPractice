package com.hfad.uibasic2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txtname;
    private EditText editTextname;
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnclick:
                Toast.makeText(this, "Hello Again", Toast.LENGTH_SHORT).show();
                txtname.setText("Hello "+editTextname.getText().toString());
                break;
            default:
                break;
        }            
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.btnclick);
        btn.setOnClickListener(this);

        editTextname=findViewById(R.id.edttxtname);
        txtname=findViewById(R.id.txthello);


//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                System.out.println("Button has Been Clicked");
//            }
//        });
    }
}