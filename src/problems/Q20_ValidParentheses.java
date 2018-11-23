package problems;

import java.util.HashMap;
import java.util.Stack;

public class Q20_ValidParentheses {

    public static void main(String[] args) {
        String str = "{{[]()}}";
//        String str = "{{[](})}";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        HashMap<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (mapping.containsKey(c)) {
                char top = !stack.empty() ? stack.pop() : '?';
                if (top != mapping.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }

}
