package com.example.palmdigital.chooseyourownadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExploreActivity extends AppCompatActivity implements View.OnClickListener {
Button buttonLeftBackyard;
Button buttonRightToilet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        buttonLeftBackyard = findViewById(R.id.buttonLeftBackyard);
        buttonLeftBackyard.setOnClickListener(this);
        buttonRightToilet = findViewById(R.id.buttonRightToilet);
        buttonRightToilet.setOnClickListener(this);
    }

    public void onClick (View view)
    {
        if(view.getId() == R.id.buttonLeftBackyard)
        {
            Intent i = new Intent (this, BackyardActivity.class);
            startActivity(i);
        }
        else
        {
            Intent i = new Intent (this, ToiletActivity.class);
            startActivity(i);
        }
    }
}
