public class FibonacciDP {
    public static int getFibonacci(int n) {
        if (n <= 1) return n;
        
        // Create an array to store calculated values
        int[] dp = new int[n + 1];
        
        // Base cases
        dp[0] = 0;
        dp[1] = 1;
        
        // Fill the table iteratively
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci of " + n + " is: " + getFibonacci(n)); 
        // Output: 8
    }
}
