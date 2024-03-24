package com.shiro_kreishi.simplecalctdd

import com.notkamui.keval.Keval

class Count(private val expression: String) {
    fun equal(): Double {
        var result = 0.0
        result = try {
            Keval.eval(expression)
        } catch (e: Exception) {
            throw Exception("invalid expression")
        }

        return result
    }
}