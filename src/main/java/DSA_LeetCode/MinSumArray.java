package DSA_LeetCode;

public class MinSumArray {
	
	public static void main(String[] args) {
		int[] nums={2,3,1,2,4,3};
		int target=7;
		System.out.println(minnSubArray
				(nums,target));
		
	}

	
	public static int minnSubArray(int[] nums, int target){

		 int p1=0;
	        int p2=0;

	        int currSum =0;
	        int minLen = Integer.MAX_VALUE;
	        while(p2< nums.length){
	            currSum+= nums[p2];
	            while(currSum >= target){
	                minLen = Math.min(minLen, p2-p1+1);
	                currSum-= nums[p1];
	                p1++;
	            }
	            p2++;

	        }return minLen;

}
}