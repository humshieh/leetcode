package com.orkva.leetcode.problems

import com.orkva.leetcode.common.Node
import org.junit.Test

class No429Test {

    @Test fun levelOrder() {
        val root = Node(1, listOf(
                Node(2, listOf(
                        Node(5, null),
                        Node(6, null)
                )),
                Node(3, listOf()),
                Node(4, listOf())
        ))
        val instance = No429()
        instance.levelOrder(root).also(::println)
    }

}