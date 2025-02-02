package com.orkva.leetcode.problems

import com.orkva.leetcode.ApplicationTest.Companion.buildBSTFromArray
import com.orkva.leetcode.common.TreeNode
import org.junit.Test
import java.util.*

class No450Test {

    @Test fun deleteNodeTest() {
        val root = buildBSTFromArray(listOf(8,0,31,null,6,28,45,1,7,25,30,32,49,null,4,null,null,9,26,29,null,null,42,47,null,2,5,null,12,null,27,null,null,41,43,46,48,null,3,null,null,10,19,null,null,33,null,null,44,null,null,null,null,null,null,null,11,18,20,null,37,null,null,null,null,14,null,null,22,36,38,13,15,21,24,34,null,null,39,null,null,null,16,null,null,23,null,null,35,null,40,null,17))
        val instance = No450()
        toString(instance.deleteNode(root, 1))
    }

    fun toString(node: TreeNode) {
        val queue: Queue<TreeNode> = LinkedList()
        queue.add(node)
        while (queue.isNotEmpty()) {
            val n = queue.poll()
            print("${n.`val`},")
            if (n.left != null) queue.add(n.left)
            if (n.right != null) queue.add(n.right)
        }
        println()
    }

}
