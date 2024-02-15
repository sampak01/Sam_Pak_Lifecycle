package com.example.lifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val TAG = "Lifecycle Tracker"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate(Bundle) called");
        setContentView(R.layout.activity_main)
        val editTextBox = findViewById<EditText>(R.id.editTextBox)
        val textViewBox = findViewById<TextView>(R.id.textViewBox)
        val helloButton = findViewById<Button>(R.id.helloButton)
        helloButton.setOnClickListener{
            editTextBox.setText("Hello")
            textViewBox.setText("Hello")
        }
    }



    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }
}