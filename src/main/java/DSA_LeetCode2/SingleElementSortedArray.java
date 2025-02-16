package DSA_LeetCode2;

public class SingleElementSortedArray {
	
	public static void main(String[] args) {
		int[] nums=	{1,1,2,3,3,4,4,8,8};
		System.out.println(singleElementSorted(nums));
		
	}
	
	public static int singleElementSorted(int[] nums){
        int low=0,high=nums.length-1;
        int mid=0;
        while(low <= high){
            mid=(low+high)/2;
            if(mid % 2 ==0){
                if(nums[mid] != nums[mid+1]){
                    high = mid-1;
                }else{
                    if(nums[mid] != nums[mid-1]){
                        low = mid+1;
                    }

                }
            }else{
                if(nums[mid] != nums[mid+1]){
                    low = mid+1;
                }else{
                    if(nums[mid] != nums[mid-1]){
                        high = mid-1;
                    }

                }
            }
        }

        return nums[mid];

    }

}
