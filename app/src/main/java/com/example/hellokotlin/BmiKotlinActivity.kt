package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class BmiKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding)

        val heightField = findViewById<EditText>(R.id.heightField);
        val weightField = findViewById<EditText>(R.id.weightField);
        val txtResult = findViewById<TextView>(R.id.textResult);
        val btnBMI = findViewById<Button>(R.id.btnBmi);

        btnBMI.setOnClickListener {
//            val height = heightField.getText().toString().toDouble()
//            val weight = weightField.getText().toString().toDouble()
            val sheight = heightField.getText().toString()
            val sweight = weightField.getText().toString()

            try {
                val bmi = sweight.toDouble() /Math.pow(sheight.toDouble()/100.0,2.0)
                txtResult.setText("Your BMI = "+bmi)
            }catch (e : Exception){
                txtResult.setText("Input(s) missing")
            }

        }
    }
}