package DSA_LeetCode;

import org.junit.Test;

public class MergeArraysWithoutZeros {
	
	
	@Test
	public void mergeWithoutZero() {
		int[] nums1= {1,2,3,0,0,0};
		int[] nums2= {2,5,6};
		
		String merge = merge(nums1, 3, nums2, 3).toString();
		System.out.println(merge);
	}
	
	public int[] merge(int[] nums1, int m, int[] nums2, int n) {
		
		int p1=m-1,p2= n-1, index=nums1.length-1;
		
		while(p1>=0 && p2>=0) {
			
			if(nums1[p1]<nums2[p2]) {
				
				nums1[index]=nums2[p2];
				p2--;
				index--;
				
				
			}
			else if(nums1[p1]>nums2[p2]) {
				
				nums1[index]=nums1[p1];
				p1--;
				index--;
				
				
			}
			else {
				
				nums1[index]=nums1[p1];
				p1--;
				index--;
			}
			
			
		}
		while(p2>=0) {
			nums1[index]=nums2[p2];
			p2--;
			index--;
			
		}
		while(p1>=0) {
			nums1[index]=nums1[p1];
			p1--;
			index--;
			
		}
		return nums2;
		
		
	}

}
