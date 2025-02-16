package DSA_LeetCode2;

public class LongestsubArry1sAfterRemove1ele {
	
	public static void main(String[] args) {
		int nums[]= {0,1,1,1,0,1,1,0,1};
		System.out.println(longestSubarray(nums));
	}
	   
    public static int longestSubarray(int[] nums) {
    int curr = 0, prev = 0, ans = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 1) {
            curr++;
        } else {
            ans = Math.max(ans, prev + curr);
            prev = curr;
            curr = 0;
        }
    }

    ans = Math.max(ans, prev + curr); // If there's no 0, check the last segment

    if (ans == nums.length) {
        return ans - 1; // If all are 1s, remove one element
    } else {
        return ans;
    }
}
}

