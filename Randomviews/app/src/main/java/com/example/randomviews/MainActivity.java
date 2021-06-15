package com.example.randomviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onToggleClick(View view) {
        boolean on=((ToggleButton) view).isChecked();
        if(on){
            Toast.makeText(this, "Toggle is on", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Toggle is off", Toast.LENGTH_SHORT).show();
        }
    }
    public void onSwitchClick(View view) {
        boolean on=((Switch) view).isChecked();
        if(on){
            Toast.makeText(this, "Feature Turned ON", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Feature Turned OFF", Toast.LENGTH_SHORT).show();
        }
    }
    public void onCheckboxClick(View view) {
        boolean checked=((CheckBox) view).isChecked();
        switch (view.getId()){
            case  R.id.checkboxmilk:
                Toast.makeText(this, "Your Milk Tea is being Made", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkboxsugar:
                Toast.makeText(this, "Sugar is being added to your Tea", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void onRadio(View view) {
        RadioGroup rg=findViewById(R.id.Radio_group);
        int id=rg.getCheckedRadioButtonId();
        switch (id){
            case R.id.radiocavemen:
                Toast.makeText(this, "You are a Cavemen", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioaustronauts:
                Toast.makeText(this, "you are an austronaut", Toast.LENGTH_SHORT).show();
                break;
        }
    }
//    ImageView photo = findViewById(R.id.photo);
//    int image = R.drawable.starbuzz_logo;
//    String description = "This is the logo";
//photo.setImageResource(image);
//photo.setContentDescription(description);


}