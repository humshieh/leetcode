package com.orkva.leetcode.problems;

/**
 * 430. Flatten a Multilevel Doubly Linked List
 *
 * @date 2019/09/26 10:08
 * @version Medium
 */
public class No430 {

    /**
     * You are given a doubly linked list which in addition to the next and previous pointers, it could have a child pointer, which may or may not point to a separate doubly linked list. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure, as shown in the example below.
     *
     * Flatten the list so that all the nodes appear in a single-level, doubly linked list. You are given the head of the first level of the list.
     *
     * Example:
     *
     * Input:
     *  1---2---3---4---5---6--NULL
     *          |
     *          7---8---9---10--NULL
     *              |
     *              11--12--NULL
     *
     * Output:
     * 1-2-3-7-8-11-12-9-10-4-5-6-NULL
     */
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        Node curr = head;
        while (curr != null) {
            if (curr.child != null) {
                Node child = curr.child;
                curr.child = null;
                Node last = child;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = curr.next;
                curr.next = child;
                child.prev = curr;
                if (last.next != null) {
                    last.next.prev = last;
                }
            }
            curr = curr.next;
        }
        return head;
    }

    public static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node() {}

        public Node(int val, Node prev, Node next, Node child) {
            this.val = val;
            this.prev = prev;
            this.next = next;
            this.child = child;
        }
    }

}
