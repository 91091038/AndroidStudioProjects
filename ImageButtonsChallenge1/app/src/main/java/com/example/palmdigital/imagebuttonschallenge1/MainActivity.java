package com.example.palmdigital.imagebuttonschallenge1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    public ImageButton buttonObject1;
    public ImageButton buttonObject2;
    public ImageButton buttonObject3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connecting UI button references to the UI buttons
        buttonObject1 = findViewById(R.id.imageButton1);

        buttonObject2 = findViewById(R.id.imageButton2);

        buttonObject3 = findViewById(R.id.imageButton3);





    }
}
