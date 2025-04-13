package Easy;

import java.math.BigInteger;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 */
public class problem67 {
    /**
     * @param a numero en forma string 1
     * @param b numero en forma string 2
     * @return la suma de los dos numeros en binario
     * @see https://leetcode.com/problems/add-binary/description/
     */
    public static String addBinary(String a, String b) {
        /**
         * Primera vesion funcial pero solo 32 bits :(
         * Reecho con BigInteger para que sea aceptado
         * 
         * int first = Integer.parseInt(a, 2);
         * int second = Integer.parseInt(b, 2);
         * 
         * return Integer.toBinaryString(first + second);
         */

        BigInteger first = new BigInteger(a, 2);
        BigInteger second = new BigInteger(b, 2);

        BigInteger sum = first.add(second);

        return sum.toString(2);
    }
}
