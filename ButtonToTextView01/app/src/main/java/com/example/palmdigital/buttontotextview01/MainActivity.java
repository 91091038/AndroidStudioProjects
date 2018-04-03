package com.example.palmdigital.buttontotextview01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject1 = findViewById(R.id.button1);
        buttonObject1.setOnClickListener(this);
    }

    public void onClick(View view)
    {

        TextView tvObject1 = findViewById(R.id.textView1);
        String text = tvObject1.getText().toString();
        if(text == "ON")
        {
            tvObject1.setText("OFF");
        } else //it must be off
        {
            tvObject1.setText("ON");
        }

    }
}
