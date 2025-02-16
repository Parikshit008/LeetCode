package DSA_LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
	
	public static void main(String[] args) {
		int[] nums= {1,2,3,1};
		int k=3;
		
		System.out.println(containsDup(nums, k));
		
	}
	 

	
	public static boolean containsDup(int[] nums, int k){
		 Map<Integer, Integer> map = new HashMap<>();
	        boolean output = false;
	        for (int i = 0; i < nums.length; i++) {
	            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
	                return true;
	            } 
	                map.put(nums[i], i);

	            }
	            return output;
	        }
}


/*
	 * - Initialise hashmap
- iterate the array and load entries
- before adding check if nums[i] is already there and i-map.get(nums[i])<k
	- if yes return true
	- else return false
	}
	*/