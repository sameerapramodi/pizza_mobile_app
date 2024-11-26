package com.example.pizzashop_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.appcompat.app.AppCompatActivity;

public class create_pizza extends AppCompatActivity {

    // Declare your CardView elements
    private CardView[] cardViews;

    // Declare ImageView elements for cart, order, profile, and back buttons
    private ImageView cartImageView, orderImageView, profileImageView, backBtnImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_pizza);

        // Initialize the CardView array with the IDs of your cards
        cardViews = new CardView[] {
                findViewById(R.id.cardView1),  // 7 inch card
                findViewById(R.id.cardView2),  // 8 inch card
                findViewById(R.id.cardView3),  // 9 inch card
                findViewById(R.id.cardView4),  // Crust Type Card
                findViewById(R.id.cardView5),  // Sauce Type Card
                // Add more cards here if needed
        };

        // Set the initial color of the cards (all default color)
        for (CardView cardView : cardViews) {
            cardView.setCardBackgroundColor(getResources().getColor(R.color.default_card_color));
        }

        // Set up click listeners for each CardView to change its color when clicked
        for (CardView cardView : cardViews) {
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // When a card is clicked, set its background color to the selected color
                    for (CardView otherCardView : cardViews) {
                        // Reset all cards to the default color
                        if (otherCardView == cardView) {
                            otherCardView.setCardBackgroundColor(getResources().getColor(R.color.selected_card_color));
                        } else {
                            otherCardView.setCardBackgroundColor(getResources().getColor(R.color.default_card_color));
                        }
                    }
                }
            });
        }

        // Initialize ImageViews for cart, order, profile, and back buttons
        cartImageView = findViewById(R.id.imageView15);
        orderImageView = findViewById(R.id.imageView18);
        profileImageView = findViewById(R.id.imageView17);
        backBtnImageView = findViewById(R.id.backbtn);  // Back button

        // Set onClick listeners for each ImageView to navigate to respective activities
        cartImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the CartActivity when the cart button is clicked
                Intent cartIntent = new Intent(create_pizza.this, cart.class);
                startActivity(cartIntent);
            }
        });

        orderImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the OrderActivity when the order button is clicked
                Intent orderIntent = new Intent(create_pizza.this, order.class);
                startActivity(orderIntent);
            }
        });

        profileImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the ProfileActivity when the profile button is clicked
                Intent profileIntent = new Intent(create_pizza.this, profile.class);
                startActivity(profileIntent);
            }
        });

        // Set onClick listener for the "Back" button to navigate to the home screen
        backBtnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the HomeActivity (MainActivity) when the back button is clicked
                Intent homeIntent = new Intent(create_pizza.this, Home.class);  // Home screen or main screen
                startActivity(homeIntent);
            }
        });

        // Find the Next button
        Button btn = findViewById(R.id.Next);

        // Set up click listener for the "Next" button to move to the next activity
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the next activity (order method screen)
                Intent intent = new Intent(create_pizza.this, oder_method.class);
                startActivity(intent);
            }
        });
        // Beverages Button onClickListener
        Button addButton = findViewById(R.id.add);  // Beverages button ID
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start BeveragesActivity when Beverages button is clicked
                Intent intent = new Intent(create_pizza.this, Home.class);
                startActivity(intent);
            }
        });
    }
}
