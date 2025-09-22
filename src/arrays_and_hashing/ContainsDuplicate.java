package arrays_and_hashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(hasDuplicate(nums));
    }
    public static boolean hasDuplicate(int[] nums) {
//        for (int i=0; i<nums.length; i++){
//            for(int j=i+1; j<nums.length; j++){
//                if(nums[i] == nums[j]) return true;
//            }
//        }
//        return false;

        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
