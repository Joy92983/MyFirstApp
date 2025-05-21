package com.example.myfirstapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Method to add two numbers
    public int addNumbers(int a, int b){
        return a + b;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textViewOutput);

        // Display custom message instead of using Log only
        String output = "";

        String name = "Mary";
        int age = 21;

        if (age < 18) {
            output += name + " is a minor.\n";
        } else {
            output += name + " is an adult.\n";
        }

        // Array Example
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers ) {
            output += "Number: " + num + "\n";
        }

        // Method Usage
        int result = addNumbers(3, 5);
        output += "Sum: " + result;

        textView.setText(output);
    }
}