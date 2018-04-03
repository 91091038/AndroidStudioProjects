package com.example.palmdigital.switch01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView tvObject1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch switchObject1 = findViewById(R.id.switch1);
        switchObject1.setOnClickListener(this);

        tvObject1 = findViewById(R.id.tv1);
    } //end of onCreate method

    public void onClick (View v)
    {
        if(v.getId() == R.id.switch1)
        {
            String tvText = tvObject1.getText().toString();
            if(tvText == "OFF")
                tvObject1.setText("ON");
            else
                tvObject1.setText("OFF");

        }
    }
} //end of class
