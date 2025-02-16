package Assesment1;

public class DiagonalSum {
	
	/*
	 * Input: mat = [[1,2,3],
              [1,2,3],
              [1,2,3]]
Output: 25
Pseudo:
-it is 2D Array hence intput taken _> int[][] mat
-get the no.of rows which is 3 and Iterate over eavh array
-initiate a sum and add the ele in Fisrt row first column which is  1(0,0)
-add the last index which is 3 ->first [i] and n-i-1 -> 3-0-1=2 so we get 3 and add it sum
-if the matrix rows are odd in number the remove the Middle(n/2)(n/2) as it is counted twice

TC and SC
TC-> O(n)
SC_>O(1)

*/	
	
	
	public static void main(String[] args) {
		int[][] mat= {{1,2,3}
		        ,{4,5,6},
		          {7,8,9}};
		//int[][] mat={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		//int[][]mat= {{5}};
		System.out.println(diagSum(mat));
	}
	
	public static int diagSum(int[][] mat) {
		
		int n=mat.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+mat[i][i];
			sum=sum+mat[i][n-i-1];
			
		}
		if(n%2!=0) {
			sum=sum-mat[n/2][n/2];
			
		}
		return sum;
		
		
	}
	
	

}
