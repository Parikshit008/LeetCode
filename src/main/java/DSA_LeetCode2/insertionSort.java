package DSA_LeetCode2;

public class insertionSort {
	
	
	
	public static int[] insertionSort(int[] nums){

		for (int i=1;i<nums.length;i++){
		int j=i-1;
		int curr= nums[i];
		while (j>=0 && nums[j]> curr){
		nums[j+1]=nums[j];
		j--;
		}
		nums[j+1]=curr;
		}
		return nums;
		}

}


