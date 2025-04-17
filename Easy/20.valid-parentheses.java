package Easy;
/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

import java.util.Stack;

// @lc code=start
class Solution {
    /**
     * @param s string de corchetes dado
     * @return true si todo corchete abierto tiene su corchete cerrado, false si no
     *         es asi
     * @see https://leetcode.com/problems/valid-parentheses/description/
     */
    static public boolean isValid(String s) {

        Stack<String> stack = new Stack<>(); // creacion de un stack de datos

        String[] separated = s.split(""); // vuelve el string un array

        if (separated.length % 2 != 0) { // revisa que el largo del array entre 2 sea 0, si no lo es no puede estar bien
            return false;
        }

        for (int i = 0; i < separated.length; i++) { // recorre el array de corchetes
            if (separated[i].equals("(") || separated[i].equals("{") || separated[i].equals("[")) { // si es un corchete abierto

                stack.add(separated[i]); // lo añade al stack de datos
            }

            if (separated[i].equals(")") || separated[i].equals("}") || separated[i].equals("]")) { // si es un corchete cerrado

                if (stack.isEmpty()) // revisa si el stack está vacio, si lo está no puede estar bien
                    return false;

                String first = stack.pop(); // crea un string con el valor que estuviera de ultimo en el stak y saca ese valor del stack

                if ((separated[i].equals(")") && !first.equals("(")) || (separated[i].equals("}") && !first.equals("{"))
                        || (separated[i].equals("]") && !first.equals("["))) { // si no son el corchete correspondiente a cada uno no esta bien
                    return false;
                }
            }
        }
        return stack.isEmpty(); // si el stack quedo vacio está bien ya que se cerraron todos los corchetes, si no, esta mal
    }
}
// @lc code=end

