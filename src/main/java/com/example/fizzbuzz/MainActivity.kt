package com.example.fizzbuzz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

var num = 1
var score = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttondisplay.text = num.toString()

        buttondisplay.setOnClickListener {
            if (num % 3 != 0 && num % 5 != 0 && num % 15 != 0) {
                num += 1
                score += 1
            }
            else {
                score = 0
                num = 1
                Toast.makeText(this, "you lose!", Toast.LENGTH_SHORT).show()

            }
            buttondisplay.text = num.toString()
            ScoreText.text = "Score: " + score.toString()
        }
        fizz.setOnClickListener {
            if (num % 3 == 0) {
                num += 1
                score += 1
            }
            else {
                score = 0
                num = 1
                Toast.makeText(this, "you lose!", Toast.LENGTH_SHORT).show()
            }
            buttondisplay.text = num.toString()
            ScoreText.text = "Score: " + score.toString()
        }
        buzz.setOnClickListener {
            if (num % 5 == 0) {
                num += 1
                score += 1
            }
            else {
                score = 0
                num = 1
                Toast.makeText(this, "you lose!", Toast.LENGTH_SHORT).show()
            }
            buttondisplay.text = num.toString()
            ScoreText.text = "Score: " + score.toString()
        }
        fizzbuzz.setOnClickListener {
            if (num % 15 == 0) {
                num += 1
                score += 2
            }
            else {
                num = 1
                score = 0
                Toast.makeText(this, "you lose!", Toast.LENGTH_SHORT).show()

            }
            buttondisplay.text = num.toString()
            ScoreText.text = "Score: " + score.toString()
        }
    }
}
