package com.example.blood_donor_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, SelectRegistrationActivity.class);
            startActivity(intent);
        });
    }
}