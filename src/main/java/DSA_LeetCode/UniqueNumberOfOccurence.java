package DSA_LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class UniqueNumberOfOccurence {
	
	
	
	@Test
	public void method(){
		int[] nums= {1,2};
		System.out.println(methA(nums));;
		
	}
	//intiate hasmap
	//check if val is alreay presnt in map.key if yes initate the count  by 1
	//else add to map 
	//intiate a  Set add the Map to set and compare the size
	
	
	
	public boolean methA(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int curVal = map.get(nums[i]);
				map.put(nums[i], curVal + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		Set<Integer> set = new HashSet<Integer>(map.values());
		if (map.size() == set.size()) {
			return true;
		}
		return false;
	

	}
	
	
	

}
