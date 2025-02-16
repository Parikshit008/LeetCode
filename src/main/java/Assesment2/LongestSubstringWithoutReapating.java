package Assesment2;

import java.util.HashMap;

public class LongestSubstringWithoutReapating {
	
	//Time- O(n)
	//Space- O(n)
	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(longestSubString(s));
	}
		public static int longestSubString(String s) {
			
			HashMap<Character, Integer> map = new HashMap<>();
			int p1=0,p2=0;
			int maxLength= Integer.MIN_VALUE;
			
			while(p2<s.length()) {
				
				map.put(s.charAt(p2), map.getOrDefault(s.charAt(p2),0)+1);
				
			
			while(map.get(s.charAt(p2))>1) {
				map.put(s.charAt(p1), map.getOrDefault(s.charAt(p1),0)-1);
				p1++;
				
			}
			maxLength= Math.max(maxLength, p2-p1+1);
			p2++;
			}
			
			
			
			return maxLength;
	}

}
