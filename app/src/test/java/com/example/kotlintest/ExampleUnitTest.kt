package com.example.kotlintest

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun solve1() {
        val input = arrayOf(arrayOf(1))
        val output = Service.solve(input)
        assertEquals(1, output)
    }
}