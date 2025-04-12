package Easy;

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class problem9 {

    /**
     * @param x el numero dado
     * @return true si es palindromo, false si no lo es
     * @see https://leetcode.com/problems/palindrome-number/description/
     */
    public boolean isPalindrome(int x) {

        StringBuilder num = new StringBuilder(String.valueOf(x));
        String reversed = num.reverse().toString();
        return String.valueOf(x).equals(reversed);

    }
}
