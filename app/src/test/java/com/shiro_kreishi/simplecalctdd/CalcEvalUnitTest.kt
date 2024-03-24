package com.shiro_kreishi.simplecalctdd

import org.junit.Test
import org.junit.Assert.*

class CalcEvalUnitTest {
    @Test
    fun test1_addition() {
        val expression = "2+2"
        val count = Count(expression)
        val expected = (4).toDouble()
        val actual = count.equal()
        assertEquals(expected, actual, 0.00001)
    }

    @Test
    fun test2_subtraction() {
        val expression = "7-2"
        val count = Count(expression)
        val expected = (5).toDouble()
        val actual = count.equal()
        assertEquals(expected, actual, 0.00001)
    }

    @Test
    fun test3_multiply() {
        val expression = "2*8"
        val count = Count(expression)
        val expected = (16).toDouble()
        val actual = count.equal()
        assertEquals(expected, actual, 0.00001)
    }

    @Test
    fun test4_division() {
        val expression = "100/4"
        val count = Count(expression)
        val expected = (25).toDouble()
        val actual = count.equal()
        assertEquals(expected, actual, 0.00001)
    }

    @Test
    fun test5_mathematical_expression() {
        val expression = "2+2*2"
        val count = Count(expression)
        val expected = (6).toDouble()
        val actual = count.equal()
        assertEquals(expected, actual, 0.00001)
    }
    @Test
    fun test6_mathematical_expression() {
        val expression = "(2+2)*2"
        val count = Count(expression)
        val expected = (8).toDouble()
        val actual = count.equal()
        assertEquals(expected, actual, 0.00001)
    }
    @Test
    fun test7_mathematical_expression() {
        val expression = "((4-7)*13)+((49/7)*3)"
        val count = Count(expression)
        val expected = (-18).toDouble()
        val actual = count.equal()
        assertEquals(expected, actual, 0.00001)
    }
    @Test
    fun test8_mathematical_expression() {
        val expression = "((2+(10/5*2)+(1024/16)-1))-5"
        val count = Count(expression)
        val expected = (64).toDouble()
        val actual = count.equal()
        assertEquals(expected, actual, 0.00001)
    }
}