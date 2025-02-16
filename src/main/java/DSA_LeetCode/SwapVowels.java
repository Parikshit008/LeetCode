package DSA_LeetCode;

public class SwapVowels {

	public static void main(String[] args) {
		String s = "Hello Everyone! Welcome to Testleaf";
		System.out.println(RevVowels(s));

	}

	public static String RevVowels(String s) {

		char ch[] = s.toCharArray();
		int start = 0;
		int end = s.length() - 1;

		while (start < end) {

			if (!isVowels(ch[start])) {

				start++;
			}

			else if (!isVowels(ch[end])) {
				end--;
			} else

			{
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				start++;
				end--;
			}

		}
		return String.valueOf(ch);

	}

	public static boolean isVowels(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'U'
				|| ch == 'I' || ch == 'O') {

			return true;
		}

		return false;

	}

}
