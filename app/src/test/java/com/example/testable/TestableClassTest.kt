package com.example.testable

import org.junit.Assert
import org.junit.Test


class TestableClassTest{

    @Test
    fun when_invoke_greetings_return_hello_world(){
        val testableClass = TestableClass()
        Assert.assertEquals("Hello World!", testableClass.greeting())
    }
}