package DSA_LeetCode;

import java.util.Arrays;

import org.junit.Test;

class MovingZeros {

	
	 public static void main(String[] args) {

		int[] nums = { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));

	}

	public static int[] moveZeroes(int[] nums) {

		int insertionPosition = 0;
//move all non zeros to left
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[insertionPosition] = nums[i];
				insertionPosition++;
			}
		}
//turn all remaining values to 0
		while (insertionPosition < nums.length) {
			nums[insertionPosition] = 0;
			insertionPosition++;
		}

		return nums;
	}
}
