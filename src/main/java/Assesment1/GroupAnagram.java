package Assesment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;


public class GroupAnagram {
	/*
	 * PSEUDO
	 * List of Array Input: strs = ["eat","tea","tan","ate","nat","bat"] List of
	 * List of Array Output: [["bat"],["nat","tan"],["ate","eat","tea"]] Pseudo-
	 * -Get the input asList of String -iterate through each word get the
	 * word->convert to Char->Sort->Store in Hasmap(Strinng,List<String>) -while
	 * iterating also store each string in a New Array List -Check if the Key is not
	 * present , the add the key and Valu -else add the new value to the List
	 * -Return only the Values(list)
	TC and SC
	TC->  1loop=O(n),1Sort=O(n),2 Contains adn Add all->O(logn)==> <O(nLog n)
	SC_>  Char[]-n, hashmap-n                                  ==>  O(2n)
	*/

	public static void main(String[] args) {
		//String[] anagram = { "eat", "tea", "tan", "ate", "nat", "bat" };
		String[] anagram={"a"};
		List<List<String>> groupedAnagrams = groupAnagrams(Arrays.asList(anagram));

		System.out.println(groupedAnagrams);
	}

	public static List<List<String>> groupAnagrams(List<String> anagrams) {

		HashMap<String, List<String>> map = new HashMap<>();
		for (String s : anagrams) {
			ArrayList<String> realValues = new ArrayList<>();// new values are stored
			realValues.add(s);
			char[] charcs = s.toCharArray();
			Arrays.sort(charcs);
			String sortedWord = String.valueOf(charcs);
			if (!map.containsKey(sortedWord)) {

				map.put(sortedWord, realValues);// if not eql to key store one value(New/unique)

			} else
				map.get(sortedWord).addAll(realValues);
		}

		Collection<List<String>> values = map.values();
		return new ArrayList<>(values);

	}
}
