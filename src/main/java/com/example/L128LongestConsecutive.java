package com.example;

import java.util.HashSet;
import java.util.Set;

public class L128LongestConsecutive {

    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longestCount = 0;

        // 这里有一个细节点，要遍历已去重的numSet，不要遍历原始nums。
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentCount = 1;
                while(numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentCount++;
                }
                longestCount = Math.max(currentCount, longestCount);
            }
        }
        return longestCount;
    }

    public static void main(String[] args) {
        L128LongestConsecutive l128LongestConsecutive = new L128LongestConsecutive();
        int count = l128LongestConsecutive.longestConsecutive(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(count);
    }



}
