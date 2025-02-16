package DSA_LeetCode2;

public class MaxConsecutiveOnes_1004 {

	public static void main(String[] args) {
		int[] nums = { 0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1 };
		int k = 3;
		//int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
		//int k = 2;
		System.out.println(maxConsec(nums, k));
	}

	public static int maxConsec(int[] nums, int k) {

		int start = 0;
		int maxOnes = 0;
		int ZeroCount = 0;

		for (int end = 0; end < nums.length; end++) {
           //if found zero while expanding the window increase the count of Zero
			if (nums[end] == 0) 	
			ZeroCount++;
            //if count exceeds 3 the start increascing the start point till u encounter a 0 and decrese ZeroCount
			while (ZeroCount > k) {
				if (nums[start] == 0) 
					ZeroCount--;
					start++;
				}
				maxOnes = Math.max(maxOnes, end - start + 1);
			}
			
			return maxOnes;

		}

}

