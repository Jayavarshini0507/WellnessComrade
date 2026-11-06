package com.example.wellnesscomrade;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button iron;
    private Button b12;
    private Button vitaminD;
    private Button calcium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect buttons with XML
        iron = findViewById(R.id.btnIron);
        b12 = findViewById(R.id.btnB12);
        vitaminD = findViewById(R.id.btnVitaminD);
        calcium = findViewById(R.id.btnCalcium);

        // Create deficiency objects
        Deficiency ironData = new Deficiency(
                "Iron Deficiency",
                "Spinach, beans, lentils and meat",
                "Iron helps the body produce haemoglobin."
        );

        Deficiency b12Data = new Deficiency(
                "Vitamin B12 Deficiency",
                "Milk, eggs, fish and meat",
                "Vitamin B12 supports nerve function and red blood cell formation."
        );

        Deficiency vitaminDData = new Deficiency(
                "Vitamin D Deficiency",
                "Fatty fish and fortified milk",
                "Vitamin D helps the body absorb calcium."
        );

        Deficiency calciumData = new Deficiency(
                "Calcium Deficiency",
                "Milk, curd, cheese and calcium-set tofu",
                "Calcium supports healthy bones and teeth."
        );

        // Open details pages when buttons are clicked
        iron.setOnClickListener(v -> openDetails(
                ironData,
                "Iron is essential for producing haemoglobin, which carries oxygen in the blood."
        ));

        b12.setOnClickListener(v -> openDetails(
                b12Data,
                "Vitamin B12 supports normal nerve function and the formation of red blood cells."
        ));

        vitaminD.setOnClickListener(v -> openDetails(
                vitaminDData,
                "Vitamin D helps the body absorb calcium and supports bone health."
        ));

        calcium.setOnClickListener(v -> openDetails(
                calciumData,
                "Calcium supports strong bones and teeth and helps muscles and nerves function."
        ));
    }

    // Navigate to the details page
    private void openDetails(Deficiency deficiency, String importance) {

        Intent intent = new Intent(MainActivity.this, DetailActivity.class);

        intent.putExtra("name", deficiency.getName());
        intent.putExtra("description", deficiency.getDescription());
        intent.putExtra("importance", importance);
        intent.putExtra("foodSources", deficiency.getFoodSources());

        startActivity(intent);
    }
}
