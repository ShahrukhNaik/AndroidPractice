 package com.hfad.materialcomponents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout parent;
    private Button btnshowsnackbar;
    private MaterialCardView materialCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parent=findViewById(R.id.parent);
        btnshowsnackbar=findViewById(R.id.button);
        materialCardView=findViewById(R.id.cardView);

        materialCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Card View Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btnshowsnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showsnackbar();
            }
        });

    }
    public void showsnackbar(){
        Snackbar.make(parent,"This is a snack bar",Snackbar.LENGTH_INDEFINITE)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Retry", Toast.LENGTH_SHORT).show();
                    }
                })
                .setActionTextColor(Color.RED)
                .setTextColor(Color.YELLOW)
                .show();
    }
}