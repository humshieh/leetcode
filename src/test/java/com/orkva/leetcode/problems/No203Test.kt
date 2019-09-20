package com.orkva.leetcode.problems

import org.junit.Test

class No203Test {

    @Test fun removeElements() {
        val conditions = listOf(
                buildConditions(1, 2, 3, 4, 5),
                buildConditions(1, 1, 3, 4, 5),
                buildConditions(1, 2, 1, 4, 5),
                buildConditions(1, 2, 3, 1, 5),
                buildConditions(1, 2, 3, 4, 1),
                buildConditions(2, 1, 1, 1, 2),
                buildConditions(1, 1, 1, 1, 1)
        )
        val instance = No203()
        for (condition in conditions) {
            instance.removeElements(condition, 1).also(::println)
        }

    }

    private fun buildConditions(vararg int: Int): ListNode {
        val root = ListNode(0)
        var node = root;
        for (i in int) {
            node = node.append(ListNode(i))
        }
        return root.next;
    }

}