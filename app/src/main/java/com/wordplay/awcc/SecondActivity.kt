package com.WordPlay.awcc
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*


class Setup2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        editTextNumber2.text.toString().toInt()
        editTextNumber3.text.toString().toInt()
        editTextNumber4.text.toString().toInt()
        editTextNumber5.text.toString().toInt()
        editTextNumber6.text.toString().toInt()
        editTextNumber17.text.toString().toInt()
    }
}


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            val intent2 = Intent(this, ThirdActivity::class.java)
            startActivity(intent2)
        }

        val button = findViewById<Button>(R.id.button36)
        button.setOnClickListener {
            fun sprint() {
                val int1 = editTextNumber.text.toString().toInt()
                val pay1 = 5
                val product1 = int1 * pay1

                val int2 = editTextNumber2.text.toString().toInt()
                val pay2 = 7.5
                val product2 = int2 * pay2

                val int3 = editTextNumber3.text.toString().toInt()
                val pay3 = 10
                val product3 = int3 * pay3

                val int6 = editTextNumber6.text.toString().toInt()
                val pay4 = 4
                val product4 = int6 * pay4

                val int5 = editTextNumber5.text.toString().toInt()
                val pay5 = 4
                val product5 = int5 * pay5

                val int4 = editTextNumber4.text.toString().toInt()
                val pay6 = 5
                val product6 = int4 * pay6

                val final = product1 + product2 + product3 + product4 + product5 + product6

                val complete = final.toString()
                try {
                    editTextNumber17?.setText(complete)
                } catch (e: NumberFormatException) {
                    Toast.makeText(
                        applicationContext,
                        "Please enter a 0 in the blank field",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
            try {
                sprint()
            } catch (e:java.lang.NumberFormatException) {
                Toast.makeText(applicationContext, "Please enter a 0 in the blank fields",Toast.LENGTH_LONG).show()
            }
            }
        }
    }


