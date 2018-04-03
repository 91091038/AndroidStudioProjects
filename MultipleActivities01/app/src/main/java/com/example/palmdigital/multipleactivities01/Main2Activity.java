package com.example.palmdigital.multipleactivities01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener
{
    Button buttonBack;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonBack = findViewById(R.id.buttonBack
        );
        buttonBack.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.buttonBack)
        {
         Intent i = new Intent(this, MainActivity.class);
         startActivity(i);
        }

    }
}
