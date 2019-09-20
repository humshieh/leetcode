package com.orkva.leetcode.problems;

import java.util.Stack;

/**
 * 917. Reverse Only Letters
 *
 * @date 2019/09/19 16:54
 * @version Easy
 */
public class No917 {

    /**
     * Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.
     *
     *
     * Example 1:
     *
     *   Input: "ab-cd"
     *   Output: "dc-ba"
     *
     * Example 2:
     *
     *   Input: "a-bC-dEf-ghIj"
     *   Output: "j-Ih-gfE-dCba"
     *
     * Example 3:
     *
     *   Input: "Test1ng-Leet=code-Q!"
     *   Output: "Qedo1ct-eeLg=ntse-T!"
     *
     *
     * Note:
     *
     *   1. S.length <= 100
     *   2. 33 <= S[i].ASCIIcode <= 122
     *   3. S doesn't contain \ or "
     */
    public String reverseOnlyLetters(String S) {
        Stack<Character> letters = new Stack<>();
        for (char c: S.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.push(c);
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char c: S.toCharArray()) {
            if (Character.isLetter(c)) {
                ans.append(letters.pop());
            } else {
                ans.append(c);
            }
        }

        return ans.toString();
    }

    /*
     * 1. 创建栈
     * 2. 遍历字符串 将字母入栈
     * 3. 遍历字符串 为字母时出栈 符号时保持不变
     */

}
