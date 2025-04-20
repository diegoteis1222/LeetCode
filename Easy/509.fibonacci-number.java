package Easy;
/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {

    /**
     * @param n numeros de fibonacci a calcular
     * @return el numero de fibonacci hasta el numero dado
     */
    public int fib(int n) {

        int number1 = 0;
        int number2 = 1;
        //Variables necesarias

        for (int i = 0; i < n; i++) { // bucle por la cantidad de veces del numero dado

            int temp = number2; // guardamos el valor en number2 temporalmente
            number1 += number2; // sumamos number1 con number2
            number2 = number1; // guardamos el valor de number1 en number2
            number1 = temp; // guardamos el valor temporal en el numero 1
        }

        return number1;
    }
}
// @lc code=end
