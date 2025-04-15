package Easy;

/**
 * 374. Guess Number Higher or Lower
 * Solved
 * Easy
 * Topics
 * Companies
 * We are playing the Guess Game. The game is as follows:
 * 
 * I pick a number from 1 to n. You have to guess which number I picked.
 * 
 * Every time you guess wrong, I will tell you whether the number I picked is
 * higher or lower than your guess.
 * 
 * You call a pre-defined API int guess(int num), which returns three possible
 * results:
 * 
 * -1: Your guess is higher than the number I picked (i.e. num > pick).
 * 1: Your guess is lower than the number I picked (i.e. num < pick).
 * 0: your guess is equal to the number I picked (i.e. num == pick).
 * Return the number that I picked.
 */
public class problem374 {

    static int pick = 42;

    /**
     * @param num numero dado para comprobar
     * @return 0 si es igual, -1 si es mayor y 1 si es menor
     */
    static int guess(int num) {
        if (num == pick)
            return 0;
        if (num > pick)
            return -1;
        return 1;
    }

    /**
     * @param n numero a intentar encontrar
     * @return devuelve el numero usando busqueda binaria, -1 si no lo adivina
     */
    public int guessNumber(int n) {

        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2; // mejor forma de llegar al medio

            int target = guess(mid);

            if (target == 0) {
                return mid;
            } else if (target == 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;

    }
}
