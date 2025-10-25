package arrays_and_hashing;

import java.util.*;

public class Top_K_FrequentElements {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3,4,4,4,4,4};
        int k = 2;
        int[] result = topKFrequent(nums, k);
        for(int x : result) System.out.print(x+" ");
    }
    public static int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] bucket = new List[n+1];
        for(int key : map.keySet()){
            int frequency = map.get(key);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] res = new int[k];
        int counter = 0;
        for(int i = bucket.length-1; i >= 0 && counter < k; i--){
            if(bucket[i] != null){
                for(int x : bucket[i]){
                    res[counter++] = x;
                }
            }
        }
        return res;
    }
}
