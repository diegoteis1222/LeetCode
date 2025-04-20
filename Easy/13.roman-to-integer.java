package Easy;
/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

import java.util.HashMap;

// @lc code=start
class Solution {
    /**
     * 
     * @param s numeros romanos dados
     * @return el valor sumado de los numeros romanos
     */
    public int romanToInt(String s) {

        // Variables
        int total = 0;
        int previo = 0;
        int actual;

        // HashMpa para dar valores a las letras
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = s.length() - 1; i >= 0; i--) { // recorrer el numero romano

            actual = roman.get(s.charAt(i)); // actual se vuelve el valor de la letra en posicion i

            if (actual < previo) { // este if comprueba si debe restarse
                total -= actual; // si actual es menor que previo resta al total el actual
            } else {
                total += actual; // si no lo suma
            }
            previo = actual; // el previo pasa a ser el numero ya sumado o restado
        }
        return total;

    }
}
// @lc code=end
