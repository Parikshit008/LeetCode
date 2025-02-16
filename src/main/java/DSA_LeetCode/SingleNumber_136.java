package DSA_LeetCode;

public class SingleNumber_136 {
	
public static void main(String[] args) {
	int[] nums= {4,1,2,1,2};
	System.out.println(singleNumber1(nums));
	
}
	    public static int singleNumber1(int[] nums) {
	         int result = 0;
	        
	         for (int i = 0; i < nums.length; i++) {
	            result = result^ nums[i];
	        }
	        return result;
	       
	    }
	}
