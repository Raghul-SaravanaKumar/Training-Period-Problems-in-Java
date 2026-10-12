public class MinCostClimbingStairs {
    public static int minCost(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];

        // Base cases: starting at step 0 or 1 costs nothing initially
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            // Min cost to reach current step comes from taking a step from i-1 or i-2
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println("Minimum cost: " + minCost(cost));
        // Output: 15 (Start at index 1, pay 15, step two steps to the top)
    }
}
