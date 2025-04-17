package Easy;
/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * @param numRows Cantidad de lineas que debe tener el triangulo
     * @return un triangulo de pascal
     */
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> motherList = new ArrayList<>(); // crea la lista madre

        for (int i = 0; i < numRows; i++) { // se ejecuta tantas veces como el numero que le pasamos

            List<Integer> Son = new ArrayList<>(); // crea una lista hijo

            for (int j = 0; j <= i; j++) { // recorre la i

                if (j == 0 || j == i) { // si j es 0 o es igual a i, es uno de los vordes por lo que pone un 1
                    Son.add(1);
                } else {

                    List<Integer> filaAnterior = motherList.get(i - 1); // crea una lista con el valor del anterior bucle

                    int izq = filaAnterior.get(j - 1); // recoje el numero que hay en la fila anterior en un numero anterior a j actualmente

                    int der = filaAnterior.get(j); // recoje el numero de la fila anterior en j

                    Son.add(izq + der); // añade a la fila hijo la suma de las filas anteriores
                }
            }

            motherList.add(Son); // añade la lista hija a la madre
        }

        return motherList;
    }
}
// @lc code=end

