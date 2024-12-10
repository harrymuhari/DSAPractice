package Leetcode.Strings;

import java.util.*;

public class GroupAnagrams {
    public static void main(String... args){
        String[] strs = new String[]{"act","pots","tops","cat","stop","hat"};
        solution(strs);
    }

    public static List<List<String>> solution(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Set<String> container = new HashSet<String>();

        for(String str: strs){
            List<String> anagramGroup = new ArrayList<String>();
            char[] charStr = str.toCharArray();
            Arrays.sort(charStr);
            String sortedStr = new String(charStr);

            container.add(sortedStr);

            if(!container.add(sortedStr)){
                anagramGroup.add(str);
            }

            System.out.println(anagramGroup.toString());
        }


        return result;
    }
}
