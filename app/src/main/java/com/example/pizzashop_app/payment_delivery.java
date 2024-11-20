package com.example.pizzashop_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class payment_delivery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_delivery);

        // Initialize the checkboxes
        CheckBox checkBoxCard = findViewById(R.id.checkBoxCard);
        CheckBox checkBoxCash = findViewById(R.id.checkBoxCash);

        // Set listeners to allow only one checkbox to be selected at a time
        checkBoxCard.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Uncheck Cash on Delivery checkbox
                    checkBoxCash.setChecked(false);
                }
            }
        });

        checkBoxCash.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Uncheck Card checkbox
                    checkBoxCard.setChecked(false);
                }
            }
        });

        // Correct button reference
        Button payNowButton = findViewById(R.id.paynow);

        // Handle Pay Now button click
        payNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBoxCard.isChecked()) {
                    Toast.makeText(payment_delivery.this, "Card Payment selected. Proceeding to Payment...", Toast.LENGTH_SHORT).show();
                    // Navigate to a new screen for card payment (replace with your target activity)
                    Intent intent = new Intent(payment_delivery.this, card_payment.class); // Ensure card_payment activity exists
                    startActivity(intent);
                } else if (checkBoxCash.isChecked()) {
                    Toast.makeText(payment_delivery.this, "Cash Payment selected. Confirming order...", Toast.LENGTH_SHORT).show();
                    // Navigate to a new screen or complete cash payment flow (replace with your target activity)
                    Intent intent = new Intent(payment_delivery.this, cash_pay.class); // Ensure cash_pay activity exists
                    startActivity(intent);
                } else {
                    Toast.makeText(payment_delivery.this, "Please select a payment method", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
