package DSA_LeetCode;

import java.util.HashMap;

import org.junit.Test;

public class LargestSubArrayWithSumZero {

	
	
	@Test
	public void subArrayZero() {
		int[] nums= {15,-2,2,-8,1,7,10,23};
		
		lenogLargestSubArray(nums);
		System.out.println(lenogLargestSubArray(nums));
		
	}
	
	public int lenogLargestSubArray(int[] nums){
		
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1); //virtual Entry
		int sum=0, maxLen=Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++) {
          sum+=nums[i];//running sum
			if(map.containsKey(sum)) 
				maxLen=Math.max(maxLen, i-map.get(sum));
				else map.put(sum, i);
			}
		
		return maxLen;

	}
	
	
	
	
}
