package arrays_and_hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {5,5};
        int target = 10;
        int[] res = twoSum(nums, target);
        for (int x : res){
            System.out.print(x+" ");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
//*******************( TC - o(n^2), SC - o(1))**************************
//        for(int i=0; i<nums.length; i++){
//            for(int j=i+1; j< nums.length; j++){
//                if(nums[i] + nums[j] == target){
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{-1, -1};
//***********************************************************************
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int reqNum = target - nums[i];
            if(map.containsKey(reqNum)){
                return new int[]{map.get(reqNum), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
