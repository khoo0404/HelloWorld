package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //OnCreate = main()
        super.onCreate(savedInstanceState)
        //Create the UI
        // R = resources
        setContentView(R.layout.activity_main)
        //TODO continue your work here
        //val = value, var = variable
        //Java int x; Kotlin val x : Int
        val buttonPressMe : Button = findViewById(R.id.buttonPress_me)
        buttonPressMe.setOnClickListener { showMessage() }

        val buttonReset : Button = findViewById(R.id.buttonReset)
        buttonReset.setOnClickListener{ showMessage2()}

}

    private fun showMessage2() {
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.app_name))
    }

    private fun showMessage() {
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.Greeting))
    }
}
