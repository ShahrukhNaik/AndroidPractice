package com.hfad.challangetest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnClickRegister(View view){
        //firstName
        TextView txtFirstName= findViewById(R.id.txtFirstName);
        EditText edtTxtFirstName=findViewById(R.id.edtFirstName);
        txtFirstName.append(" "+edtTxtFirstName.getText().toString());
        //lastName
        TextView txtLastName=findViewById(R.id.txtLastName);
        EditText edtTxtLastName=findViewById(R.id.edtLastName);
        txtLastName.append(" "+edtTxtLastName.getText().toString());
        //Email
        TextView txtEmail=findViewById(R.id.txtEmail);
        EditText edtEmail=findViewById(R.id.edtEmail);
        txtEmail.append(" "+edtEmail.getText().toString());

    }

}