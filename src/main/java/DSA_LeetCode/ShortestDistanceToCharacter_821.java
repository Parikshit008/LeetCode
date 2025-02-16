package DSA_LeetCode;

public class ShortestDistanceToCharacter_821 {

	public static void main(String[] args) {
		String s = "loveleetcode";
		char c = 'e';
		int[] result = shortestToChar(s, c);

		// Print the result array
		for (int dist : result) {
			System.out.print(dist + " ");
		}
	}

	public static int[] shortestToChar(String s, char c) {
		int n = s.length();
		int[] output = new int[n];
		int count = n; // Initialize count with a large value (greater than any possible distance)

		// Left-to-Right Pass
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == c) {
				count = 0; // Reset count to 0 when target character is found
			}
			output[i] = count;
			count++; // Increment count for non-target characters
			//output[i] = count;
		}

		// Right-to-Left Pass
		count = n; // Reset count for the second pass
		for (int i = n - 1; i >= 0; i--) {
			if (s.charAt(i) == c) {
				count = 0; // Reset count to 0 when target character is found
			}
			
			output[i] = Math.min(output[i], count); // Take the minimum distance
			count++; // Increment count for non-target characters
		}
		return output;

	}

}
