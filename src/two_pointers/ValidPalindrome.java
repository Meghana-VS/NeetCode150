package two_pointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String newStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = newStr.length();
        StringBuilder sb = new StringBuilder();
        for(int i=n-1; i>=0; i--){
            sb.append(newStr.charAt(i));
        }
        return newStr.equals(sb.toString());
    }
}
