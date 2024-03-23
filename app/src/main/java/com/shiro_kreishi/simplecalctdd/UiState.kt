package com.shiro_kreishi.simplecalctdd

import android.widget.Button
import android.widget.TextView
import java.io.Serializable

interface UiState: Serializable {
    fun apply(textView: TextView, button: Button)

    data class MathOperator(private val text: String): UiState {
        private fun removeLastSubstring(originalString: String, substring: String): String {
            if (originalString.endsWith(substring)) {
                val lastIndex = originalString.lastIndexOf(substring)
                return originalString.substring(0, lastIndex)
            }
            return originalString+substring
        }
        override fun apply(textView: TextView, button: Button) {
            textView.text = removeLastSubstring(textView.text.toString(), text)
        }
    }

    data class MathSymbol(private val text: String): UiState {
        override fun apply(textView: TextView, button: Button) {
            TODO("Not yet implemented")
        }
    }
}