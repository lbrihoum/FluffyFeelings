package com.example.bloop.fluffyfeelings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnimalChoice extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_choice);

        Button catButton = findViewById(R.id.catButton);
        Button dogButton = findViewById(R.id.dogButton);
        Button birdButton = findViewById(R.id.birdButton);
        Button bunnyButton = findViewById(R.id.bunnyButton);
        Button reptileButton = findViewById(R.id.lizardButton);

        catButton.setOnClickListener(this);
        dogButton.setOnClickListener(this);
        birdButton.setOnClickListener(this);
        bunnyButton.setOnClickListener(this);
        reptileButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        System.out.println("VID: " + v.getId());
        System.out.println("Catto: " + R.id.catButton);
        System.out.println("Doggo: " + R.id.dogButton);
        Intent intent = new Intent(AnimalChoice.this, AnimalView.class);
        switch (v.getId()) {
            case R.id.catButton:
                intent.putExtra("cats", true);
                startActivity(intent);
                break;
            case R.id.dogButton:
                intent.putExtra("dogs", true);
                startActivity(intent);
                break;
            case R.id.birdButton:
                intent.putExtra("birds", true);
                startActivity(intent);
                break;
            case R.id.bunnyButton:
                intent.putExtra("fluffies", true);
                startActivity(intent);
                break;
            case R.id.lizardButton:
                intent.putExtra("reptiles", true);
                startActivity(intent);
                break;
        }
    }
}

