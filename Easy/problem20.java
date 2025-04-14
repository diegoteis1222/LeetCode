package Easy;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
public class problem20 {

    /**
     * @param s string de corchetes dado
     * @return true si todo corchete abierto tiene su corchete cerrado, false si no
     *         es asi
     * @see https://leetcode.com/problems/valid-parentheses/description/
     */
    static public boolean isValid(String s) {

        Stack<String> stack = new Stack<>();

        String[] separated = s.split("");

        if (separated.length % 2 != 0) {
            return false;
        }

        for (int i = 0; i < separated.length; i++) {
            if (separated[i].equals("(") || separated[i].equals("{") || separated[i].equals("[")) {

                stack.add(separated[i]);
            }

            if (separated[i].equals(")") || separated[i].equals("}") || separated[i].equals("]")) {

                if (stack.isEmpty())
                    return false;

                String first = stack.pop();

                if ((separated[i].equals(")") && !first.equals("(")) || (separated[i].equals("}") && !first.equals("{"))
                        || (separated[i].equals("]") && !first.equals("["))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
