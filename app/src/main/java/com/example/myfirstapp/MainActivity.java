package com.example.myfirstapp;
//test git
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //Method to add two numbers
    public int addNumbers(int a, int b){
        return a + b;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    // Displaying Hello World message
        Log.d("MyTag", "Hello, World!");

         //Variables and Control Flow
        String name = "Mary";
        int age = 21;

        if (age < 18) {
            Log.d("MyTag", name + " is a minor.");
        } else {
            Log.d("MyTag", name + " is an adult.");
        }

        //Array Example
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers ) {
            Log.d("MyTag", "Number: " + num);
        }

        // Method Usage
        int result = addNumbers(3, 5);
        Log.d("MyTag", "sum: " + result);
    }
}