package com.example.pizzashop_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class beverages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages);

        // Find buttons and CardViews by their IDs
        Button pizzaMenuButton = findViewById(R.id.pizza); // Assuming this is the Pizza Menu Button
        CardView card1 = findViewById(R.id.c1); // Card for first beverage
        CardView card2 = findViewById(R.id.c2); // Card for second beverage
        CardView card3 = findViewById(R.id.c3); // Card for third beverage
        CardView card4 = findViewById(R.id.c4); // Card for fourth beverage
        CardView card5 = findViewById(R.id.c5); // Card for fifth beverage

        // Set onClickListener for Pizza Menu button
        pizzaMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Home Page when Pizza Menu button is clicked
                Intent intent = new Intent(beverages.this, Home.class);
                startActivity(intent);
            }
        });

        // Set onClickListeners for Beverage Cards
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to OrderMethod page when Card 1 is clicked
                navigateToOrderMethod();
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to OrderMethod page when Card 2 is clicked
                navigateToOrderMethod();
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to OrderMethod page when Card 3 is clicked
                navigateToOrderMethod();
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to OrderMethod page when Card 4 is clicked
                navigateToOrderMethod();
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to OrderMethod page when Card 5 is clicked
                navigateToOrderMethod();
            }
        });
        // Cart ImageView onClickListener
        ImageView cartImageView = findViewById(R.id.imageView12);
        cartImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start CartActivity when cart image is clicked
                Intent intent = new Intent(beverages.this, cart.class);
                startActivity(intent);
            }
        });

        // Profile ImageView onClickListener
        ImageView proImageView = findViewById(R.id.imageView17);
        proImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start ProfileActivity when profile image is clicked
                Intent intent = new Intent(beverages.this, profile.class);
                startActivity(intent);
            }
        });
    }

    // Method to navigate to OrderMethod page
    private void navigateToOrderMethod() {
        Intent intent = new Intent(beverages.this, oder_method.class);
        startActivity(intent);
    }
}
