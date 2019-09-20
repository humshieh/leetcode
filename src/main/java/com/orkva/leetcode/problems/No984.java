package com.orkva.leetcode.problems;

/**
 * 984. String Without AAA or BBB
 *
 * @date 2019/09/19 18:34
 * @version Medium
 */
public class No984 {

    /**
     * Given two integers A and B, return any string S such that:
     *
     *   - S has length A + B and contains exactly A 'a' letters, and exactly B 'b' letters;
     *   - The substring 'aaa' does not occur in S;
     *   - The substring 'bbb' does not occur in S.
     *
     *
     * Example 1:
     *
     *   Input: A = 1, B = 2
     *   Output: "abb"
     *   Explanation: "abb", "bab" and "bba" are all correct answers.
     *
     * Example 2:
     *
     *   Input: A = 4, B = 1
     *   Output: "aabaa"
     *
     *
     * Note:
     *
     *   1. 0 <= A <= 100
     *   2. 0 <= B <= 100
     *   3. It is guaranteed such an S exists for the given A and B.
     */
    public String strWithout3a3b(int A, int B) {
        // TODO: 2019/9/20 11:13 Use Solution
        StringBuilder ans = new StringBuilder();

        while (A > 0 || B > 0) {
            boolean writeA = false;
            int L = ans.length();
            if (L >= 2 && ans.charAt(L-1) == ans.charAt(L-2)) {
                if (ans.charAt(L-1) == 'b') {
                    writeA = true;
                }
            } else {
                if (A >= B) {
                    writeA = true;
                }
            }

            if (writeA) {
                A--;
                ans.append('a');
            } else {
                B--;
                ans.append('b');
            }
        }

        return ans.toString();
    }

}
