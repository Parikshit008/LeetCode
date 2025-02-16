package DSA_LeetCode;

import java.util.*;

public class LongestSubstringWoReaptingCharc_3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubString(s));
    }

    public static int longestSubString(String s) {
        // Initialize two pointers and a variable to track the maximum length
        int p1 = 0, p2 = 0, maxLen = Integer.MIN_VALUE;

        // Use a HashMap to track the occurrences of characters
        HashMap<Character, Integer> map = new HashMap<>();

        while (p2 < s.length()) {
            // Load the occurrence of the character at p2 into the map
            map.put(s.charAt(p2), map.getOrDefault(s.charAt(p2), 0) + 1);

            // If a character is repeated, move the left pointer (p1) to reduce the window
            while (map.get(s.charAt(p2)) > 1) {
                map.put(s.charAt(p1), map.get(s.charAt(p1)) - 1);
                p1++;
            }

            // Update the maximum length of the substring
            maxLen = Math.max(maxLen, p2 - p1 + 1);
            p2++;
        }

        return maxLen;
    }
}
