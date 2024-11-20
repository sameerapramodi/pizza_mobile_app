package com.example.pizzashop_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class payment extends AppCompatActivity {

    private CheckBox checkBoxCard, checkBoxCash; // Checkboxes for payment methods
    private Button payNowButton; // Button for "Pay Now"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        // Initialize views
        checkBoxCard = findViewById(R.id.checkBoxCard);
        checkBoxCash = findViewById(R.id.checkBoxCash);
        payNowButton = findViewById(R.id.paynow);

        // Set click listener for the "Pay Now" button
        payNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check which payment method is selected
                if (checkBoxCard.isChecked() && !checkBoxCash.isChecked()) {
                    // Redirect to card_payment activity
                    Intent intent = new Intent(payment.this, card_payment.class);
                    startActivity(intent);
                } else if (checkBoxCash.isChecked() && !checkBoxCard.isChecked()) {
                    // Redirect to cash_pay activity
                    Intent intent = new Intent(payment.this, cash_pay.class);
                    startActivity(intent);
                } else if (checkBoxCard.isChecked() && checkBoxCash.isChecked()) {
                    // Show a message if both options are selected
                    Toast.makeText(payment.this, "Please select only one payment method", Toast.LENGTH_SHORT).show();
                } else {
                    // Show a message if no option is selected
                    Toast.makeText(payment.this, "Please select a payment method", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
