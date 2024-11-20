package com.example.pizzashop_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;  // Add import for ContextCompat

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class create_pizza extends AppCompatActivity {

    // Declare variables for the CardViews
    private CardView card1, card2, card3, card4, card5, card6;
    private CardView selectedCard; // To keep track of the selected card

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_pizza);

        // Initialize CardViews (corrected card5 initialization)
        card1 = findViewById(R.id.cardView1);
        card2 = findViewById(R.id.cardView2);
        card3 = findViewById(R.id.cardView3);
        card4 = findViewById(R.id.cardView4);
        card5 = findViewById(R.id.cardView5);
        card6 = findViewById(R.id.cardView6);  // card6 added correctly

        // Initialize back button and next button
        ImageView backBtn = findViewById(R.id.backbtn);
        Button nextBtn = findViewById(R.id.Next);

        // Set click listeners for all cards
        setupCardClickListener(card1);
        setupCardClickListener(card2);
        setupCardClickListener(card3);
        setupCardClickListener(card4);
        setupCardClickListener(card5);
        setupCardClickListener(card6);  // Ensure card6 is included

        // Back button functionality
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(create_pizza.this, Home.class);
                startActivity(intent);
                finish();
            }
        });

        // Next button functionality
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(create_pizza.this, cart.class);
                startActivity(intent);
            }
        });
    }

    // Helper method to set up click listeners for each card
    private void setupCardClickListener(CardView card) {
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedCard != null) {
                    // Reset the previously selected card's background color
                    selectedCard.setCardBackgroundColor(ContextCompat.getColor(create_pizza.this, R.color.default_card_color)); // Use ContextCompat.getColor
                }

                // Highlight the clicked card
                card.setCardBackgroundColor(ContextCompat.getColor(create_pizza.this, R.color.selected_card_color)); // Use ContextCompat.getColor

                // Update the selected card reference
                selectedCard = card;
            }
        });
    }
}
