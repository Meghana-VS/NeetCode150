package arrays_and_hashing;

public class ProductsOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,4,6};
        int[] result = productExceptSelf(nums);
        for(int x : result) System.out.print(x+" ");
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProduct = new int[n];
        leftProduct[0] = 1;
        for(int i=1; i<n; i++){
            leftProduct[i] = leftProduct[i-1] * nums[i-1];
        }

        int[] rightProduct = new int[n];
        rightProduct[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            rightProduct[i] = rightProduct[i+1] * nums[i+1];
        }

        int[] res = new int[n];
        for(int i=0; i<n; i++){
            res[i] = leftProduct[i] * rightProduct[i];
        }
        return res;
    }
}
