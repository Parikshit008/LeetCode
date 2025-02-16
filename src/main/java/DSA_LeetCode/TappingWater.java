package DSA_LeetCode;

public class TappingWater {

	public static void main(String[] args) {

		int[] nums = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(storeWater(nums));

	}

	public static int storeWater(int[] nums) {
		int ans = 0;
		int[] leftMaxHeights = new int[nums.length];
		int[] rightMaxHeights = new int[nums.length];
		leftMaxHeights[0] = nums[0];
		rightMaxHeights[rightMaxHeights.length - 1] = nums[nums.length - 1];

		// finout the heights
		for (int i = 1; i < nums.length; i++) {
			leftMaxHeights[i] = Math.max(leftMaxHeights[i - 1], nums[i]);

		}

		for (int i = rightMaxHeights.length - 2; i >= 0; i--) {
			rightMaxHeights[i] = Math.max(rightMaxHeights[i + 1], nums[i]);

		}

		// compute the ans
		for (int i = 0; i < nums.length; i++) {
			ans = ans + Math.max(0,Math.min(leftMaxHeights[i], rightMaxHeights[i]) - nums[i]);
			//ans = Math.max(0, ans);

		}
		return ans;

	}
}
