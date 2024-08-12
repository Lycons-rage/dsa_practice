package SlidingWindow;

public class LongestEvenOddSubarrayWithThreshold {
    public static void main(String[] args) {
        int[] nums = {1,2};

        System.out.println(longestAlternatingSubarray(nums, 2));
    }

    private static int longestAlternatingSubarray(int[] nums, int threshold) {
        int max_len = 0;
        int l=0,r=0;

        while(r < nums.length){
            if(nums[l]%2==0){
                if(nums[r]<=threshold){
                    if(r+1<nums.length && nums[r]%2!=nums[r+1]%2){
                        max_len = Math.max(max_len, (r-l+1));
                    }
                }
            }
            else{
                l++;
            }
            r++;
        }

        return max_len;
    }
}
