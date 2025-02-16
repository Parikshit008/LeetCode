package DSA_LeetCode2;

import org.testng.annotations.Test;


public class FindFristandLastEleSortedArray_34 {
	
	public static void main(String[] args) {
		
		int[] nums= {5,7,7,8,8,10};
		int target=8;
		int leftelement = findLeftmostIndex(nums, target);
		int rightelement = findRightmostIndex(nums, target);
		 System.out.println("Start: " + leftelement + ", End: " + rightelement);
		//return new int[] {leftelement,rightelement};
		
		
	}
	
	
	private static int findLeftmostIndex(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int leftmostIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                leftmostIndex = mid; // Update the leftmost index
               //
                high = mid - 1;      // Continue searching to the left
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return leftmostIndex;
    }

    private static int findRightmostIndex(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int rightmostIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                rightmostIndex = mid; // Update the rightmost index
                //
                low = mid + 1;        // Continue searching to the right
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return rightmostIndex;
    }

}
