package com.orkva.leetcode.problems

import org.junit.Assert.assertEquals
import org.junit.Test

class No917Test {

    @Test fun reverseOnlyLetters() {
        val conditions = listOf(
                Pair("ab-cd", "dc-ba"),
                Pair("a-bC-dEf-ghIj", "j-Ih-gfE-dCba"),
                Pair("Test1ng-Leet=code-Q!", "Qedo1ct-eeLg=ntse-T!")
        )
        val instance = No917()
        for (condition in conditions) {
            assertEquals(instance.reverseOnlyLetters(condition.first), condition.second)
        }
    }

}