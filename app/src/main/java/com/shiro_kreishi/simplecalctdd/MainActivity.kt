package com.shiro_kreishi.simplecalctdd

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var resultTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numberButtons = arrayOf(
            R.id.button_0, R.id.button_1,
            R.id.button_2, R.id.button_3,
            R.id.button_4, R.id.button_5,
            R.id.button_6, R.id.button_7,
            R.id.button_8, R.id.button_9
        )
        val solutionTextView = findViewById<TextView>(R.id.solution)
        resultTextView = findViewById<TextView>(R.id.result)
        val buttonClean = findViewById<Button>(R.id.button_c)
        buttonClean.setOnClickListener {
            solutionTextView.text = ""
            resultTextView.text = "0"
        }
        for (btnId in numberButtons) {
            setTextFromButton(findViewById(btnId), solutionTextView)
        }
        setTextFromButton(
            findViewById(R.id.button_open_bracket), solutionTextView
        )
        setTextFromButton(
            findViewById(R.id.button_close_bracket), solutionTextView
        )

        val btnAddState = UiState.MathOperator("+")
        val btnAdd = findViewById<Button>(R.id.button_addition)
        btnAdd.setOnClickListener {btnAddState.apply(solutionTextView, btnAdd) }

        val btnDivState = UiState.MathOperator("/")
        val btnDiv = findViewById<Button>(R.id.button_division)
        btnDiv.setOnClickListener { btnDivState.apply(solutionTextView, btnDiv) }

        val btnMultiState = UiState.MathOperator("*")
        val btnMulti = findViewById<Button>(R.id.button_multiply)
        btnMulti.setOnClickListener { btnMultiState.apply(solutionTextView, btnMulti) }

        val btnSubState = UiState.MathOperator("-")
        val btnSub = findViewById<Button>(R.id.button_subtraction)
        btnSub.setOnClickListener { btnSubState.apply(solutionTextView, btnSub) }

        val btnDotState = UiState.MathOperator(".")
        val btnDot = findViewById<Button>(R.id.button_dot)
        btnDot.setOnClickListener { btnDotState.apply(solutionTextView, btnDot) }

        val btnReverseState = UiState.MathSymbol("(-")
        val btnReverse = findViewById<Button>(R.id.button_reverse)
        btnReverse.setOnClickListener { btnReverseState.apply(solutionTextView, btnReverse) }

        val equalBtn = findViewById<Button>(R.id.button_equals)
        equalBtn.setOnClickListener {
            val text = if (solutionTextView.text.isEmpty()) "0"
            else solutionTextView.text.toString()
            val count = Count(text)
            try {
                resultTextView.text = count.equal().toString()
                solutionTextView.text = resultTextView.text
            }
            catch (e: Exception) {
                resultTextView.text = e.message
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun setTextFromButton(button: Button, textView: TextView) {
        button.setOnClickListener {
            textView.text =
                if (textView.text==resultTextView.text) "${button.text}"
                else "${textView.text}${button.text}"
        }
    }
}