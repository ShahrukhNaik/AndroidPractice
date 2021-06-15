package com.example.explicitactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSend(View view) {
        Toast.makeText(this, "msg send successfully", Toast.LENGTH_SHORT).show();
        EditText edt=findViewById(R.id.edttxt);
        String s=edt.getText().toString();
        Intent intent=new Intent(this,Receivemessage.class);
        intent.putExtra(Receivemessage.EXTRAMESSAGE,s);
        startActivity(intent);
    }
}