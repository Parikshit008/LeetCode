package DSA_LeetCode2;

public class SearchTwoDArray_Approach2 {
	
	public static void main(String[] args) {
		int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target=60 ;
		
		int rowIndx = searchPotentialRow(matrix, target);
		 if (rowIndx != -1) {
			boolean binarySearchOverRow = binarySearchOverRow(rowIndx, matrix, target);
			System.out.println(binarySearchOverRow);
			}
		    
		
	}

	public static int searchPotentialRow(int[][] matrix, int target) {

		int low = 0;

		int high = matrix.length - 1;
		int lastindx = matrix[0].length - 1;
 
		while(low<=high) {
			int mid= low+(high -low)/2;
			if(matrix[mid][0]<= target && target<=matrix[mid][lastindx]) {
				return mid;
				
			}
			else if(matrix[mid][0]<target) {
				high=mid-1;
			}
			else if(matrix[mid][0]>target) {
				low=mid+1;
			}	
		}
		return -1;

	}
	public static boolean binarySearchOverRow(int rowIndx,int[][] matrix,int target){
		
		int low=0;
		int high=matrix[rowIndx].length-1;
		  while (low <= high) {
		      int mid = low + (high - low)/2;
		      if(matrix[rowIndx][mid]==target){
		    	  return true;
		      }
		      else if (matrix[rowIndx][mid] > target) high = mid - 1;
		      else low = mid + 1;
		    }
		      
		  
		return false;

	}
	
	
	
	
	

}
