package com.example.bloop.fluffyfeelings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AnimalView extends AppCompatActivity {

    ImageView animalImage;
    Button likeButton;
    Button nextButton;
    Button backButton;
    boolean cats;
    boolean dogs;
    boolean birds;
    boolean fluffies;
    boolean reptiles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_view);

        animalImage = findViewById(R.id.placeholder);
        nextButton = findViewById(R.id.next_button);
        backButton = findViewById(R.id.back_button);
        likeButton = findViewById(R.id.like_button);
        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                likeButton.setBackgroundResource(R.drawable.like_button_pressed);
            }
        });

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        cats = bundle.getBoolean("cats",false);
        dogs = bundle.getBoolean("dogs",false);
        birds = bundle.getBoolean("birds", false);
        fluffies = bundle.getBoolean("fluffies", false);
        reptiles = bundle.getBoolean("reptiles", false);

        if (cats) {
            animalImage.setImageResource(R.drawable.cat1);
            nextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    animalImage.setImageResource(R.drawable.cat2);
                }
            });
        }
        else if (dogs) {
            animalImage.setImageResource(R.drawable.dog2);
            nextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    animalImage.setImageResource(R.drawable.dog3);
                }
            });
        }
        else if (birds) {
            animalImage.setImageResource(R.drawable.bird1);
            nextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    animalImage.setImageResource(R.drawable.bird3);
                }
            });
        }
        else if (fluffies) {
            animalImage.setImageResource(R.drawable.bunny_transparent);
            nextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    animalImage.setImageResource(R.drawable.cat2);
                }
            });
        }
        else if (reptiles) {
            animalImage.setImageResource(R.drawable.rept1);
            nextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    animalImage.setImageResource(R.drawable.rept2);
                }
            });
        }
        else {
            animalImage.setImageResource(R.drawable.golden_ret);
        }
        
    }

}
