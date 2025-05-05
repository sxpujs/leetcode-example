package com.example;

/**
 * 爬楼梯
 */
public class L70ClimeStairs {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        L70ClimeStairs climeStairs = new L70ClimeStairs();
        System.out.println(climeStairs.climbStairs(45));
    }
}
