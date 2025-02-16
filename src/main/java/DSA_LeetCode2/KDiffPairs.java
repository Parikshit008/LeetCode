package DSA_LeetCode2;

import java.util.*;

public class KDiffPairs {

	public static void main(String[] args) {
		int[] nums = { 3, 1, 4, 1, 5 };
		int k = 2;
		System.out.println(kdiff(nums, k));

	}

	public static int kdiff(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;

		// put nums into MAP
		for (int c : nums) {

			map.put(c, map.getOrDefault(c, 0) + 1);

		}

		// find the pairs
		
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
			if(k==0) {
				if(entry.getValue()>1)
                count++;
			}
			else {
				int num= entry.getKey() +k;
				if(map.containsKey(num
						))
						count++;
				
			}
			
		}

		return count;
	}

}
