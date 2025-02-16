package DSA_LeetCode2;

import java.util.Arrays;

public class SquareOfSortedArray_977 {
	
	public static void main(String[] args) {
		int[] nums= {-4,-1,0,3,10};
		int[] sortedSquares = sortedSquares(nums);
		System.out.println(Arrays.toString(sortedSquares));
	}
    public static int[] sortedSquares(int[] nums) {
        // Square each element
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // Two-pointer approach to sort the squared values
        int start = 0;
        int end = nums.length - 1;
        int[] res = new int[nums.length];
        
        for (int pos = nums.length - 1; pos >= 0; pos--) {
            if (nums[start] > nums[end]) {
                res[pos] = nums[start];
                start++;
            } else {
                res[pos] = nums[end];
                end--;
            }
        }

        return res;
    }
}

class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int[] res = new int[nums.length];
        int pos = nums.length - 1;

        while (start <= end) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                res[pos] = nums[start] * nums[start];
                start++;
            } else {
                res[pos] = nums[end] * nums[end];
                end--;
            }
            pos--;
        }

        return res;
    }
}


//METHOD II
//class Solution {
//    public int[] sortedSquares(int[] nums) {
//        int start = 0;
//        int end = nums.length - 1;
//        int[] res = new int[nums.length];
//        int pos = nums.length - 1;
//
//        while (start <= end) {
//            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
//                res[pos] = nums[start] * nums[start];
//                start++;
//            } else {
//                res[pos] = nums[end] * nums[end];
//                end--;
//            }
//            pos--;
//        }
//
//        return res;
//    }
//}
