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
        //boolean cats = getIntent().getExtras().getBoolean("cats");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_view);
        
    }

}
