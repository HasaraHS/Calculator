package com.example.calculatornew

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.calculatornew.models.Calculator

class MainActivity : AppCompatActivity() {

    private lateinit var edtNumber1 :EditText
    private lateinit var edtNumber2 :EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       edtNumber1 = findViewById(R.id.edt1)
        edtNumber2 = findViewById(R.id.edt2)

    }

    fun buttonClick(v:View) {
        var ans = 0.0
        val calculator = Calculator(
            edtNumber1.text.toString().toDouble(),
            edtNumber2.text.toString().toDouble()
        )

        when (v.id) {
            R.id.button1 -> ans = calculator.add()
            R.id.button2 -> ans = calculator.subtract()
            R.id.button3 -> ans = calculator.multiply()
            R.id.button4 -> ans = calculator.divide()
        }

        println(ans)


        val intent = Intent(this, Display::class.java)
        intent.putExtra("answer", ans)
        startActivity(intent)
        finish()
    }
}