package com.example.vic_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var text_result :TextView
    private lateinit var number_one :EditText
    private lateinit var number_two :EditText
    private lateinit var add_number :Button
    private lateinit var multiply_number :Button
    private lateinit var divide_number :Button
    private lateinit var subtract_number :Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_result = findViewById(R.id.display)
        number_one = findViewById(R.id.first_number)
        number_two = findViewById(R.id.second_number)
        add_number = findViewById(R.id.ongeza)
        multiply_number = findViewById(R.id.zidisha)
        divide_number = findViewById(R.id.divide)
        subtract_number = findViewById(R.id.subtract)


        add_number.setOnClickListener {

            var num_one = number_one.text.toString().trim()
            var num_two = number_two.text.toString().trim()

            if (num_one.isEmpty() || num_two.isEmpty()){

                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()
            }
            else {
                var result = num_one.toDouble() + num_two.toDouble()
                text_result.text=result.toString()
            }
        }

        multiply_number.setOnClickListener {


            var num_one = number_one.text.toString().trim()
            var num_two = number_two.text.toString().trim()

            if (num_one.isEmpty() || num_two.isEmpty()){

                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()
            }
            else {
                var result = num_one.toDouble() * num_two.toDouble()
                text_result.text=result.toString()
            }
        }
         divide_number.setOnClickListener {

             var num_one = number_one.text.toString().trim()
             var num_two = number_two.text.toString().trim()

             if (num_one.isEmpty() || num_two.isEmpty()){

                 Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()
             }
             else {
                 var result = num_one.toDouble() / num_two.toDouble()
                 text_result.text=result.toString()
             }
         }

        subtract_number.setOnClickListener {
            var num_one = number_one.text.toString().trim()
            var num_two = number_two.text.toString().trim()

            if (num_one.isEmpty() || num_two.isEmpty()){

                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()
            }
            else {
                var result = num_one.toDouble() - num_two.toDouble()
                text_result.text=result.toString()
            }
        }

    }
}