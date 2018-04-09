package com.example.palmdigital.chooseyourownadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WakeUpActivity extends AppCompatActivity implements View.OnClickListener
{
Button buttonRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up);

        buttonRestart = findViewById(R.id.buttonRestart);
        buttonRestart.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);
    }


} //end of class
