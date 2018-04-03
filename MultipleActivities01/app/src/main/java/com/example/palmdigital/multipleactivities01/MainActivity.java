package com.example.palmdigital.multipleactivities01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
Button buttonSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSwitch = findViewById(R.id.buttonSwitch);
        buttonSwitch.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.buttonSwitch)
        {
            //first create an object called an 'Intent'
            //this - where is the object coming from? it's coming from THIS and then going to MAIN2Activity
            Intent i = new Intent (this, Main2Activity.class);
            startActivity(i);
        }
    }
}
