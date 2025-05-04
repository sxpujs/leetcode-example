package com.example;

import java.util.Arrays;

/**
 * 作者：力扣官方题解
 * 链接：https://leetcode.cn/problems/two-sum/solutions/434597/liang-shu-zhi-he-by-leetcode-solution/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class L001TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        L001TwoSum l1TwoSum = new L001TwoSum();
        System.out.println(Arrays.toString(l1TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

}