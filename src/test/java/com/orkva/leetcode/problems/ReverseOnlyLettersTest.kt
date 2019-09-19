package com.orkva.leetcode.problems

import org.junit.Assert.assertEquals
import org.junit.Test

class ReverseOnlyLettersTest {

    @Test fun reverseOnlyLetters() {
        val conditions = listOf(
                Pair("ab-cd", "dc-ba"),
                Pair("a-bC-dEf-ghIj", "j-Ih-gfE-dCba"),
                Pair("Test1ng-Leet=code-Q!", "Qedo1ct-eeLg=ntse-T!")
        )
        val instance = ReverseOnlyLetters()
        for (condition in conditions) {
            assertEquals(instance.reverseOnlyLetters(condition.first), condition.second)
        }
    }

}