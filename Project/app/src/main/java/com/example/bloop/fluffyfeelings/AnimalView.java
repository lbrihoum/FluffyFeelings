package com.example.bloop.fluffyfeelings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AnimalView extends AppCompatActivity {

    ImageView animalImage;
    Button likeButton;
    boolean cats;
    boolean dogs;
    boolean birds;
    boolean bunnies;
    boolean lizards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_view);

        animalImage = findViewById(R.id.placeholder);
        likeButton = findViewById(R.id.like_button);
        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        cats = bundle.getBoolean("cats",false);
        dogs = bundle.getBoolean("dogs",false);
        birds = bundle.getBoolean("birds", false);
        bunnies = bundle.getBoolean("bunnies", false);
        lizards = bundle.getBoolean("lizards", false);

        if (cats) {
            animalImage.setImageResource(R.drawable.cat);
        } else if (dogs) {
            animalImage.setImageResource(R.drawable.dog);
        } else if (birds) {
            animalImage.setImageResource(R.drawable.puppy_kitty);
        } else if (bunnies) {
            animalImage.setImageResource(R.drawable.bunny_transparent);
        } else if (lizards) {
            animalImage.setImageResource(R.drawable.golden_ret);
        } else {
            animalImage.setImageResource(R.drawable.golden_ret);
        }
        
    }

}
