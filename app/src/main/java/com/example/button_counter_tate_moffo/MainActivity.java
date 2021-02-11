package com.example.button_counter_tate_moffo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Alex Tate-Moffo
 * Homework #1
 * CSCI370 (Spring 2021)
 *
 * Button Counter App:
 *      A simple app that allows the user to increment, decrement,
 *      and reset a value displayed on screen.
 *
 *      Some code provided by Prof Briggs in class
 *      All additions are entirely my own work
 */

public class MainActivity extends AppCompatActivity {

    // Declare global variables
    private String TAG = "MainActivity";
    private Button buttonAdd;
    private Button buttonSub;
    private Button buttonReset;
    private TextView textCounter;

    // ...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCounter = findViewById(R.id.textCounterID);

        buttonAdd = findViewById(R.id.buttonAddID);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Increments the counter
                incrementCounter();
            }
        });

        buttonSub = findViewById(R.id.buttonSubID);
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Increments the counter
                decrementCounter();
            }
        });

        buttonReset = findViewById(R.id.buttonResetID);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Increments the counter
                resetCounter();
            }
        });

    }

    // ...

    private void incrementCounter() {
        Log.i(TAG, "Add button pressed");

        // gets the current value of the counter text object
        int currentValue = Integer.valueOf(textCounter.getText().toString());
        // increments the value
        currentValue++;
        // sets the counter text object to the new value
        textCounter.setText(String.valueOf(currentValue));
    }

    private void decrementCounter() {
        Log.i(TAG, "Subtract button pressed");

        // gets the current value of the counter text object
        int currentValue = Integer.valueOf(textCounter.getText().toString());
        // decrements the value
        currentValue--;
        // sets the counter text object to the new value
        textCounter.setText(String.valueOf(currentValue));
    }

    private void resetCounter() {
        Log.i(TAG, "Subtract button pressed");

        // gets the current value of the counter text object
        int currentValue = Integer.valueOf(textCounter.getText().toString());
        // sets the value to zero
        currentValue = 0;
        // sets the counter text object to the new value
        textCounter.setText(String.valueOf(currentValue));
    }

    // ...

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "Saving instance state");

        // saves the current counter text object value to the bundle
        String counterValue = textCounter.getText().toString();
        outState.putString("textCounter", counterValue);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "Restoring instance state");

        // pulls the saved counter text object value from the bundle
        String counterValue = savedInstanceState.getString("textCounter");
        textCounter.setText(counterValue);
    }

    // ...

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Entering onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Entering onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Entering onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Entering onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Entering onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Entering onDestroy");
    }
}