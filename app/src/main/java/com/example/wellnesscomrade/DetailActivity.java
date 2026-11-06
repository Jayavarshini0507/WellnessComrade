package com.example.wellnesscomrade;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Connect Java variables with XML views
        TextView title = findViewById(R.id.tvDetailTitle);
        TextView description = findViewById(R.id.tvDetailDescription);
        TextView importance = findViewById(R.id.tvImportance);
        TextView foodSources = findViewById(R.id.tvFoodSources);
        TextView back = findViewById(R.id.btnBack);

        // Receive information from MainActivity
        String name = getIntent().getStringExtra("name");
        String descriptionText = getIntent().getStringExtra("description");
        String importanceText = getIntent().getStringExtra("importance");
        String foodText = getIntent().getStringExtra("foodSources");

        // Display the received information
        title.setText(name);
        description.setText(descriptionText);
        importance.setText(importanceText);
        foodSources.setText(foodText);

        // Back button
        back.setOnClickListener(v -> finish());
    }
}
