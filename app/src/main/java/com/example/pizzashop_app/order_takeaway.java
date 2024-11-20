package com.example.pizzashop_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class order_takeaway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_takeaway);
        Button btn = findViewById(R.id.orderconfirmtakeaway);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(order_takeaway.this, payment.class);
                startActivity(intent);
            }
        });
    }
}