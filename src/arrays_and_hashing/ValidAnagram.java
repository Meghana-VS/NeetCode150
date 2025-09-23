package arrays_and_hashing;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "racecar", t = "carrace";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
//        char[] s1 = s.toCharArray();
//        char[] t1 = t.toCharArray();
//        Arrays.sort(s1);
//        Arrays.sort(t1);
//        return Arrays.equals(s1, t1);

//******************************************************************
        int[] arr = new int[26];
        if(s.length() != t.length()) return false;
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for(int x : arr){
            if(x != 0) return false;
        }
        return true;
    }
}
