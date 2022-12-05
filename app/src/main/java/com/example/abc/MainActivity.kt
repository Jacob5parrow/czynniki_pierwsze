package com.example.abc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            var n = findViewById<EditText>(R.id.editTextNumber).text.toString().toInt()
            var k = 2
            val wynik = mutableListOf<String>()

            while ( n > 1 )
            {
                while ( n % k == 0  )
                {
                    val k2 = k.toString()
                    wynik += k2
                    n /= k
                }
                k += 1
            }
            findViewById<TextView>(R.id.text1).text = wynik.toString()

        }
        }
}
