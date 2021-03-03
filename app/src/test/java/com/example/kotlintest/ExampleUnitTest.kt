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
        val output = Service().solve(input)
        assertEquals(1, output)
    }

    @Test
    fun solve2() {
        val input = arrayOf(arrayOf(1,3,1),arrayOf(1,5,1),arrayOf(4,2,1))
        val output = Service().solve(input)
        assertEquals(7, output)
    }

    @Test
    fun solve3() {
        val input = arrayOf(arrayOf(1,2,3),arrayOf(4,5,6))
        val output = Service().solve(input)
        assertEquals(12, output)
    }

    @Test
    fun solve4() {
        val input = arrayOf(arrayOf(1,2),arrayOf(3,4),arrayOf(5,6))
        val output = Service().solve(input)
        assertEquals(13, output)
    }

    @Test
    fun solve5() {
        val input = arrayOf(arrayOf(0,0),arrayOf(0,0))
        val output = Service().solve(input)
        assertEquals(0, output)
    }

    @Test
    fun solve6() {
        val input = arrayOf(arrayOf(100,100),arrayOf(100,100))
        val output = Service().solve(input)
        assertEquals(200, output)
    }
}