package com.example.palmdigital.simplecalc_v03;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    TextView textViewNum1Display;
    TextView textViewNum2Display;
    TextView tvOutput;
    ImageView imageViewPlus;
    ImageView imageViewMinus;
    ImageView imageViewMultiply;
    ImageView imageViewDivide;
    ImageView imageViewExponentiation;
    int num1;
    int num2;
    double result;
    char operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNum1Display = findViewById(R.id.tvNum1Display);
        textViewNum2Display = findViewById(R.id.tvNum2Display);
        tvOutput = findViewById(R.id.tvOutput);

        Button buttonClear = findViewById(R.id.clear);

        //first number chosen
        ImageView imageView_0a = findViewById(R.id.imageView_0a);
        ImageView imageView_1a = findViewById(R.id.imageView_1a);
        ImageView imageView_2a = findViewById(R.id.imageView_2a);
        ImageView imageView_3a = findViewById(R.id.imageView_3a);
        ImageView imageView_4a = findViewById(R.id.imageView_4a);
        ImageView imageView_5a = findViewById(R.id.imageView_5a);
        ImageView imageView_6a = findViewById(R.id.imageView_6a);
        ImageView imageView_7a = findViewById(R.id.imageView_7a);
        ImageView imageView_8a = findViewById(R.id.imageView_8a);
        ImageView imageView_9a = findViewById(R.id.imageView_9a);

        //second number chosen
        ImageView imageView_0b = findViewById(R.id.imageView_0b);
        ImageView imageView_1b = findViewById(R.id.imageView_1b);
        ImageView imageView_2b = findViewById(R.id.imageView_2b);
        ImageView imageView_3b = findViewById(R.id.imageView_3b);
        ImageView imageView_4b = findViewById(R.id.imageView_4b);
        ImageView imageView_5b = findViewById(R.id.imageView_5b);
        ImageView imageView_6b = findViewById(R.id.imageView_6b);
        ImageView imageView_7b = findViewById(R.id.imageView_7b);
        ImageView imageView_8b = findViewById(R.id.imageView_8b);
        ImageView imageView_9b = findViewById(R.id.imageView_9b);

        //operations
        imageViewPlus = findViewById(R.id.imageViewPlus);
        imageViewMinus = findViewById(R.id.imageViewMinus);
        imageViewMultiply = findViewById(R.id.imageViewMultiply);
        imageViewDivide = findViewById(R.id.imageViewDivide);
        imageViewExponentiation = findViewById(R.id.imageViewExponentiation);
        ImageView imageViewEquals = findViewById(R.id.imageViewEquals);

        buttonClear.setOnClickListener(this);

        imageView_0a.setOnClickListener(this);
        imageView_1a.setOnClickListener(this);
        imageView_2a.setOnClickListener(this);
        imageView_3a.setOnClickListener(this);
        imageView_4a.setOnClickListener(this);
        imageView_5a.setOnClickListener(this);
        imageView_6a.setOnClickListener(this);
        imageView_7a.setOnClickListener(this);
        imageView_8a.setOnClickListener(this);
        imageView_9a.setOnClickListener(this);

        imageView_0b.setOnClickListener(this);
        imageView_1b.setOnClickListener(this);
        imageView_2b.setOnClickListener(this);
        imageView_3b.setOnClickListener(this);
        imageView_4b.setOnClickListener(this);
        imageView_5b.setOnClickListener(this);
        imageView_6b.setOnClickListener(this);
        imageView_7b.setOnClickListener(this);
        imageView_8b.setOnClickListener(this);
        imageView_9b.setOnClickListener(this);

        imageViewPlus.setOnClickListener(this);
        imageViewMinus.setOnClickListener(this);
        imageViewMultiply.setOnClickListener(this);
        imageViewDivide.setOnClickListener(this);
        imageViewExponentiation.setOnClickListener(this);
        imageViewEquals.setOnClickListener(this);

