package com.example.testable

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions

import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.junit.Rule
import org.junit.Test


class MainActivityTest {

    @Rule
    fun activityRule() = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun when_launch_shows_hello_world(){
        Espresso.onView(ViewMatchers.withId(R.id.helloWorldItem))
            .check(ViewAssertions.matches(ViewMatchers.withText("Hello World!")))
    }
    
    @Test
    fun when_press_button_title_changes_to_hello_user(){
        Espresso.onView(ViewMatchers.withId(R.id.button))
            .perform(ViewActions.click())

        GlobalScope.launch (Dispatchers.Main) {
            delay(2100)
            Espresso.onView(ViewMatchers.withId(R.id.helloWorldItem))
                .check(ViewAssertions.matches(ViewMatchers.withText("Hello User!")))
        }
    }
}