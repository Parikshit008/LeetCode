package Assesment1;

public class SlidingMaxSum {
	
	
	
	public static void main(String[] args) {
		int[] nums= {100, 200, 300, 400};
		int k=2;
		  System.out.println(largestSubArray(nums, k));
		
	}
	public static int largestSubArray(int[] nums, int k){
        int currSum=0;
        int maxSum=0;
        for(int i=0; i<k;i++){
            currSum+= nums[i];
            maxSum = Math.max(currSum, maxSum);// coz it will be easy to return max without checking //insteat of assigng to currsum initaialiy
        }

//        for(int i=1;i< nums.length-k+1;i++){
//            currSum-= nums[i-1];
//            currSum+= nums[i+k-1];
//            maxSum = Math.max(currSum, maxSum);
//        }
//Method 2
        for(int i=k;i< nums.length;i++){  //start k
            currSum-= nums[i-k];          //minus k to reduce first window
            currSum+= nums[i];
            maxSum = Math.max(currSum, maxSum);

        }
        
        return maxSum;

    }

}
