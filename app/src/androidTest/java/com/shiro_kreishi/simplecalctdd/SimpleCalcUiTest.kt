package com.shiro_kreishi.simplecalctdd

import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.PositionAssertions
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withParent
import org.hamcrest.Matchers.allOf
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class SimpleCalcUiTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test_1_does_not_exist_example_text() {
        onView(withText("Hello World!")).check(doesNotExist())
    }

    @Test
    fun test_2_calc_ui_checking_buttons() {
        onView(
            allOf(
                isAssignableFrom(TextView::class.java),
                withId(R.id.result),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.rootLayout)),
            )
        ).check(matches(isDisplayed()))

        onView(
            allOf(
                isAssignableFrom(TextView::class.java),
                withId(R.id.solution),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.rootLayout)),
            )
        ).check(matches(isDisplayed()))

        onView(
            allOf(
                isAssignableFrom(TextView::class.java),
                withId(R.id.result),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.rootLayout)),
            )
        ).check(matches(isDisplayed()))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_c),
                withText("C"),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_1)),
            )
        ).check(matches(isDisplayed()))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_open_bracket),
                withText("("),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_1)),
            )
        ).check(PositionAssertions.isCompletelyRightOf(withId(R.id.button_c)))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_close_bracket),
                withText(")"),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_1)),
            )
        ).check(PositionAssertions.isCompletelyRightOf(withId(R.id.button_open_bracket)))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_division),
                withText("/"),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_1)),
            )
        ).check(PositionAssertions.isCompletelyRightOf(withId(R.id.button_close_bracket)))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_7),
                withText("7"),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_2)),
            )
        ).check(matches(isDisplayed()))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_8),
                withText("8"),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_2)),
            )
        ).check(PositionAssertions.isCompletelyRightOf(withId(R.id.button_7)))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_9),
                withText("9"),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_2)),
            )
        ).check(PositionAssertions.isCompletelyRightOf(withId(R.id.button_8)))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_multiply),
                withText("*"),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_2)),
            )
        ).check(PositionAssertions.isCompletelyRightOf(withId(R.id.button_9)))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_4),
                withText("4"),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_3)),
            )
        ).check(matches(isDisplayed()))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_5),
                withText("5"),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_3)),
            )
        ).check(PositionAssertions.isCompletelyRightOf(withId(R.id.button_4)))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_6),
                withText("6"),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_3)),
            )
        ).check(PositionAssertions.isCompletelyRightOf(withId(R.id.button_5)))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_addition),
                withText("+"),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_3)),
            )
        ).check(PositionAssertions.isCompletelyRightOf(withId(R.id.button_6)))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_1),
                withText("1"),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_4)),
            )
        ).check(matches(isDisplayed()))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_2),
                withText("2"),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_4)),
            )
        ).check(PositionAssertions.isCompletelyRightOf(withId(R.id.button_1)))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_3),
                withText("3"),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_4)),
            )
        ).check(PositionAssertions.isCompletelyRightOf(withId(R.id.button_2)))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_subtraction),
                withText("-"),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_4)),
            )
        ).check(PositionAssertions.isCompletelyRightOf(withId(R.id.button_3)))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_reverse),
                withText("+-"),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_5)),
            )
        ).check(matches(isDisplayed()))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_0),
                withText("0"),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_5)),
            )
        ).check(PositionAssertions.isCompletelyRightOf(withId(R.id.button_reverse)))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_dot),
                withText("."),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_5)),
            )
        ).check(PositionAssertions.isCompletelyRightOf(withId(R.id.button_0)))

        onView(
            allOf(
                isAssignableFrom(Button::class.java),
                withId(R.id.button_equals),
                withText("="),
                withParent(isAssignableFrom(LinearLayout::class.java)),
                withParent(withId(R.id.buttons_line_5)),
            )
        ).check(PositionAssertions.isCompletelyRightOf(withId(R.id.button_dot)))
    }

    private fun clean_solution() {
        onView(withId(R.id.button_c)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText("")))
    }

    @Test
    fun test_3_clean_solution() {
        clean_solution()
    }

    @Test
    fun test_4_calc_checking_buttons_number_handler() {
        val numberButtons = arrayOf(
            R.id.button_0, R.id.button_1,
            R.id.button_2, R.id.button_3,
            R.id.button_4, R.id.button_5,
            R.id.button_6, R.id.button_7,
            R.id.button_8, R.id.button_9
        )
        clean_solution()
        for (i in numberButtons.indices) {
            onView(withId(numberButtons[i])).perform(click())
            onView(withId(R.id.solution)).check(matches(withText(i.toString())))
            clean_solution()
        }
    }

    @Test
    fun test_5_calc_checking_buttons_operation_handler() {
        clean_solution()
        onView(withId(R.id.button_open_bracket)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText("(")))
        onView(withId(R.id.button_open_bracket)).perform(click())
        onView(withId(R.id.button_open_bracket)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText("(((")))
        clean_solution()

        onView(withId(R.id.button_close_bracket)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText(")")))
        onView(withId(R.id.button_close_bracket)).perform(click())
        onView(withId(R.id.button_close_bracket)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText(")))")))
        clean_solution()

        onView(withId(R.id.button_division)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText("0/")))
        onView(withId(R.id.button_division)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText("0")))
        clean_solution()

        onView(withId(R.id.button_multiply)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText("0*")))
        onView(withId(R.id.button_multiply)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText("0")))
        clean_solution()

        onView(withId(R.id.button_addition)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText("0+")))
        onView(withId(R.id.button_addition)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText("0")))
        clean_solution()

        onView(withId(R.id.button_subtraction)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText("0-")))
        onView(withId(R.id.button_subtraction)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText("0")))
        clean_solution()

        onView(withId(R.id.button_1)).perform(click())
        onView(withId(R.id.button_equals)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText("1.0")))
        clean_solution()
    }

    @Test
    fun test_6_calc_checking_buttons_math_symbols_handler() {
        onView(withId(R.id.button_dot)).perform(click())
        onView(withId(R.id.button_dot)).perform(click())
        onView(withId(R.id.button_dot)).perform(click())
        onView(withId(R.id.button_1)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText("0.1")))
        clean_solution()

        onView(withId(R.id.button_reverse)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText("(-")))
        onView(withId(R.id.button_reverse)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText("")))
        clean_solution()
    }

    @Test
    fun test_7_calculation_check() {
        clean_solution()
        onView(withId(R.id.button_1)).perform(click())
        onView(withId(R.id.button_addition)).perform(click())
        onView(withId(R.id.button_1)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText("1+1")))
        onView(withId(R.id.button_equals)).perform(click())
        onView(withId(R.id.result)).check(matches(withText("2.0")))

        clean_solution()
        onView(withId(R.id.button_2)).perform(click())
        onView(withId(R.id.button_addition)).perform(click())
        onView(withId(R.id.button_2)).perform(click())
        onView(withId(R.id.button_multiply)).perform(click())
        onView(withId(R.id.button_2)).perform(click())
        onView(withId(R.id.solution)).check(matches(withText("2+2*2")))
        onView(withId(R.id.button_equals)).perform(click())
        onView(withId(R.id.result)).check(matches(withText("6.0")))
    }
}
