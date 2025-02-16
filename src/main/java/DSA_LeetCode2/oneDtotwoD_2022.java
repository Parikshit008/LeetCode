package DSA_LeetCode2;

import java.util.Arrays;

public class oneDtotwoD_2022 {
	
	public static void main(String[] args) {
		int[] original= {1,2,3,4,5,6,7,8};
		int m=2;
		int n=4;
		int[][] construct2dArray = construct2DArray(original, m, n);
		String deepToString = Arrays.deepToString(construct2dArray);
		System.out.println(deepToString);
		
	}
	
	public static int[][] construct2DArray(int[] original, int m, int n) {

        if (m * n != original.length) {
            return new int[0][0];
        }
        int[][] result = new int[m][n];
        int i = 0;
        int j = 0;
        for (int num : original) {
            result[i][j] = num;
            j++;//next  colunn
            if (j >=n) {  //if column exhausts
                j = 0;     //rest the colum
                i++;       //go to next row
            }

        }
        return result;

    }

}
