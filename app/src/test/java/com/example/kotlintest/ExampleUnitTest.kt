package com.example.kotlintest

import org.junit.Test

import org.junit.Assert.*
import java.lang.Exception

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun minimumPathSum_arrayWithEmptyArray() {
        val input = arrayOf(arrayOf<Int>())
        val output = Service().solve(input)
        assertEquals(0, output)
    }
    @Test
    fun minimumPathSum_emptyArray() {
        val input = arrayOf<Array<Int>>()
        val output = Service().solve(input)
        assertEquals(0, output)
    }

    @Test
    fun minimumPathSum_singleElement() {
        val input = arrayOf(arrayOf(1))
        val output = Service().solve(input)
        assertEquals(1, output)
    }

    @Test
    fun minimumPathSum_severalElementsSquare() {
        val input = arrayOf(arrayOf(1,3,1),arrayOf(1,5,1),arrayOf(4,2,1))
        val output = Service().solve(input)
        assertEquals(7, output)
    }

    @Test
    fun minimumPathSum_severalElementsRectangleHorizontal() {
        val input = arrayOf(arrayOf(1,2,3),arrayOf(4,5,6))
        val output = Service().solve(input)
        assertEquals(12, output)
    }

    @Test
    fun minimumPathSum_severalElementsRectangleVertical() {
        val input = arrayOf(arrayOf(1,2),arrayOf(3,4),arrayOf(5,6))
        val output = Service().solve(input)
        assertEquals(13, output)
    }

    @Test
    fun minimumPathSum_minElements() {
        val input = arrayOf(arrayOf(0,0),arrayOf(0,0))
        val output = Service().solve(input)
        assertEquals(0, output)
    }

    @Test
    fun minimumPathSum_maxElements() {
        val input = arrayOf(arrayOf(100,100),arrayOf(100,100))
        val output = Service().solve(input)
        assertEquals(300, output)
    }
}