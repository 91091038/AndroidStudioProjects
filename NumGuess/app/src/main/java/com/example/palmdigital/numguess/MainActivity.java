package com.example.palmdigital.numguess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int lives = 8;
    Random rand = new Random();
    int answer = rand.nextInt(100) + 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCheck = findViewById(R.id.bGuess);
        buttonCheck.setOnClickListener(this);
    }

    public void onClick (View view)
    {

        String etGuessStr = "";
        EditText etGuess = findViewById(R.id.etGuess);
        etGuessStr += etGuess.getText().toString();
        int guess = Integer.parseInt(etGuessStr);


            if(guess == answer)
            {
                Toast.makeText(this,"Correct!", Toast.LENGTH_SHORT).show();
            }
            else if(guess > answer)
            {
                Toast.makeText(this, "Too high.", Toast.LENGTH_SHORT).show();
                lives--;
            }
            else if(guess < answer)
            {
                Toast.makeText(this, "Too low.", Toast.LENGTH_SHORT).show();
                lives--;
            }
            if(lives == 0)
            {
                Toast.makeText(this, "You ran out of tries.", Toast.LENGTH_SHORT).show();
            }

    }
}
