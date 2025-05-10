package com.example;

/**
 * 堆排序
 */
public class L912HeapSort {

    public int[] sortArray(int[] nums) {
        int n = nums.length;
        // 构建初始堆
        for (int i = n/2-1; i>=0;i--) {
            heapify(nums, n, i);
        }

        // 每次堆顶都与末尾元素交换，调整堆
        for (int i = n-1;i>0;i--) {
            swap(nums, i, 0);
            heapify(nums, i, 0);
        }
        return nums;
    }

    public void heapify(int[] nums, int heapSize, int root) {
        int largest = root;
        int left = root * 2 + 1;
        int right = root * 2 + 2;
        if(left<heapSize && nums[left] > nums[largest]) {
            largest = left;
        }
        if(right<heapSize && nums[right] > nums[largest]) {
            largest = right;
        }
        if (largest != root) {
            swap(nums, largest, root);
            heapify(nums, heapSize, largest);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }



}
