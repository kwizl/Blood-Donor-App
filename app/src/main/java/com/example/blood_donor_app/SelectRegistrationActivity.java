package com.example.blood_donor_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SelectRegistrationActivity extends AppCompatActivity {

    private Button donorButton, recipientButton;
    private TextView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_registration);

        donorButton = findViewById(R.id.donorButton);
        recipientButton = findViewById(R.id.recipientButton);
        backButton = findViewById(R.id.backButton);

        donorButton.setOnClickListener(view -> {
            Intent intent = new Intent(SelectRegistrationActivity.this, DonorRegistrationActivity.class);
            startActivity(intent);
        });

        recipientButton.setOnClickListener(view -> {
            Intent intent = new Intent(SelectRegistrationActivity.this, RecipientRegistrationActivity.class);
            startActivity(intent);
        });

        backButton.setOnClickListener(view -> {
            Intent intent = new Intent(SelectRegistrationActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}