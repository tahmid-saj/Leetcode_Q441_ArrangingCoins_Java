class Solution {
    public int arrangeCoins(int n) {
        int coins = n, rows = 1;

        while (coins >= rows) {
            coins -= rows;
            rows++;
        }

        return rows - 1;
    }
}
