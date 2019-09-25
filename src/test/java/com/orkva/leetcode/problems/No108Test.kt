package com.orkva.leetcode.problems

import com.orkva.leetcode.ApplicationTest.Companion.buildBSTFromArray
import org.junit.Test

class No108Test {

    @Test fun sortedArrayToBST() {
        val conditions = buildBSTFromArray(listOf())
        val instance = No108()
        val bst = instance.sortedArrayToBST((0..14).toList().toIntArray())
        print(null)
    }

}