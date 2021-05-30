package com.hfad.uibasics3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private CheckBox cbharry,cbmatrix,cbjoker;
    private RadioGroup rgMaritalStatus;
    private ProgressBar progressbar;

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()){
            case R.id.harryPotter:
                if(isChecked) {
                    Toast.makeText(this, "Watched Harry Potter", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this, "You should Watch Harry Potter", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.matrix:
                if(isChecked) {
                    Toast.makeText(this, "Watched Matrix", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "You should Watch Matrix", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.joker:
                if(isChecked) {
                    Toast.makeText(this, "Watched Joker", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "You should Watch Joker", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbharry=findViewById(R.id.harryPotter);
        cbharry.setOnCheckedChangeListener(this);
        cbmatrix=findViewById(R.id.matrix);
        cbmatrix.setOnCheckedChangeListener(this);
        cbjoker=findViewById(R.id.joker);
        cbjoker.setOnCheckedChangeListener(this);

        rgMaritalStatus=findViewById(R.id.rgMaritalStatus);

        progressbar=findViewById(R.id.progressBar);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    progressbar.incrementProgressBy(10);
                    SystemClock.sleep(500);
                }
            }
        });
        thread.start();


        int checkedButton=rgMaritalStatus.getCheckedRadioButtonId();

        switch (checkedButton){
            case  R.id.rbMarried:
                Toast.makeText(MainActivity.this, "You are Married", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbSingle:
                Toast.makeText(MainActivity.this, "You are Single", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbInRel:
                Toast.makeText(MainActivity.this, "You are in a Relationship", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        rgMaritalStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case  R.id.rbMarried:
                        Toast.makeText(MainActivity.this, "You are Married", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbSingle:
                        Toast.makeText(MainActivity.this, "You are Single", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbInRel:
                        Toast.makeText(MainActivity.this, "You are in a Relationship", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });
    }
}