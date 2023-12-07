// Longest Common Subsequence using Dynamic Programming
// Time Complexity: O(mn)
// Space Complexity: O(mn)

import java.util.*;

class LCS_DP {
    public static void main(String[] args) {
        String s1 = "abcdgh";
        String s2 = "abedfhr";
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        System.out.println(lcs(s1, s2, m, n, dp));
    }

    public static int lcs(String s1, String s2, int m, int n, int[][] dp) {
        if (m == 0 || n == 0)
            return 0;
        if (dp[m][n] != -1)
            return dp[m][n];
        if (s1.charAt(m - 1) == s2.charAt(n - 1))
            return dp[m][n] = 1 + lcs(s1, s2, m - 1, n - 1, dp);
        else
            return dp[m][n] = Math.max(lcs(s1, s2, m - 1, n, dp), lcs(s1, s2, m, n - 1, dp));
    }
}