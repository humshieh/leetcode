package com.orkva.leetcode.problems

import org.junit.Assert.assertFalse
import org.junit.Test

class No984Test {

    @Test fun strWithout3a3b() {
        val instance = No984()
        val regex = Regex("^.*(a{3,}|b{3,}).*$")
        assertFalse(regex.matches(instance.strWithout3a3b(1, 2)))
        assertFalse(regex.matches(instance.strWithout3a3b(4, 1)))
        assertFalse(regex.matches(instance.strWithout3a3b(9, 8)))
    }

}