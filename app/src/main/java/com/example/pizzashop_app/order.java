package com.example.pizzashop_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class order extends AppCompatActivity {

    // Declare ImageView elements for cart, order, profile, and back buttons
    private ImageView cartImageView, orderImageView, profileImageView, backBtnImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        // Back Button Setup
        backBtnImageView = findViewById(R.id.backbtn); // Assuming you have the same ID for back button
        backBtnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to create_pizza activity when the back button is clicked
                Intent intent = new Intent(order.this, create_pizza.class);
                startActivity(intent);
            }
        });

        // Dine-In Order Confirmation Button Setup
        Button btn = findViewById(R.id.dineinorderconfirm);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to payment activity
                Intent intent = new Intent(order.this, payment.class);
                startActivity(intent);
            }
        });
    }
}
