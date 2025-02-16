package DSA_LeetCode;

import java.util.Arrays;

public class distinct_Array {
	
	
	public static void main(String[] args) {
		int  a[]={1,5,3,3,4,6,7,7,8};
		int count=1;
		Arrays.sort(a);
		for(int i=0; i<a.length-1;i++) {
			
			if(a[i+1]==a[i]) {
				continue;
		
			}
			count++;	
		}
		System.out.println(count);
		
	}
}
	
	
	
	

