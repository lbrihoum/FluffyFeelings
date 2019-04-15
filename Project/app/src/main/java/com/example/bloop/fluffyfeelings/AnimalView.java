package com.example.bloop.fluffyfeelings;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.content.Intent;

public class AnimalView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Bundle bundle = getIntent().getExtras();
        boolean cats = bundle.getBoolean("cats",true);
        boolean dogs = bundle.getBoolean("dogs",true);
        boolean birds = bundle.getBoolean("birds", true);
        boolean bunnies = bundle.getBoolean("bunnies", true);
        boolean lizards = bundle.getBoolean("lizards", true);
        if(cats)
            //insert code for pulling cat pics from the firebase
        if(dogs)
            //insert code for pulling dog pics from the firebase
        if (birds)
            //insert code for pulling bird pics from the firebase
        if (bunnies)
            //insert code for pulling bunny pics from the firebase
        if (lizards)
            //insert code for pulling lizard pics from the firebase
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_view);
        
    }

}
