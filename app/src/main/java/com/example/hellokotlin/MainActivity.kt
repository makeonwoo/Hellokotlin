package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHello : Button
        btnHello = findViewById(R.id.btnHello)
        btnHello.setOnClickListener {
            Toast.makeText(this@MainActivity, "버튼클릭", Toast.LENGTH_LONG).show()
        }
    }
}