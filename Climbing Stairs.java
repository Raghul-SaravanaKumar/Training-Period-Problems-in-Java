public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int[] dp = new int[n + 1];
        
        // Base cases
        dp[1] = 1; // 1 way to climb 1 step
        dp[2] = 2; // 2 ways to climb 2 steps (1+1 or 2)

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int steps = 4;
        System.out.println("Ways to climb " + steps + " steps: " + climbStairs(steps));
        // Output: 5
    }
}
