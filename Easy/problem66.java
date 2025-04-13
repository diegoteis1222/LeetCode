package Easy;

/**
 * You are given a large integer represented as an integer array digits, where
 * each digits[i] is the ith digit of the integer. The digits are ordered from
 * most significant to least significant in left-to-right order. The large
 * integer does not contain any leading 0's.
 * 
 * Increment the large integer by one and return the resulting array of digits.
 */
public class problem66 {

    /**
     * @param digits array dado
     * @return el array pero sumandole 1
     * @see https://leetcode.com/problems/plus-one/description/
     */
    public static int[] plusOne(int[] digits) {

        long result = 0;

        for (int i = 0; i < digits.length; i++) {
            result = (result * 10) + digits[i];
            System.out.println(result);
        }
        result += 1;

        String stringDigits = Long.toString(result);
        int[] plusOne = new int[stringDigits.length()];

        for (int i = 0; i < stringDigits.length(); i++) {
            plusOne[i] = stringDigits.charAt(i) - '0';
        }

        return plusOne;
        //TODO esto no sirve con numeros gigantes desgraciadamente, hay que arreglarlo :(
        //TODO reacerlo con BigInteger
    }
    public static void main(String[] args) {
        int[] s = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(plusOne(s));
    }
}
