package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        val txtActivityStartTime = findViewById<TextView>(R.id.txtActivityStartTime)
        val txtCountBtnClicks = findViewById<TextView>(R.id.txtCountClicks)
        val btnClickMe = findViewById<Button>(R.id.btnClickme)

        var clickCount = 0
        val startTIme = System.currentTimeMillis()
        val sTimeStamp = SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTIme)
        txtActivityStartTime.text = "Activity start time = ${sTimeStamp}"


        btnClickMe.setOnClickListener {
            clickCount++
            txtCountBtnClicks.text = "Button clicks =  +${clickCount}"
        }
    }
}