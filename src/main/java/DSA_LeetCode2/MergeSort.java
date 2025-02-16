package DSA_LeetCode2;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {5, 3, 4, 2, 1};
        System.out.println("Original Array: " + Arrays.toString(nums));

        mergeSort(nums);

        System.out.println("Sorted Array: " + Arrays.toString(nums));
    }

    public static int[] mergeSort(int[] nums) {
        helper(nums, 0, nums.length - 1); // Initial recursive call
        return nums;
    }

    public static void helper(int[] nums, int low, int high) {
        // Base case: Stop recursion when the subarray has one or no elements
        if (low >= high) return;

        // Find the midpoint of the current subarray
        int mid = (low + high) / 2;

        // Recursively sort the left half
        helper(nums, low, mid);

        // Recursively sort the right half
        helper(nums, mid + 1, high);

        // Merge the two sorted halves
        merge(nums, low, mid, high);
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        // Create temporary arrays for the left and right subarrays
        int[] left = Arrays.copyOfRange(nums, low, mid + 1);
        int[] right = Arrays.copyOfRange(nums, mid + 1, high + 1);

        // Initialize pointers for left, right, and the main array
        int p1 = 0, p2 = 0, index = low+
        // Merge elements from left and right arrays back into the main array
        while (p1 < left.length && p2 < right.length) {
            if (left[p1] <= right[p2]) {
                nums[index++] = left[p1++];
            } else {
                nums[index++] = right[p2++];
            }
        }

        // Copy any remaining elements from the left array
        while (p1 < left.length) {
            nums[index++] = left[p1++];
        }

        // Copy any remaining elements from the right array
        while (p2 < right.length) {
            nums[index++] = right[p2++];
        }
    }
}
