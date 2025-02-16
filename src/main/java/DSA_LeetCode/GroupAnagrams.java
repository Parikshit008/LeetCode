package DSA_LeetCode;
import java.util.*;

public class GroupAnagrams {
	
	
	 public static void main(String[] args) {
	        String[] anagram = {"eat", "tea", "tan", "ate", "nat", "bat"};
	        List<List<String>> groupedAnagrams = groupAnagrams2(Arrays.asList(anagram));
	        
	        System.out.println(groupedAnagrams);
	    }

	 public static List<List<String>> groupAnagrams(List<String> anagrams){
	        // initialise a hash map with String as key List<String> as value
	        HashMap<String, List<String>> map = new HashMap<>();
	        // iterate the list and store the sorted version of the string as key and list of strings as value
	        for (int i=0;i<anagrams.size();i++){ //O(n)
	            ArrayList<String> valueList = new ArrayList<>();
	            String eachStr = anagrams.get(i); // O(1)
	           valueList.add(eachStr); //O(1)
	            char[] charArray = eachStr.toCharArray(); //O(n)
	            Arrays.sort(charArray); // On(logn)
	            String sortedKey = String.valueOf(charArray); //O(n)
	            // eat-> aet->[eat]
	            // ate-> aet -> [eat, ate]
	            // tea -> aet -> [eat, ate, tea]
	            // bat -> abt -> [bat]
	            // ant -> [tan nat]
	            if(!map.containsKey(sortedKey)) //O(1)--> O(logn)
	                map.put(sortedKey, valueList);
	            else {
	                // get the current list of strings
	                List<String> strings = map.get(sortedKey); //O(1)--> O(logn)
	                // append the current list of strings to the existing list of strings
	                strings.addAll(valueList); //O(n)
	                map.put(sortedKey, strings); // O(1)
	            }
	        }
	        Collection<List<String>> values = map.values(); // O(n)
	        return new ArrayList<>(values); //O(n)

	    }
	 // my solution
	  public static List<List<String>> groupAnagrams2(List<String> anagrams){
		  
		  HashMap<String,List<String>> map = new HashMap<>();
		  for(String s: anagrams) {
			  ArrayList<String> valuesList = new ArrayList<>();
			  valuesList.add(s);
			  char[] charcs = s.toCharArray();
			  Arrays.sort(charcs);
			  String sortedWord = String.valueOf(charcs);
			  if(!map.containsKey(sortedWord)) {
				  
				  map.put(sortedWord, valuesList);
				  
			  }
			  else
				  map.get(sortedWord).addAll(valuesList);		  
		  }
		  
		Collection<List<String>> values = map.values();
		return new ArrayList<>(values);
 
	  }
	

    public static List<List<String>> groupAnagramsWithAscii(List<String> anagrams){
        // initialise a hash map with String as key List<String> as value
        HashMap<String, List<String>> map = new HashMap<>();
        // iterate the list and store the sorted version of the string as key and list of strings as value
        for (int i=0;i<anagrams.size();i++){ //O(n)
            ArrayList<String> valueList = new ArrayList<>();
            String eachStr = anagrams.get(i); // O(1)
            valueList.add(eachStr);
            int[] ascii= new int[26];
            for(int j=0;j<eachStr.length();j++){
                ascii[eachStr.charAt(j)-'a']++;
            }
            String string = Arrays.toString(ascii);
            String sortedKey = String.valueOf(string);

            // eat-> aet->[eat]
            // ate-> aet -> [eat, ate]
            // tea -> aet -> [eat, ate, tea]
            // bat -> abt -> [bat]
            // ant -> [tan nat]
            if(!map.containsKey(sortedKey)) //O(1)--> O(logn)
                map.put(sortedKey, valueList);
            else {
                // get the current list of strings
               // List<String> strings = map.get(sortedKey); //O(1)--> O(logn)
                // append the current list of strings to the existing list of strings
                //strings.addAll(valueList); //O(n)
                //map.put(sortedKey, strings); // O(1)
                map.get(sortedKey).add(eachStr);
            }
        }
        Collection<List<String>> values = map.values(); // O(n)
        return new ArrayList<>(values); //O(n)

    }

}
