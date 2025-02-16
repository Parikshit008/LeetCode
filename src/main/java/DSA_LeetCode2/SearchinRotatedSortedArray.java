package DSA_LeetCode2;

public class SearchinRotatedSortedArray {
	
	public static void main(String[] args) {
		int[] nums={3,3,1,2,3,3,3};
		int target=1;
		System.out.println(searchRotated(nums, target));
		
	}
	
	public static int searchRotated(int[] nums, int target){

       
        int low=0, high=nums.length-1;int ans=-1;

        while(low<=high){
            int mid = (low+high)/2;
           
            if(nums[mid] == target){// 
                return mid;
                
            }
            if (nums[low] == nums[mid]&& nums[mid]== high) {//edge case to trim the array at ends if it has duplicates
                low++;
                high--;
                continue;

            }
            else if(nums[low]<=nums[mid]){// check which part if sorted
                if (nums[low] <=target &&target < nums[mid]){ //check target is in left
                    high = mid - 1; }//check left
                else {
                    low = mid + 1;//check right
                }
            }else{
                if(nums[mid]<=target && target <= nums[high]){//if target is in right
                    low = mid+1; //check right
                }else{
                    high = mid-1;
                } //check left
            }
        }
        return -1;
    }

}
