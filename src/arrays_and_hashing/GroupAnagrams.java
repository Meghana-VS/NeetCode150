package arrays_and_hashing;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> res = groupAnagrams(strs);
        System.out.println(Arrays.toString(res.toArray()));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
//        Map<String, List<String>> map = new HashMap<>();
//        for(String s : strs){
//            char[] ch = s.toCharArray();
//            Arrays.sort(ch);
//            String key = new String(ch);
//            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
//        }
//        return new ArrayList<>(map.values());

//***************************************************************************
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(char ch : s.toCharArray()){
                count[ch - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int num : count){
                sb.append(num).append("#");
            }
            String key = sb.toString();
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
