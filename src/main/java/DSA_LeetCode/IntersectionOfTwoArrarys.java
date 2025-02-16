package DSA_LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrarys {

	/*
	 * intersection of two arrays
	 * 
	 * - sort the arrays - initialise the pointers with value 0, to traverse both
	 * the arrays - compare the elements at index p1, p2 - if(num1[p1]<nums2[p2])
	 * -p1++; - else if (nums1[p1]>nums2[p2]){ -p2++; - else // add the element into
	 * the set //an array p1++;p2++
	 */
	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int p1 = 0;
		int p2 = 0;
		Set<Integer> intersection = new HashSet<>();

		while (p1 < nums1.length && p2 < nums2.length) {
			if (nums1[p1] < nums2[p2]) {
				p1++;
			}

			else if (nums1[p1] > nums2[p2]) {
				p2++;
			} else {

				intersection.add(nums1[p1]);
				p1++;
				p2++;
			}
		}
		System.out.println(intersection);

	}

}