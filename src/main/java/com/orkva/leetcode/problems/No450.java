package com.orkva.leetcode.problems;

import com.orkva.leetcode.common.TreeNode;

/**
 * 450. Delete Node in a BST
 *
 * @date 2019/09/23 10:49
 * @version Medium
 */
public class No450 {

    /**
     * Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.
     *
     * Basically, the deletion can be divided into two stages:
     *
     *   1. Search for a node to remove.
     *   2. If the node is found, delete the node.
     *
     * Note: Time complexity should be O(height of tree).
     *
     * Example:
     *
     * root = [5,3,6,2,4,null,7]
     * key = 3
     *
     *     5
     *    / \
     *   3   6
     *  / \   \
     * 2   4   7
     *
     * Given key to delete is 3. So we find the node with value 3 and delete it.
     *
     * One valid answer is [5,4,6,2,null,null,7], shown in the following BST.
     *
     *     5
     *    / \
     *   4   6
     *  /     \
     * 2       7
     *
     * Another valid answer is [5,2,6,null,4,null,7].
     *
     *     5
     *    / \
     *   2   6
     *    \   \
     *     4   7
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        // TODO: 2019/9/23 17:01 未解 
        TreeNode parent = null;
        TreeNode target = root;
        while (target != null && target.val != key) {
            parent = target;
            if (target.val > key) {
                target = target.left;
            } else {
                target = target.right;
            }
        }

        if (target == null) {
            return root;
        }

        if (target.left == null && target.right == null) {
            if (parent == null) {
                return null;
            }
            if (parent.left == target) {
                parent.left = null;
            } else {
                parent.right = null;
            }
            return root;
        }

        TreeNode replay = null;
        if (target.left != null) {
            TreeNode prev = target;
            replay = target.left;
            while (replay.right != null) {
                prev = replay;
                replay = replay.right;
            }
            if (prev == target) {
                prev.left = replay.left;
            } else {
                prev.right = null;
            }
        } else {
            TreeNode prev = target;
            replay = target.right;
            while (replay.left != null) {
                prev = replay;
                replay = replay.left;
            }
            if (prev == target) {
                prev.right = replay.right;
            } else {
                prev.left = null;
            }
        }

        replay.left = target.left;
        replay.right = target.right;

        if (parent != null) {
            if (parent.left == target) {
                parent.left = replay;
            } else {
                parent.right = replay;
            }
        }

        return target == root ? replay : root;
    }

    /**
     * 二叉查找树节点删除
     * 1. 查询出要删除的节点及其父节点
     * 2. 判断目标节点后代状况
     *   1. 没有后代，直接删除
     *   2. 有单侧后代，替换长子
     *   3. 有双侧后代，查找直接前驱替换
     */

}
