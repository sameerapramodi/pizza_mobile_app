package com.example.pizzashop_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class cash_pay extends AppCompatActivity {

    // Declare ImageView variables
    private ImageView cartImageView, orderImageView, profileImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_pay);

        // Initialize the payment button and set its click listener
        Button btn = findViewById(R.id.paymentdone);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Finish activity when payment is done
                Intent intent = new Intent(cash_pay.this, finish.class);
                startActivity(intent);
            }
        });

        // Initialize ImageViews
        cartImageView = findViewById(R.id.imageView15);
        orderImageView = findViewById(R.id.imageView18);
        profileImageView = findViewById(R.id.imageView17);

        // Set onClick listeners for each ImageView to navigate to respective activities
        cartImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the CartActivity when the cart button is clicked
                Intent cartIntent = new Intent(cash_pay.this, cart.class);
                startActivity(cartIntent);
            }
        });

        orderImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the OrderActivity when the order button is clicked
                Intent orderIntent = new Intent(cash_pay.this, order.class);
                startActivity(orderIntent);
            }
        });

        profileImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the ProfileActivity when the profile button is clicked
                Intent profileIntent = new Intent(cash_pay.this, profile.class);
                startActivity(profileIntent);
            }
        });
    }
}