//USE OPERATOR SIGN AS TRIGGER TO REGISTER NUM2


        /*public int pow(int base, int exponent)
        * {return 0;
        * }*/
    } //end of onCreate
    public void onClick(View v)
    {
     if(v.getId() == R.id.imageView_0a)
     {
        textViewNum1Display.setText("0");
        num1 = 0;
     }
     else if(v.getId() == R.id.imageView_1a)
     {
         textViewNum1Display.setText("1");
         num1 = 1;
     }
     else if(v.getId() == R.id.imageView_2a)
     {
         textViewNum1Display.setText("2");
         num1 = 2;
     }
     else if(v.getId() == R.id.imageView_3a)
     {
         textViewNum1Display.setText("3");
         num1 = 3;
     }
     else if(v.getId() == R.id.imageView_4a)
     {
         textViewNum1Display.setText("4");
         num1 = 4;
     }
     else if(v.getId() == R.id.imageView_5a)
     {
         textViewNum1Display.setText("5");
         num1 = 5;
     }
     else if(v.getId() == R.id.imageView_6a)
     {
         textViewNum1Display.setText("6");
         num1 = 6;
     }
     else if(v.getId() == R.id.imageView_7a)
     {
         textViewNum1Display.setText("7");
         num1 = 7;
     }
     else if(v.getId() == R.id.imageView_8a)
     {
         textViewNum1Display.setText("8");
         num1 = 8;
     }
     else if(v.getId() == R.id.imageView_9a)
     {
         textViewNum1Display.setText("9");
         num1 = 9;
     }
//second set of numbers
        if(v.getId() == R.id.imageView_0b)
        {
            textViewNum2Display.setText("0");
            num2 = 0;
        }
        else if(v.getId() == R.id.imageView_1b)
        {
            textViewNum2Display.setText("1");
            num2 = 1;
        }
        else if(v.getId() == R.id.imageView_2b)
        {
            textViewNum2Display.setText("2");
            num2 = 2;
        }
        else if(v.getId() == R.id.imageView_3b)
        {
            textViewNum2Display.setText("3");
            num2 = 3;
        }
        else if(v.getId() == R.id.imageView_4b)
        {
            textViewNum2Display.setText("4");
            num2 = 4;
        }
        else if(v.getId() == R.id.imageView_5b)
        {
            textViewNum2Display.setText("5");
            num2 = 5;
        }
        else if(v.getId() == R.id.imageView_6b)
        {
            textViewNum2Display.setText("6");
            num2 = 6;
        }
        else if(v.getId() == R.id.imageView_7b)
        {
            textViewNum2Display.setText("7");
            num2 = 7;
        }
        else if(v.getId() == R.id.imageView_8b)
        {
            textViewNum2Display.setText("8");
            num2 = 8;
        }
        else if(v.getId() == R.id.imageView_9b)
        {
            textViewNum2Display.setText("9");
            num2 = 9;
        }
        else if(v.getId() == R.id.imageViewPlus)
        {
            operation = '+';
            imageViewPlus.setBackgroundColor(0xffcccccc);
            imageViewMinus.setBackgroundColor(0xfafafa);
            imageViewMultiply.setBackgroundColor(0xfafafa);
            imageViewDivide.setBackgroundColor(0xfafafa);
            imageViewExponentiation.setBackgroundColor(0xfafafa);
        } else if(v.getId() == R.id.imageViewMinus)
        {
            operation = '-';
            imageViewPlus.setBackgroundColor(0xfafafa);
            imageViewMinus.setBackgroundColor(0xffcccccc);
            imageViewMultiply.setBackgroundColor(0xfafafa);
            imageViewDivide.setBackgroundColor(0xfafafa);
            imageViewExponentiation.setBackgroundColor(0xfafafa);
        }
        else if(v.getId() == R.id.imageViewMultiply)
        {
            operation = '*';
            imageViewPlus.setBackgroundColor(0xfafafa);
            imageViewMinus.setBackgroundColor(0xfafafa);
            imageViewMultiply.setBackgroundColor(0xffcccccc);
            imageViewDivide.setBackgroundColor(0xfafafa);
            imageViewExponentiation.setBackgroundColor(0xfafafa);
        }
        else if(v.getId() == R.id.imageViewDivide)
        {
            operation = '/'; //this is integer division
            //double (double) num1 / num2
            imageViewPlus.setBackgroundColor(0xfafafa);
            imageViewMinus.setBackgroundColor(0xfafafa);
            imageViewMultiply.setBackgroundColor(0xfafafa);
            imageViewDivide.setBackgroundColor(0xffcccccc);
            imageViewExponentiation.setBackgroundColor(0xfafafa);
        }
        else if(v.getId() == R.id.imageViewExponentiation)
        {
            operation = '^';
            imageViewPlus.setBackgroundColor(0xfafafa);
            imageViewMinus.setBackgroundColor(0xfafafa);
            imageViewMultiply.setBackgroundColor(0xfafafa);
            imageViewDivide.setBackgroundColor(0xfafafa);
            imageViewExponentiation.setBackgroundColor(0xffcccccc);
        }
        else if(v.getId() == R.id.imageViewEquals)
        {
            if(operation == '/' && num2 == 0)
            {
                Toast.makeText(MainActivity.this, "No dividing by zero!", Toast.LENGTH_SHORT).show();
                tvOutput.setText("null");
            }
            else if(operation == '^' && num1 == 0 && num2 == 0)
            {
                tvOutput.setText("undefined");
            }
            else if(operation == '+')
            {
                result = num1 + num2;
            }
            else if (operation == '-')
            {
                result = num1 - num2;
            }
            else if (operation == '*')
            {
                result = num1 * num2;
            }
            else if (operation == '/')
            {
                result = (double) num1/num2;
            }
            else {
                result = pow(num1, num2);
            }
            tvOutput.setText("" + result);
        }
        else if(v.getId() == R.id.clear)
        {
            textViewNum1Display.setText("0");
            textViewNum2Display.setText("0");
            tvOutput.setText("0");
        }

    }

    public static int pow(int num1, int num2)
    {
        int product = 1;
        int base = num1;
        int exp = num2;
        for(int i = 0; i < exp; i++)
        {
            product = product * base;
        }
        return product;
    }


} //end of class
