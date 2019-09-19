package com.orkva.leetcode.problems;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 429. N-ary Tree Level Order Traversal
 *
 * @date 2019/09/19 14:59
 * @version Easy
 */
public class NAryTreeLevelOrderTraversal {

    /**
     * Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
     *
     * For example, given a 3-ary tree:
     *
     *         1
     *      *  *  *
     *     3   2   4
     *    * *
     *   5   6
     *
     * We should return its level order traversal:
     *
     * [
     *      [1],
     *      [3,2,4],
     *      [5,6]
     * ]
     *
     *
     * Note:
     *
     *   1. The depth of the tree is at most 1000.
     *   2. The total number of nodes is at most 5000.
     */
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<Node> deque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            List<Integer> r = new ArrayList<>();
            Deque<Node> n = new LinkedList<>();
            while (!deque.isEmpty()) {
                Node node = deque.poll();
                r.add(node.val);
                if (node.children != null && !node.children.isEmpty()) {
                    n.addAll(node.children);
                }
            }
            result.add(r);
            deque = n;
        }
        return result;
    }

}
@SuppressWarnings("all")
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}