package DSA_LeetCode;

class IndexOfFirstOccurenceOfString_28 {

	public static void main(String[] args) {
		String haystack = "sadbutsad";
		String needle = "sad";
		strStr(haystack, needle);
		System.out.println(strStr1(haystack, needle));
	}

	// 1.Easiest way
	// return haystack.indexOf(needle);
	// 2.Trad Method
	public static int strStr1(String haystack, String needle) {

		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				int k = i; // haystack pointer
				int j = 0; // needle pointer

				while (k < haystack.length() && j < needle.length()) {// avoid stringIndexOutofBound
					//while (k < haystack.length() && j < needle.length() && haystack.charAt(k) == needle.charAt(j))
					k++;
					j++;
					if (j == needle.length()) { // starting point will be first index-i- which is outside while loop

						return i;
					}

				}}}
			
		return -1;
	}
	// 3. My Logic
	public static int strStr(String haystack, String needle) {
		if (needle.isEmpty())
			return 0; // Handle edge case for empty needle

		int p1 = 0; // Pointer for haystack
		int p2 = 0; // Pointer for needle

		while (p1 < haystack.length()) {
			if (haystack.charAt(p1) == needle.charAt(p2)) {
				p1++;
				p2++;
				if (p2 == needle.length()) {
					return p1 - needle.length(); // Match found
				}
			} else {
				// Reset pointers when characters don't match
				p1 = p1 - p2 + 1; // Backtrack to the next starting position
				p2 = 0;
			}
		}
		return -1; // Return -1 if needle is not found
	}
	//

}
