package com.example.blood_donor_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        registerButton = findViewById(R.id.registerButton);

        registerButton.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, SelectRegistrationActivity.class);
            startActivity(intent);
        });
    }
}