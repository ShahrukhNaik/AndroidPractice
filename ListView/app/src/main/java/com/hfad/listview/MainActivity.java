package com.hfad.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private Spinner studentspinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listViewCites);

        studentspinner=findViewById(R.id.studentsSpinner);

//        ArrayList<String> students=new ArrayList<>();
//        students.add("student 1");
//        students.add("student 2");
//        students.add("student 3");
//
//        ArrayAdapter<String> studentsadapter=new ArrayAdapter<>(
//                this,
//                R.layout.support_simple_spinner_dropdown_item,
//                students
//        );
//        studentspinner.setAdapter(studentsadapter);

        studentspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,studentspinner.getSelectedItem().toString()+" selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayList<String> cities=new ArrayList<>();
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Delhi");
        cities.add("Banglore");

        ArrayAdapter<String> citiesAdapter=new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,
                cities
        );
        listView.setAdapter(citiesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, cities.get(position)+" selected", Toast.LENGTH_SHORT).show();
            }
        });

    }
}