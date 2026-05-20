package com.queen.assistant

import android.os.Bundle
import android.widget.TextView
import android.graphics.Color
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val textView = TextView(this)
        textView.text = "QUEEN IS ONLINE AND READY!"
        textView.textSize = 24f
        textView.setTextColor(Color.parseColor("#FF1744"))
        textView.setBackgroundColor(Color.parseColor("#050505"))
        textView.gravity = Gravity.CENTER
        
        setContentView(textView)
    }
}
