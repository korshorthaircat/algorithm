package programmers.level2;

import java.util.Stack;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12909">올바른 괄호</a>
 */
public class Lesson12909 {
    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(chars[i]);
            }
            if (!stack.isEmpty() && chars[i] == ')') {
                stack.pop();
            }
            if (i == 0 && chars[i] == ')') {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
