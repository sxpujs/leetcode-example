package com.example;

/**
 * 完全平方树
 */
public class L279NumSquares {

    public int numSquares(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2;i <= n; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 1; j*j <= i; j++) {
                minn = Math.min(minn, dp[i - j*j] + 1);
            }
            dp[i] = minn;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        L279NumSquares numSquares = new L279NumSquares();
        System.out.println(numSquares.numSquares(12));
    }
}
