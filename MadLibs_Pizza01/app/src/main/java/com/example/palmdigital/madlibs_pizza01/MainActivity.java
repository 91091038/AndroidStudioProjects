package com.example.palmdigital.madlibs_pizza01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        EditText et_Adj1 = findViewById(R.id.etAdjective1);
        String etAdjStr  = et_Adj1.getText().toString();

        EditText et_nationality = findViewById(R.id.etNationality);
        String etNationalityStr    = et_nationality.getText().toString();

        EditText et_Name = findViewById(R.id.etName);
        String etNameStr = et_Name.getText().toString();


        String story = "Pizza was invented by a ";
        story = story + etAdjStr;
        story = story + " " + etNationalityStr;
        story = story + " " + etNameStr;

        TextView output = findViewById(R.id.tvStory);
        output.setText(story);
    }
} //end of class
