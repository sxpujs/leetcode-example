package com.example;

/**
 * 打家劫舍
 */
public class L198Rob {

    public int rob(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                dp[0] = nums[0];
            } else if (i == 1) {
                dp[1] = Math.max(dp[0], nums[1]);
            } else {
                dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
            }
        }
        return dp[len - 1];
    }

    public static void main(String[] args) {
        L198Rob l198Rob = new L198Rob();
        System.out.println(l198Rob.rob(new int[]{1,2,3,1}));
    }
}
