package DSA_LeetCode;

public class ReverseEachWord {

	
	public static void main(String[] args) {
		String Input="Welcome To Testleaf";
		System.out.println(ReverseEachWord(Input));
	}
	
	public static String ReverseEachWord(String Input) {
		
		
		String[] words = Input.split(" ");
		String result = "";
		
		for(String word :words) {
			String ReversedWord="";
			for(int i=word.length()-1;i>=0;i--) {
				ReversedWord=ReversedWord + word.charAt(i);
				
			}
			
			 result += ReversedWord+" ";
		}
		
		return result;

	}
	
	
	
}
