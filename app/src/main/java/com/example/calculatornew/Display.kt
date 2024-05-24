package com.example.calculatornew

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class Display : AppCompatActivity() {

    private lateinit var textAnswer :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        textAnswer = findViewById(R.id.textAnswer)
        textAnswer.setText(intent.getDoubleExtra("answer", 0.0).toString())

        var btnBack = findViewById<Button>(R.id.backButton)

        btnBack.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}

