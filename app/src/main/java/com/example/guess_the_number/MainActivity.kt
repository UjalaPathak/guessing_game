package com.example.guess_the_number

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val secretValue = findViewById<EditText>(R.id.secretnumber)
        val guessValue = findViewById<TextInputLayout>(R.id.guessInputvalue)
        val clickMeButton = findViewById<TextView>(R.id.clickme)
        val display = findViewById<TextView>(R.id.display_op)

        clickMeButton.setOnClickListener {
            val SecretInputValue = secretValue.text?.toString()?.toInt()
            val guessInputValue = guessValue.editText?.text?.toString()?.toInt()
            val result =
                if(guessInputValue!! > SecretInputValue!!) "No,my number is smaller"
                else if(guessInputValue!! < SecretInputValue) "No, my number is bigger"
                else "You got that right "


            display.text = "$result"
        }


    }
}