package com.example.palmdigital.toast03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInst

                anceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "My name is Tharushi", Toast.LENGTH_SHORT) .show();
    }
}
