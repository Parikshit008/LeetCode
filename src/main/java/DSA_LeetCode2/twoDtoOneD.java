package DSA_LeetCode2;

import java.util.Arrays;

public class twoDtoOneD {
	public static void main(String[] args) {
		int[][] original= {{1,2,3},{4,5,6},{7,8,9}};
		int m=3;
		int n=3;
		int[] construct1DArray = construct1DArray(original, m, n);
		String arrayEle = Arrays.toString(construct1DArray);
		System.out.println(arrayEle);
		
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
