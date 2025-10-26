package arrays_and_hashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
    public static void main(String[] args) {
        String[] str = {"neet","code","love","java"};
        String enc = encode(List.of(str));
        System.out.println(enc);
        System.out.println(decode(enc));
    }

    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            int len = s.length();
            sb.append(len).append('#').append(s);
        }
        return sb.toString();
    }

    public static List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            String word = str.substring(j+1, j+1+length);

            list.add(word);
            i = j+1+length;
        }
        return list;
    }
}
