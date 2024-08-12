package SlidingWindow;

public class SubArrayProductLessThanK {
    public static void main(String[] args) {
        int[] nums = {1,1,1};

        System.out.println(numSubarrayProductLessThanK(nums, 1));
    }

    private static int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=0){
            return 0;
        }
        int count = 0;
        int l = 0, r = 0, product = 1;

        while(r<nums.length){
            product = product * nums[r];

            while(product >= k && l<=r){
                product = product / nums[l];
                l++;
            }
            if(product < k){
                count = count + (r-l+1);
            }
            r++;
        }

        return count;
    }
}
