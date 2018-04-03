package com.example.palmdigital.simplecalc_v02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    TextView textViewNum1Display;
    TextView textViewNum2Display;
    TextView tvOutput;
    int num1 = 0;
    int num2 = 0;
    int result;
    //boolean operation;
    char operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNum1Display = findViewById(R.id.tvNum1Display);
        textViewNum2Display = findViewById(R.id.tvNum2Display);
        tvOutput = findViewById(R.id.tvOutput);

        ImageView imageView1 = findViewById(R.id.imageView_1);

        ImageView imageView2 = findViewById(R.id.imageView_2);

        ImageView imageView3 = findViewById(R.id.imageView_3);

        ImageView imageView4 = findViewById(R.id.imageView_4);

        ImageView imageView5 = findViewById(R.id.imageView_5);

        ImageView imageView6 = findViewById(R.id.imageView_6);

        ImageView imageViewPlus = findViewById(R.id.imageViewPlusSign);

        ImageView imageViewMinusSign = findViewById(R.id.imageViewMinusSign);

        ImageView imageViewEquals = findViewById(R.id.imageView_Equals);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageViewPlus.setOnClickListener(this);
        imageViewMinusSign.setOnClickListener(this);
        imageViewEquals.setOnClickListener(this);
    } //end of onCreate();

    public void onClick(View v){
        if(v.getId() == R.id.imageView_1)
        {
            textViewNum1Display.setText("1");
            num1 = 1;
        }
        else if(v.getId() == R.id.imageView_2)
        {
            textViewNum1Display.setText("2");
            num1 = 2;
        }
        else if(v.getId() == R.id.imageView_3)
        {
            textViewNum1Display.setText("3");
            num1 = 3;
        }

        else if(v.getId() == R.id.imageView_4)
        {
            textViewNum2Display.setText("4");
            num2 = 4;
        }
        else if(v.getId() == R.id.imageView_5)
        {
            textViewNum2Display.setText("5");
            num2 = 5;
        }
        else if(v.getId() == R.id.imageView_6)
        {
            textViewNum2Display.setText("6");
            num2 = 6;
        }

        else if(v.getId() == R.id.imageViewPlusSign)
        {
            operation = '+';

        } else if (v.getId() == R.id.imageViewMinusSign)
        {
            operation = '-';
        }

        else if (v.getId() == R.id.imageView_Equals)
        {
            if(operation == '+')
            {
                result = num1 + num2;
            }
            else{
                result = num1 - num2;
            }

            tvOutput.setText("" + result);
        }
    }

}
