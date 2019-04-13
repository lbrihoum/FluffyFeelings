package com.example.bloop.fluffyfeelings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;

public class AnimalChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_choice);

        addButtonClickEventListener();

    }
    public void onCheckboxClicked (View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        Intent intent2 = new Intent(AnimalChoice.this, AnimalView.class);
        switch (view.getId())
        {
            case R.id.checkBox1:
                if (checked)
                    intent2.putExtra("cats", true);
            case R.id.checkBox2:
                if (checked)
                    intent2.putExtra("dogs", true);
            case R.id.checkBox3:
                if (checked)
                    intent2.putExtra("birds",true);
            case R.id.checkBox4:
                if (checked)
                    intent2.putExtra("bunnies",true);
            case R.id.checkBox5:
                if (checked)
                    intent2.putExtra("lizards",true);

        }
    }
    public void addButtonClickEventListener() {
        Button button = (Button) findViewById(R.id.goButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AnimalChoice.this, AnimalView.class);
                startActivity(intent);
            }
        });
    }
}
