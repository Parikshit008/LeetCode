package DSA_LeetCode;

public class RemoveDuplicatesFromArrayII_80 {
	
	public static void main(String[] args) {
		
		int[] nums= {0,0,1,1,1,1,2,3,3};
		
		System.out.println(removeDuplicates(nums));
		
	}
	
	    public static int removeDuplicates(int[] nums) {

	         // Handle edge cases where the array has fewer than 2 elements
	        if (nums.length <= 2) {
	            return nums.length;
	        }

	        int indx=2;
	        for(int i=2; i<nums.length;i++){
	            
	            if(nums[i]!=nums[indx-2] )
	            {

	                nums[indx]=nums[i];
	                indx++;
	            }

	           
	        }
	         return indx;
	        
	    }
	    
	}
