package Easy;

/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    /**
     * @param nums arrays de 1 o 0 dado
     * @return la cantidad mayor de 1 consecutivos
     */
    public int findMaxConsecutiveOnes(int[] nums) {

        int temp = 0; // contador temporal
        int cont = 0; // contador final

        for (int i : nums) { // recorrer todos los numeros

            if (i == 1) { // si es 1
                temp++; // sumamos 1 al temporal
            }

            if (i == 0) { // si es 0

                if (temp > cont) { // comprueba si temp es mayor que cont
                    cont = temp; // si lo es, le da a cont el valor de temp
                }

                temp = 0; // reinicia el contador despues 
            }
        }

        // ultima comprovacion
        if (temp > cont) {
            cont = temp;
        }
        return cont; // devuelve el contador
    }
}
// @lc code=end
