package com.example.pizzashop_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // CardView for "Create Your Own Pizza"
        CardView btnCreateYourOwn = findViewById(R.id.createyour);
        btnCreateYourOwn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, create_pizza.class);
                startActivity(intent);
            }
        });

        // CardView for "Mexican Green Wave"
        CardView btnMexican = findViewById(R.id.mexican);
        btnMexican.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, create_pizza.class);
                startActivity(intent);
            }
        });

        // CardView for "Chicken Pizza"
        CardView btnChicken = findViewById(R.id.chicken);
        btnChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, create_pizza.class);
                startActivity(intent);
            }
        });

        // CardView for "Margherita Pizza"
        CardView btnMargherita = findViewById(R.id.cardView4);
        btnMargherita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, create_pizza.class);
                startActivity(intent);
            }
        });

        // CardView for "Veggie Delight"
        CardView btnVeggie = findViewById(R.id.cardView5);
        btnVeggie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, create_pizza.class);
                startActivity(intent);
            }
        });

        // CardView for "Pepperoni Pizza"
        CardView btnPepperoni = findViewById(R.id.cardView6);
        btnPepperoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, create_pizza.class);
                startActivity(intent);
            }
        });
    }
}
