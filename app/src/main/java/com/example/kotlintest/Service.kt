package com.example.kotlintest

import kotlin.math.min

class Service {
    fun solve(input: Array<Array<Int>>): Int {
        if (input.isEmpty()) {
            return 0;
        }
        if (input.first().isEmpty()) {
            return 0;
        }
        return solve(input, 0, 0);
    }

    private fun solve(input: Array<Array<Int>>, i: Int, j: Int): Int {
        if (i + 1 < input.size && j + 1 < input[0].size) {
            val result1 = solve(input, i + 1, j)
            val result2 = solve(input, i, j + 1)
            return input[i][j] + min(result1, result2)
        }
        if (i + 1 < input.size) {
            return input[i][j] + solve(input, i + 1, j)
        }
        if (j + 1 < input[0].size) {
            return input[i][j] + solve(input, i, j + 1)
        }
        return input[i][j];
    }
}