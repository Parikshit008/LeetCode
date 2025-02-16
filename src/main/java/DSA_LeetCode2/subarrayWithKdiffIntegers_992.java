package DSA_LeetCode2;

import java.util.HashMap;

public class subarrayWithKdiffIntegers_992 {
	
	public static void main(String[] args) {
		int[] nums= {1,2,1,2,3};
		int k=2;
		int subWithMaxK = subarraysWithKDistinct(nums, k);        // Subarrays with at most k distinct integers
	    int reducedSubWithMaxK = subarraysWithKDistinct(nums, k - 1); // Subarrays with at most (k-1) distinct integers
	   int answer =subWithMaxK-reducedSubWithMaxK; 
		System.out.println(answer);
	}
	
	
public static int subarraysWithKDistinct(int[] nums, int k) {
	
	 HashMap<Integer, Integer> map = new HashMap<>(); // Tracks counts of numbers in the window
	    int left = 0, right = 0, ans = 0;
	    
	    while (right < nums.length) {
	        // Add nums[right] to the window
	        map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
	        
	        while (map.size() > k) {
	            map.put(nums[left], map.get(nums[left]) - 1); // Reduce count of nums[left]
	            if (map.get(nums[left]) == 0) {              // Remove it if count becomes 0
	                map.remove(nums[left]);
	            }
	            left++;
	        }

	        // Add the number of subarrays ending at 'right'
	        ans += right - left + 1;

	        // Move the right pointer to expand the window
	        right++;
	    }

	    return ans;
}
}
