package com.example.textappearancebug

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text1 = findViewById<TextView>(R.id.text1)
        val text2 = findViewById<TextView>(R.id.text2)
        val text3 = findViewById<TextView>(R.id.text3)

        text1.setTextAppearance(R.style.TextAppearanceBold)

        text2.setTextAppearance(R.style.TextAppearanceBold)
        text2.setTypeface(null, Typeface.NORMAL)

        text3.setTextAppearance(R.style.TextAppearanceBold)
        text3.setTypeface(null, Typeface.NORMAL)
        text3.setTextAppearance(R.style.TextAppearanceEmpty)
    }
}