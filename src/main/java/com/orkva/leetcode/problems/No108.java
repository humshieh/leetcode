package com.orkva.leetcode.problems;

import com.orkva.leetcode.common.TreeNode;

/**
 * 108. Convert Sorted Array to Binary Search Tree
 *
 * @date 2019/09/24 11:20
 * @version Easy
 */
public class No108 {

    /**
     * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
     *
     * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
     *
     * Example:
     *
     * Given the sorted array: [-10,-3,0,5,9],
     *
     * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
     *
     *       0
     *      / \
     *    -3   9
     *    /   /
     *  -10  5
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return getSubTree(nums, new boolean[nums.length], 0, nums.length);
    }

    public TreeNode getSubTree(int[] nums, boolean[] bitmap, int low, int high) {
        int middle = low + (high - low) / 2;
        if (middle < 0 || middle >= nums.length || bitmap[middle] || low > high) {
            return null;
        }
        TreeNode root = new TreeNode(nums[middle]);
        bitmap[middle] = true;
        root.left = getSubTree(nums, bitmap, low, middle);
        root.right = getSubTree(nums, bitmap, middle, high);
        return root;
    }

}
