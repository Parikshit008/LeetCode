package DSA_LeetCode2;

import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class FindAllAnagramsInAString {

   public static void main(String[] args) {
	   String s="cbaebabacd";
       String p="abc";
       System.out.println(findAnagrams(s, p));
     
}
    

    public static List<Integer> findAnagrams(String s, String p){
        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<p.length();i++){
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i),0)+1);
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
        }
        if(sMap.equals(pMap)) list.add(0);
        for (int i=p.length();i<s.length();i++){
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
            char ch = s.charAt(i - p.length());
            if (sMap.containsKey(ch)){
                if(sMap.get(ch)>1)
                    sMap.put(ch, sMap.getOrDefault(ch,0)-1);
                else
                    sMap.remove(ch);
            }
            if(sMap.equals(pMap))
                list.add(i-p.length()+1);

        }
        return list;
    }
}