package Easy;
/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {

    /**
     * @param prices array con los precios dado
     * @return cual sería la ganacia si compramos el dia mas barato y vendemos el mas caro
     */
    static public int maxProfit(int[] prices) {

        int lower = prices[0];
        int max = 0;
        int temp = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lower) {
                lower = prices[i];
                temp = i;
            }
        }

        for(int h = temp; h < prices.length; h++) {
            if (prices[h] > max) {
                max = prices[h];
            }
        } 

        return max - lower;
    }
}
// @lc code=end

