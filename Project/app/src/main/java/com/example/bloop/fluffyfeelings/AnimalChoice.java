package com.example.bloop.fluffyfeelings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class AnimalChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_choice);
        addButtonClickEventListener();

    }

    public void addButtonClickEventListener() {
        Button button = (Button) findViewById(R.id.goButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AnimalChoice.this, AnimalView.class);
                startActivity(intent);
            }
        });
    }
}
