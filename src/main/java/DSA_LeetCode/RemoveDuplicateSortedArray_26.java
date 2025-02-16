package DSA_LeetCode;

public class RemoveDuplicateSortedArray_26 {
	
	
	public static void main(String[] args) {
		int[] nums= {0,0,1,1,1,2,2,3,3,4};
		int removeDuplicates = removeDuplicates(nums);
		System.out.println(removeDuplicates);
	}

	    public static int removeDuplicates(int[] nums) {
	int indexToStoreDiff=1;//0 is already unique
	for(int i=1;i<nums.length;i++)
	        if(nums[i-1]!=nums[i]){
	            nums[indexToStoreDiff]=nums[i];
	            indexToStoreDiff++;
	        }
	        return indexToStoreDiff;
	    }
	}


