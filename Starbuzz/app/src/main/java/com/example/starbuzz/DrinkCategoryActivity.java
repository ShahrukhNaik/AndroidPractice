package com.example.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class DrinkCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);
        //create array adapter for list view to get data from the drink.java file
        //you can also create it to retrive data form database
        ArrayAdapter<Drink> listAdapter=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,Drink.drinks);
        ListView listDrink=findViewById(R.id.list_drink);
        listDrink.setAdapter(listAdapter);
        //create listener
        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(DrinkCategoryActivity.this,DrinkActivity.class);
                intent.putExtra(DrinkActivity.EXTRA_DRINKID,(int)id);
                startActivity(intent);
            }
        };
        //assign the listnere tto the list view...
        listDrink.setOnItemClickListener(itemClickListener);
    }
}