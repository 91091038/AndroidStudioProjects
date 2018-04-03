package com.example.palmdigital.buttonchallenge01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
public Button buttonObject1;
public Button buttonObject2;
public Button buttonObject3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connecting UI button references to the UI buttons
        buttonObject1 = findViewById(R.id.button1);

        buttonObject2 = findViewById(R.id.button2);

        buttonObject3 = findViewById(R.id.button3);

        //sets the text and background color for the buttons
        buttonObject1.setText("Contacts");
        buttonObject1.setBackgroundColor(0xffcccccc);

        buttonObject2.setText("Email");
        buttonObject2.setBackgroundColor(0xff888888);

        buttonObject3.setText("Messages");
        buttonObject3.setBackgroundColor(0xff444444);

        //sets the buttons as onClick listeners
        buttonObject1.setOnClickListener(this);
        buttonObject2.setOnClickListener(this);
        buttonObject3.setOnClickListener(this);
    } //end of onCreate()

    public void onClick(View view)
    {
    if(view.getId() == R.id.button1)
    {
        Toast.makeText(this, "You selected Contacts.", Toast.LENGTH_SHORT).show();
        Log.i("info", "You selected Contacts.");
    }
    else if(view.getId() == R.id.button2)
    {
        Toast.makeText(this, "You selected Email.", Toast.LENGTH_SHORT).show();
        Log.i("info", "You selected Email.");
    }
    else
    {
        Toast.makeText(this, "You selected Messages.", Toast.LENGTH_SHORT).show();
        Log.i("info", "You selected Messages.");
    }
    }

} //end of class
