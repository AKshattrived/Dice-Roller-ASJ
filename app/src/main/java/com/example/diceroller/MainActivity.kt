package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollDice: Button = findViewById(R.id.button2)
        val textResult : TextView = findViewById(R.id.textView2)
        rollDice.setOnClickListener {
            Toast.makeText(this,"Dice Rolled!",Toast.LENGTH_SHORT).show()

            when(Dice(6).roll()){
                1 -> textResult.text = "1"
                2 -> textResult.text = "2"
                3 -> textResult.text = "3"
                4 -> textResult.text = "4"
                5 -> textResult.text = "5"
                6 -> textResult.text = "4"
            }

        }
    }
}

class Dice(private val numSides : Int){
    fun roll() : Int{
        return (1..numSides).random()
    }
}