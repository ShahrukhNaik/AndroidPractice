package com.example.implicitactivity;

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

    public void btnClick(View view) {
        EditText edt=findViewById(R.id.edttxt);
        String msg=edt.getText().toString();
//        Toast.makeText(this, "Message sent successfully", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(Intent.ACTION_SEND);
        //setting mime type..
        intent.setType("text/plain");
        //sending the actuall msg..
        intent.putExtra(Intent.EXTRA_TEXT,msg);
        Intent chooseintent=Intent.createChooser(intent,"Send message via..");
        startActivity(chooseintent);
    }
}