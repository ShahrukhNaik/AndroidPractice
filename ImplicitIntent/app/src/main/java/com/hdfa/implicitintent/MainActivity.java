package com.hdfa.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSend(View view) {
        EditText editText=findViewById(R.id.edtxt);
        String msg=editText.getText().toString();
        Intent intent=new Intent(Intent.ACTION_SEND);
        //mime data type
        intent.setType("text/plain");
        //extra message to send..
        intent.putExtra(Intent.EXTRA_TEXT,msg);
        Intent choseintent=Intent.createChooser(intent,"Send Message via.....");
        startActivity(choseintent);
    }
}