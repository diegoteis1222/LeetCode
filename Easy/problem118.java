package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it as shown:
 */
public class problem118 {

    /**
     * @param numRows Cantidad de lineas que debe tener el triangulo
     * @return un triangulo de pascal
     * @see https://leetcode.com/problems/pascals-triangle/description/
     */
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> motherList = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> Son = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    Son.add(1);
                } else {

                    List<Integer> filaAnterior = motherList.get(i - 1);

                    int izq = filaAnterior.get(j - 1);

                    int der = filaAnterior.get(j);

                    Son.add(izq + der);
                }
            }

            motherList.add(Son);
        }

        return motherList;
    }
}
