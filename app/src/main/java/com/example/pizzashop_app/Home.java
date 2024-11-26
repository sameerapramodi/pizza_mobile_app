package com.example.pizzashop_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // CardView for "Create Your Own Pizza"
        CardView btnCreateYourOwn = findViewById(R.id.c1);
        btnCreateYourOwn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, create_pizza.class);
                startActivity(intent);
            }
        });

        // CardView for "Mexican Green Wave"
        CardView btnMexican = findViewById(R.id.c2);
        btnMexican.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, create_pizza.class);
                startActivity(intent);
            }
        });

        // CardView for "Chicken Pizza"
        CardView btnChicken = findViewById(R.id.c3);
        btnChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, create_pizza.class);
                startActivity(intent);
            }
        });

        // CardView for "Margherita Pizza"
        CardView btnMargherita = findViewById(R.id.c4);
        btnMargherita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, create_pizza.class);
                startActivity(intent);
            }
        });

        // CardView for "Veggie Delight"
        CardView btnVeggie = findViewById(R.id.c5);
        btnVeggie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, create_pizza.class);
                startActivity(intent);
            }
        });

        // CardView for "Pepperoni Pizza"
        CardView btnPepperoni = findViewById(R.id.c6);
        btnPepperoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, create_pizza.class);
                startActivity(intent);
            }
        });

        // Cart ImageView onClickListener
        ImageView cartImageView = findViewById(R.id.imageView12);
        cartImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start CartActivity when cart image is clicked
                Intent intent = new Intent(Home.this, cart.class);
                startActivity(intent);
            }
        });

        // Profile ImageView onClickListener
        ImageView proImageView = findViewById(R.id.imageView17);
        proImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start ProfileActivity when profile image is clicked
                Intent intent = new Intent(Home.this, profile.class);
                startActivity(intent);
            }
        });

        // Beverages Button onClickListener
        Button beveragesButton = findViewById(R.id.beverages);  // Beverages button ID
        beveragesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start BeveragesActivity when Beverages button is clicked
                Intent intent = new Intent(Home.this, beverages.class);
                startActivity(intent);
            }
        });

    }
}
