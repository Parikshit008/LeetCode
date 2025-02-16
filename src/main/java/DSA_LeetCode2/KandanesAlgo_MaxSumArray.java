package DSA_LeetCode2;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class KandanesAlgo_MaxSumArray {

	public static void main(String[] args) {
		int[] nums = { 2, 1, -3, 4, -1, 2, 1, -5, 4 };

		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {

		int maxSum = nums[0];
		int CurrSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			// if the running sum is greater than the value at index
			// --> better to expand the sub array (take running sum)
			// if the value at index is greater than the sub array sum so far
			// --> drop the sub array sum (consider value at index as new max)
			CurrSum = Math.max(nums[i], nums[i] + CurrSum);
			maxSum = Math.max(CurrSum, maxSum);

		}

		return maxSum;

	}

}
