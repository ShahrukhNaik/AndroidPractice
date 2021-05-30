package com.example.implicitintent;

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
    public void onMsgSend(View view){
        EditText edt=findViewById(R.id.edtxt);
        String msg=edt.getText().toString();
        Intent intent=new Intent(Intent.ACTION_SEND);
        //mime type for text and for tutorial purpose..
        intent.setType("text/plain");
        //mime data type for everydata ...
        //intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_TEXT,msg);
        String chooserTitle=getString(R.string.chooser);
        Intent intentChooser=Intent.createChooser(intent,chooserTitle);
        startActivity(intentChooser);
        Toast.makeText(this, "Message sent Successfully", Toast.LENGTH_SHORT).show();
    }
}