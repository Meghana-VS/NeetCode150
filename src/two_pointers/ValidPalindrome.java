package two_pointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
//        String newStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        int n = newStr.length();
//        StringBuilder sb = new StringBuilder();
//        for(int i=n-1; i>=0; i--){
//            sb.append(newStr.charAt(i));
//        }
//        return newStr.equals(sb.toString());

//*******************************************************************************************

//        String reversed = new StringBuilder(newStr).reverse().toString();
//        return newStr.equals(reversed);

//*******************************************************************************************

        int left  = 0;
        int right = s.length() - 1;

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}
