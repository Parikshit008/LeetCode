package DSA_LeetCode;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class two_Pointer_Two_Sum {
	

		public static void main(String[] args) {
			 int[] numbers = {2, 32, 11, 7};
		        int target = 9;
		        int[] fin = new int[2]; 
		        int left = 0;
		        int right = numbers.length - 1;

		        while (left < right) {
		            int sum = numbers[left] + numbers[right]; 
		            if (sum == target) {
		                fin = new int[]{left, right};
		                break; 
		            } else if (sum > target) {
		                right--;
		            } else {
		                left++;
		            }
		        }

		            System.out.println("Indices: " + Arrays.toString(fin));
		        
	
		}
		
		@Test
		public void sumofTwo() {
			 int[] numbers = {2, 32, 11, 7};
		        int target = 9;
		    System.out.println(Arrays.toString(twoSumHashMap(numbers, target)));    
			
		}
		
		public int[] twoSumHashMap(int[]nums, int target){
		    
		    // TC:- O(n)
		    // SC:- O(n)
		    // initialise a map - we need to store (key(number), value(index))
		    HashMap<Integer, Integer> map = new HashMap<>();
		    for (int i=0;i<nums.length;i++){
		        // 9-7=2
		        if(map.containsKey(target-nums[i])){
		            // 1, 0
		            return new int[]{i, map.get(target-nums[i])};
		        }
		        //2,0
		        map.put(nums[i], i);
		    }
			return new int[]{-1,-1};
		   
		}}


	

	

