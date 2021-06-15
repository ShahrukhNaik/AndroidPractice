package com.example.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        //get the drink from the intent
        int drinkId=(Integer)getIntent().getExtras().get(EXTRA_DRINKID);

        //make an obj of the Drink and the drink id to get details of the users choice..
        Drink drink=Drink.drinks[drinkId];

        //populate the drink name
        TextView name=findViewById(R.id.name);
        name.setText(drink.getName());

        //populate the drink description
        TextView description=findViewById(R.id.description);
        description.setText(drink.getDescription());

        //populate the drink description
        ImageView photo=findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());

    }
}