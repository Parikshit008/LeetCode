package DSA_LeetCode2;

public class findPeakElement {
	public static void main(String[] args) {
		
		int[] nums= {1,2,1,3,5,6,4};
		System.out.println(findPeakEle(nums));
		
	}
	
	public static int findPeakEle(int[] nums){
        //a[i] != a[i+1] && a[i-1] != a[i]
        int low=1,high=nums.length-2;
        int mid=0;
        int n = nums.length;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;
        //[1,2,1,3,5,6,4]
        while(low <= high){
            mid = (low+high)/2;
            //best case
            if((nums[mid] > nums[mid+1]) && (nums[mid] > nums[mid-1])){
                return mid;
            }
            if(nums[mid] > nums[mid-1]){
                low = mid+1;
            }else{
                high = mid-1;
            }

        }
        return -1;

    }

}
