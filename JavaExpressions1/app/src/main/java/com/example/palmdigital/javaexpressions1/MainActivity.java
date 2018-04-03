package com.example.palmdigital.javaexpressions1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 10;
        String b = "Alan Turing";
        boolean c = true;

        Log.i("info", "Hello, Android!");
        Log.i("info", "a = " + a);
        Log.i("info", "b = " + b);
        Log.i("info", "c = " + c);
        a++;
        Log.i("info", "a = " + a);
        Log.i("info", "c = " + (1 + 1 == 3));

        float myFloat = 4.0f;
        double myDouble = 42.0;
        int result = myAwesomeFunction();
        Log.i("info", "myAwesomeFunction returned: " + result);
        Log.i("info", "myFloatFunction returned: " + myFloatFunction());
        //Challenge: make a method that returns void that logs something out to the logcat
        returnVoid();

    } //end of onCreate method

    int myAwesomeFunction()
    {
        return 1000;
    }

    float myFloatFunction()
    {
        return 4.7f;
    }

    void returnVoid()
    {
        Log.i("info", "Hello from returnVoid");
    }



} //end of class MainActivity
