package com.example.palmdigital.madlibs_puppy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    public void onClick (View view)
    {
        EditText etColor = findViewById(R.id.etColor);
        String etColorStr = etColor.getText().toString();

        EditText etBodyPart = findViewById(R.id.etBodyPart);
        String etBodyPartStr = etBodyPart.getText().toString();

        EditText etNouns = findViewById(R.id.etNouns);
        String etNounsStr = etNouns.getText().toString();

        EditText etVerb = findViewById(R.id.etVerb);
        String etVerbStr = etVerb.getText().toString();

        EditText etAdjective1 = findViewById(R.id.etAdjective1);
        String etAdjective1Str = etAdjective1.getText().toString();

        EditText etAdjective2 = findViewById(R.id.etAdjective2);
        String etAdjective2Str = etAdjective2.getText().toString();

        EditText etVerbs = findViewById(R.id.etVerbs);
        String etVerbsStr = etVerbs.getText().toString();

        EditText etNoun1 = findViewById(R.id.etNoun1);
        String etNoun1Str = etNoun1.getText().toString();   

        EditText etNoun2 = findViewById(R.id.etNoun2);
        String etNoun2Str = etNoun2.getText().toString();

        String story = "Today I saw him again. When he looks at me with those ";
        story = story + etColorStr;
        story = story + " eyes, it makes my " + etBodyPartStr;
        story = story + " go pitterpat, and I feel as if I have ";
        story = story + etNounsStr + " in my stomach. When he scrunches his nose, I want to ";
        story = story + etVerbStr + " him softly. He is so ";
        story = story + etAdjective1Str + " and " + etAdjective2Str;
        story = story + ". Tomorrow he will be mine. For now he ";
        story = story + etVerbsStr + " in the store " + etNoun1Str + " looking at me. " + etNoun2Str + " love is hard to resist!";

        TextView output = findViewById(R.id.output);
        output.setText(story);



    }
}
