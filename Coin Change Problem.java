public class CoinChangeWays {
    public static int numberOfWays(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        
        // Base case: There is 1 way to make an amount of 0 (by choosing no coins)
        dp[0] = 1;

        // Loop through each coin type
        for (int coin : coins) {
            // Update the dp array for all values higher than or equal to the coin value
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;
        System.out.println("Total ways to make change: " + numberOfWays(coins, amount));
        // Output: 4 (Ways: 5, 2+2+1, 2+1+1+1, 1+1+1+1+1)
    }
}
