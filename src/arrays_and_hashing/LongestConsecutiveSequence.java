package arrays_and_hashing;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {2,20,4,10,3,4,5};               //2,3,4,5,10,20
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        int longestSequence = 1;
        int count = 0;
        int lastSmallest = Integer.MIN_VALUE;

        Arrays.sort(nums);
        for (int num : nums) {
            if (num - 1 == lastSmallest) {
                count++;
                lastSmallest = num;
            } else if (num != lastSmallest) {
                count = 1;
                lastSmallest = num;
            }
            longestSequence = Math.max(longestSequence, count);
        }
        return longestSequence;
    }

//**************************************************************************************************************
//        int longestSequence = Integer.MIN_VALUE;
//        for (int num : nums) {
//            int x = num;
//            int count = 1;
//            while (linearSearch(nums, x + 1)) {
//                x = x + 1;
//                count++;
//            }
//            longestSequence = Math.max(longestSequence, count);
//        }
//        return longestSequence;
//    }
//    private static boolean linearSearch(int[] nums, int target) {
//        for(int num : nums){
//            if(num == target) return true;
//        }
//        return false;
//    }

}
