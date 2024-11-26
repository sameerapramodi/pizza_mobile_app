package com.example.pizzashop_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class oder_method extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oder_method);

        // Back Button (bckbtn)
        ImageView backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // When back button is clicked, navigate to create_pizza activity
                Intent intent = new Intent(oder_method.this, create_pizza.class);
                startActivity(intent);
            }
        });

        // Dine-In Button
        CardView btnDineIn = findViewById(R.id.dinein);
        btnDineIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(oder_method.this, order.class);
                startActivity(intent);
            }
        });

        // Delivery Button
        CardView btnDelivery = findViewById(R.id.delivery);
        btnDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(oder_method.this, order_Deliver.class);
                startActivity(intent);
            }
        });

        // Takeaway Button
        CardView btnTakeaway = findViewById(R.id.takeaway);
        btnTakeaway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(oder_method.this, order_takeaway.class);
                startActivity(intent);
            }
        });
    }
}
