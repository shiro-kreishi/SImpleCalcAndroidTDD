package com.shiro_kreishi.simplecalctdd

import com.notkamui.keval.Keval

class Count(private val expression: String) {
    fun equal(): String {
        var result = "0"
        result = try {
            Keval.eval(expression).toString()
        } catch (e: Exception) {
            "invalid expression"
        }

        return result
    }
}