package com.example.palmdigital.caesarcipher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button encrypt = findViewById(R.id.button_Encrypt);
        Button decrypt = findViewById(R.id.button_Decrypt);
        encrypt.setOnClickListener(this);
        decrypt.setOnClickListener(this);


    }

    public void onClick(View v)
    {

        EditText etInput = findViewById(R.id.etInput);
        String etInputStr = etInput.getText().toString();

        String etShiftStr = "";
        EditText etShift = findViewById(R.id.etShift);
        etShiftStr += etShift.getText().toString();
        int theShift = Integer.parseInt(etShiftStr);

        if(v.getId() == R.id.button_Encrypt)
        {
            String encrypted = encrypt(etInputStr, theShift);
            TextView tvOutput = findViewById(R.id.tvOutput);
            tvOutput.setText(encrypted);
        }
        else if(v.getId() == R.id.button_Decrypt)
        {
            String decrypted = decrypt(etInputStr, theShift);
            TextView tvOutput = findViewById(R.id.tvOutput);
            tvOutput.setText(decrypted);

        }

    }

    public String encrypt(String input, int shift)
    {
        String output = "";
        int alphabetSize = 26;
        char[] alphabet = new char[alphabetSize];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        // make every character in input uppercase
        input = input.toUpperCase();
        //for each character in the input string
        for (int i = 0; i < input.length(); i++)
        {
            char thisVal = input.charAt(i);
            if (thisVal == ' ')
            {
                output += ' ';
            }
            else
            {
                for (int j = 0; j < alphabetSize; j++)
                {
                    if (alphabet[j] == thisVal)
                    {
                        System.out.println("the position is " + j);
                        int shiftedIndex = (j + shift) % alphabetSize;
                        System.out.println("the encrypted character is " + alphabet[shiftedIndex]);
                        output += alphabet[shiftedIndex];
                    }
                }
            }
        }
        return output;
    }

    public static String decrypt(String input, int shift)
    {
        String output = "";
        int alphabetSize = 26;
        char[] alphabet = new char[alphabetSize];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        // make every character in input uppercase
        input = input.toUpperCase();
        //for each character in the input string
        for (int i = 0; i < input.length(); i++)
        {
            char thisVal = input.charAt(i);
            if (thisVal == ' ')
            {
                output += ' ';
            }
            else
            {
                for (int j = 0; j < alphabetSize; j++)
                {
                    if (alphabet[j] == thisVal)
                    {
                        System.out.println("the position is " + j);
                        int shiftedIndex = (j - shift + 26) % alphabetSize;
                        System.out.println("the decrypted string is " + alphabet[shiftedIndex]);
                        output += alphabet[shiftedIndex];
                    }
                }
            }
        }
        return output;
    }

}
