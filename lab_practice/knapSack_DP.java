// Knapsack Problem using Dynamic Programming
// Time Complexity: O(nW)
// Space Complexity: O(nW)

import java.util.*;

class Knapsack_DP {
    public static void main(String[] args) {
        int[] wt = { 10, 20, 30 };
        int[] val = { 100, 50, 150 };
        int W = 50;
        int n = wt.length;
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 0; i < n + 1; i++)
            Arrays.fill(dp[i], -1);
        System.out.println(knapSack(wt, val, W, n, dp));
    }

    public static int knapSack(int[] wt, int[] val, int W, int n, int[][] dp) {
        if (n == 0 || W == 0)
            return 0;
        if (dp[n][W] != -1)
            return dp[n][W];
        if (wt[n - 1] <= W)
            return dp[n][W] = Math.max(val[n - 1] + knapSack(wt, val, W - wt[n - 1], n - 1, dp),
                    knapSack(wt, val, W, n - 1, dp));
        else
            return dp[n][W] = knapSack(wt, val, W, n - 1, dp);
    }
}