package com.orkva.leetcode.problems;

/**
 * 258. Add Digits
 *
 * @date 2019/09/19 14:20
 * @version Easy
 */
public class AddDigits {

    /**
     * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     *
     * Example:
     *
     *   Input: 38
     *   Output: 2
     *   Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
     *                Since 2 has only one digit, return it.
     *
     * Follow up:
     * Could you do it without any loop/recursion in O(1) runtime?
     *
     * @see <a href="https://en.wikipedia.org/wiki/Digital_root" target="_blank">Wikipedia article</a>
     */
    public int addDigits(int num) {
        while (num >= 10) {
            int i = 0;
            while (num != 0) {
                i += num  % 10;
                num /= 10;
            }
            num = i;
        }
        return num;
    }

}
