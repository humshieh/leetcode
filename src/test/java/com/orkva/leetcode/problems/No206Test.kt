package com.orkva.leetcode.problems

import com.orkva.leetcode.common.ListNode
import org.junit.Test

class No206Test {

    @Test fun reverseList() {
        var listNode = buildConditions(1, 2, 3, 4, 5)
        print(No206().reverseList(listNode))
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
