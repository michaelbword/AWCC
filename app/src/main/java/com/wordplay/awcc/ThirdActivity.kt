package com.WordPlay.awcc
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main3.*

class Setup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        editTextNumber120.text.toString().toInt()
    }
}

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }
        val button7 = findViewById<Button>(R.id.button35)
        button7.setOnClickListener {
            val value1 = editTextNumber120.text.toString().toInt()

            fun accessory(): Int {

                return when {

                    value1 < 10 -> value1 * 0

                    value1 in 10..20 -> value1 * 1

                    value1 in 21..40 -> value1 * 2

                    value1 in 40..50 -> value1 * 3

                    value1 in 51..75 -> {
                        value1 * 4
                    }

                    value1 > 75 -> {
                        value1 * 5
                    }

                    else -> {
                        value1
                    }
                }
            }

            val complete = accessory().toString()
            try {
                editTextNumber19?.setText(complete)
            } catch (e: NumberFormatException) {
                try {
                    accessory()
                } catch (e: java.lang.NumberFormatException) {
                    Toast.makeText(
                        applicationContext,
                        "Please enter a 0 in the blank fields",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        }
    }
}
