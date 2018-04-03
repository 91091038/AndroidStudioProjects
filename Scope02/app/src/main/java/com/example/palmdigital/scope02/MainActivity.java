package com.example.palmdigital.scope02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//member variables / fields go here
    int num6 = 27;
    double myDouble6 = 89.2;
    String myString6 = "even more tidepods";
    TextView tv6 = null;
    ImageView iv6 = null;
    Button button6 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } //end of onCreate
    //variables declared locally only exist in their method, they are created in memory and then destroyed at the last curly brace
    //if it's a field, then the local variable will overshadow the field; the field still exists but the local variable takes precedence over the field
    void myAwesomeMethod01 ()
    {
        int num1 = 24;
        double myDouble = 69.9;
        String myString = "tidepod";
        TextView tv1 = null;
        ImageView iv1 = null;
        Button button1 = null;
        button1 = findViewById(R.id.top);

    }

    void myAwesomeMethod02 ()
    {
        int num2 = 3;
        double myDouble2 = 4.0;
        String myString2 = "another tidepod";
        TextView tv2 = null;
        ImageView iv2 = null;
        Button button2 = null;
    }

    void myAwesomeMethod03 ()
    {
        int num3 = 27;
        double myDouble3 = 89.2;
        String myString3 = "more tidepods";
        TextView tv3 = null;
        ImageView iv3 = null;
        Button button3 = null;

    }

    void myAwesomeMethod04 ()
    {
        int num4 = 19;
        double myDouble4 = 43.7;
        String myString4 = "even more tidepods";
        TextView tv4 = null;
        ImageView iv4 = null;
        Button button4 = null;
    }

    void myAwesomeMethod05 ()
    {
        int num5 = 10;
        double myDouble5 = 92.5;
        String myString5 = "even more tidepods";
        TextView tv5 = null;
        ImageView iv5 = null;
        Button button5 = null;
    }


} //end of class
