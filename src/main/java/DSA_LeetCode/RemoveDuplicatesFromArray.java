package DSA_LeetCode;

public class RemoveDuplicatesFromArray{
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
	}
	
    public static int removeDuplicates(int[] nums) {
        int indexToStoreDiff = 1; // Start from index 1 since 0 is already unique
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) { // Compare the current element with the previous one
                nums[indexToStoreDiff] = nums[i]; // Store the unique element at indexToStoreDiff
                indexToStoreDiff++; // Move to the next position
            }
        }
        return indexToStoreDiff; // Return the count of unique elements
    }
}
