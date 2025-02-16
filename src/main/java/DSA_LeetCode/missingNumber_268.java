package DSA_LeetCode;


	class missingNumber_268 {
		public static void main(String[] args) {
			int[] nums= {9,6,4,2,3,5,7,0,1};
			System.out.println(missingNumberFetch(nums));
		}
		
		
	    public static int missingNumberFetch(int[] nums) {
	        int n = nums.length;
	        int actual = 0;
	        int expected=0;
	        int missingVal=0;
	        for (int i = 0; i < nums.length; i++) {
	            actual = actual+ nums[i];
	        }
	expected=n*(n+1)/2;
	missingVal=expected-actual;
	return missingVal;
	    }
	}


