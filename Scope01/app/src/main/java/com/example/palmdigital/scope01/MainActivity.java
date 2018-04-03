package com.example.palmdigital.scope01;
//variables inside a method are local - they go in the stack, not the heap
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int myInt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // delete a local variable
        // dataType variableName <-- this is a local variable declaration

        // some examples of primitive types and declarations
        myInt = 100; // int is a Java primitive type
        myInt = 200;
        double myDouble; // double is a Java primitive type
        char myChar = 'A'; // char is a Java primitive type
        float myFloat; // float is a Java primitive type
        boolean myBool; // boolean is a Java primitive type
        long myLong; // long is a Java primitive type
        // these are not primitive, they are classes
        String myString;
        Integer myInt2;
        Float myFloat2;
        Double myDouble2;
        //assign values to these variables
        myString = "this is a string";
        myInt = 5;
        myInt = someMethod(myInt);
        myDouble = 5.6;
        myFloat = 5.7f;
        myBool = true;
        myBool = false; //here it erases the true and reassigns myBool to equal false

        TextView tv_Num1Display = findViewById(R.id.tv_top);
        TextView tv_Num2Display;

        ImageView iv_things;
        Button button;

        someMethod2();
    } // end of onCreate
    public int someMethod(int input)
    {
        myInt = 10;
        someMethod2();
        return input + 5;
    }
    //void means it returns nothing
    public void someMethod2()
    {
        myInt = 42;
        System.out.println("myInt = " + myInt);
    }
} // end of class
