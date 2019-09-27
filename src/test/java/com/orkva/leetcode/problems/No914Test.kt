package com.orkva.leetcode.problems

import org.junit.Assert
import org.junit.Test

class No914Test {

    @Test fun hasGroupsSizeX() {
        val conditions = listOf(
                Pair(intArrayOf(1,2,3,4,4,3,2,1), true),
                Pair(intArrayOf(1,1,1,2,2,2,3,3), false),
                Pair(intArrayOf(1), false),
                Pair(intArrayOf(1,1), true),
                Pair(intArrayOf(1,1,2,2,2,2), true),
                Pair(intArrayOf(0,0,0,1,1,1,2,2,2), true),
                Pair(intArrayOf(0,0,0,0,0,0,1,1,1,2,2), false)
        )
        val instance = No914()
        conditions.forEach { Assert.assertEquals(instance.hasGroupsSizeX(it.first), it.second) }
    }

}