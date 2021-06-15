package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view) {

        Toast.makeText(this, "Form Submmited Successfully", Toast.LENGTH_SHORT).show();

        TextView fn=findViewById(R.id.textViewFN);
        TextView ln=findViewById(R.id.textViewLN);
        TextView em=findViewById(R.id.textViewEM);

        EditText edfn=findViewById(R.id.FirstName);
        EditText edln=findViewById(R.id.LastName);
        EditText edem=findViewById(R.id.Email);

        fn.setText("First Name: "+edfn.getText().toString());
        ln.setText("First Name: "+edln.getText().toString());
        em.setText("First Name: "+edem.getText().toString());

    }
}