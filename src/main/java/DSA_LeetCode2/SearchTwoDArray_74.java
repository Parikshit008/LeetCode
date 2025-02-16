package DSA_LeetCode2;

import java.util.Arrays;

public class SearchTwoDArray_74 {

	public static void main(String[] args) {
		int[][] original = { {1,3,5,7},{10,11,16,20 },{23,30,34,60} };
		int m = 3;
		int n = 4;
		int[] construct1DArray = construct1DArray(original, m, n);
		//String arrayEle = Arrays.toString(construct1DArray);
		//System.out.println(arrayEle);
		int target=30;
		boolean searchMatrix = searchMatrix(construct1DArray, target);
		System.out.println(searchMatrix);

	}
	
	public static boolean searchMatrix(int[] construct1DArray, int target) {
		int l=0,h=construct1DArray.length-1;
		
		while(l<=h) {
			int mid=l+(h-l)/2;
			if(construct1DArray[mid] ==target)
				return true;
			else if(construct1DArray[mid] <target) {
				
				l=mid+1;
			}
			else
				h=mid-1;
		}
		
		
		return false;
	}

	public static int[] construct1DArray(int[][] original, int m, int n) {
		int k = 0;
		int[] res = new int[m * n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {

				k = i * m + j;
				res[k] = original[i][j];
				k++;

			}

		}

		return res;
	}
}
