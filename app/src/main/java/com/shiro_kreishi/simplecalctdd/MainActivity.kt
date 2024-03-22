package com.shiro_kreishi.simplecalctdd

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numbersButton = arrayOf(
            R.id.button_0, R.id.button_1,
            R.id.button_2, R.id.button_3,
            R.id.button_4, R.id.button_5,
            R.id.button_6, R.id.button_7,
            R.id.button_8, R.id.button_9
            )
        val operations = arrayOf(
            R.id.button_c, R.id.button_open_bracket,
            R.id.button_close_bracket, R.id.button_addition,
            R.id.button_division, R.id.button_multiply,
        )
    }
}