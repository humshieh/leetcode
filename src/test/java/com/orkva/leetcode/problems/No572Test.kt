package com.orkva.leetcode.problems

import com.orkva.leetcode.ApplicationTest
import org.junit.Assert
import org.junit.Test

class No572Test {

    @Test fun isSubtree() {
        val conditions = listOf(
                Pair(ApplicationTest.buildBSTFromArray(listOf(3, 4, 5, 1, 2)), ApplicationTest.buildBSTFromArray(listOf(4, 1, 2)))
        )
        val instance = No572()
        conditions.forEach { Assert.assertTrue(instance.isSubtree(it.first, it.second)) }
    }

}