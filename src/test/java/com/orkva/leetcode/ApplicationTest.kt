package com.orkva.leetcode

import com.orkva.leetcode.common.TreeNode
import org.junit.Test
import java.util.*

open class ApplicationTest {
    open lateinit var conditions: List<Pair<Any, Any>>

    companion object {

        fun buildBSTFromArray(arr: List<Int?>): TreeNode? {
            val source: Queue<Int?> = LinkedList(arr)
            val target: Queue<TreeNode> = LinkedList()
            val root = source.poll()?.let { TreeNode(it) }
            target.add(root)
            while (target.isNotEmpty() && source.isNotEmpty()) {
                val node = target.poll()
                source.poll()?.let {
                    val n = TreeNode(it);
                    target.add(n);
                    node.left = n
                }
                source.poll()?.let {
                    val n = TreeNode(it);
                    target.add(n);
                    node.right = n
                }
            }
            return root
        }

    }

    @Test fun test() {
        val source = ('0'..'9') + ('a'..'z') + ('A'..'Z')

    }
}