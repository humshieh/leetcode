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
        TreeNode parent = null;
        TreeNode target = root;
        // 查找目标节点及其父节点
        while (target != null && target.val != key) {
            parent = target;
            if (target.val > key) {
                target = target.left;
            } else {
                target = target.right;
            }
        }

        // 判断是否存在目标节点
        if (target == null) {
            return root;
        }

        // 删除节点左右孩子状况
        // 无后代情况
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

        // 双侧后代情况
        if (target.left != null && target.right != null) {
            TreeNode pred = target.left;
            // 直接前驱长子情况
            if (pred.right == null) {
                pred.right = target.right;
                if (parent == null) {
                    return pred;
                }
                if (parent.left == target) {
                    parent.left = pred;
                } else {
                    parent.right = pred;
                }
                return root;
            }

            // 查找直接前驱及前驱父节点
            TreeNode prev = null;
            while (pred.right != null) {
                prev = pred;
                pred = pred.right;
            }
            // 替换节点
            prev.right = pred.left;
            pred.left = target.left;
            pred.right = target.right;
            // 连接到现在父节点
            if (parent == null) {
                return pred;
            }
            if (parent.left == target) {
                parent.left = pred;
            } else {
                parent.right = pred;
            }
            return root;
        }

        // 单侧后代情况
        if (target.left != null) {
            if (parent == null) {
                return target.left;
            }
            if (parent.left == target) {
                parent.left = target.left;
            } else {
                parent.right = target.left;
            }
        } else {
            if (parent == null) {
                return target.right;
            }
            if (parent.left == target) {
                parent.left = target.right;
            } else {
                parent.right = target.right;
            }
        }

        return root;
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
