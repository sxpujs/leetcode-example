package com.example;

import java.util.Random;

/**
 * 快速排序的主要思想是通过划分将待排序的序列分成前后两部分，其中前一部分的数据都比后一部分的数据要小，
 * 然后再递归调用函数对两部分的序列分别进行快速排序，以此使整个序列达到有序。
 * 作者：力扣官方题解
 * 链接：https://leetcode.cn/problems/sort-an-array/solutions/178305/pai-xu-shu-zu-by-leetcode-solution/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class L912QuickSort {

    public int[] sortArray(int[] nums) {
        sortArray(nums, 0, nums.length - 1);
        return nums;
    }

    public void sortArray(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivotIndex = partition(nums, left, right);
        sortArray(nums, left, pivotIndex - 1);
        sortArray(nums, pivotIndex+1, right);
    }

    /**
     * 那么核心就是划分函数的实现了，划分函数一开始需要确定一个分界值（我们称之为主元 pivot)，
     * 然后再进行划分。而主元的选取有很多种方式，这里我们采用随机的方式，
     * 对当前划分区间 [l,r] 里的数等概率随机一个作为我们的主元，再将主元放到区间末尾，进行划分。
     */
    public int partition(int[]nums, int left, int right) {
        int i = left - 1;
        Random random = new Random();
        int pivotIndex = random.nextInt(right - left + 1) + left;
        swap(nums, pivotIndex, right);
        int pivot = nums[right];
        for (int j = left; j < right; j++) {
            if (nums[j] <= pivot) {
                i = i+1;
                if (i != j) {
                    swap(nums, i, j);
                }

            }
        }
        swap(nums, i+1, right);
        return i+1;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
