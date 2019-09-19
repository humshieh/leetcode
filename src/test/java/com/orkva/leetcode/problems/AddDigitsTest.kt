package com.orkva.leetcode.problems

import org.junit.Test
import org.junit.Assert.*

class AddDigitsTest {

    @Test fun addDigits() {
        val conditions = listOf(
                Pair(38, 2)
        )
        val instance = AddDigits()
        for (condition in conditions) {
            assertEquals(condition.second, instance.addDigits(condition.first))
            assertEquals(condition.second, if (condition.first % 9 == 0) 9 else condition.first % 9)
        }
    }

}