package Assesment2;

public class FirstandLastIndexofSortedArray {
	
	//time-O(logn)
	//space-O(1)
public static void main(String[] args) {
		
		int[] nums= {5,7,7,8,8,10};
		int target=12;
		int leftIndex = LeftIndex(nums, target);
		int rightIndex = RightIndex(nums, target);
		System.out.println("Left:"+leftIndex+",Right:"+rightIndex);
		
}

public static int LeftIndex(int[] nums,int target) {
	int low=0; 
	int high =nums.length -1;
	int leftmostindex=-1;
	if(high<0)
		return -1;
	while(low<=high) {
		int mid=(low+high)/2;
		if(nums[mid]==target) {
			leftmostindex=mid;
			high=mid-1;	
		}
		else if(nums[mid]<target) {
			
			low= mid+1;
			
		}
		else {
			high=mid-1;
		
		}	
	}
	
	return leftmostindex;

}

public static int RightIndex(int[] nums,int target) {
	int low=0;
	int high =nums.length -1;
	int rightmostindex=-1;
	
	if(high<0)
		return -1;
	while(low<=high) {
		int mid=(low+high)/2;
		if(nums[mid]==target) {
			rightmostindex=mid;
			low=mid+1;	
		}
		else if(nums[mid]<target) {
			
			low= mid+1;
			
		}
		else {
			high=mid-1;
		
		}	
	}
	
	return rightmostindex;

}

}
