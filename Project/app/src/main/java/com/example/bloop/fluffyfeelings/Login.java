package com.example.bloop.fluffyfeelings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        addButtonClickEventListener();
    }

    public void addButtonClickEventListener() {
        Button button = (Button) findViewById(R.id.loginButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, AnimalChoice.class);
                startActivity(intent);
            }
        });
    }
}
