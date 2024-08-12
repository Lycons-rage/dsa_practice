package SlidingWindow;

public class LongestContinuouSubarrayWithAbsoluteDiffLessThanorEqualtoLimit {
    public static void main(String[] args) {
        int[] nums = {1,5,6,7,8,10,6,5,6};
        int limit = 4;

        System.out.println(longestSubarray(nums, limit));
    }

    static int longestSubarray(int[] nums, int limit){
        int max_len = 0;
        int l=0, r=0, diff=0;

        while(r<nums.length){
            if((r-l+1)==1) {
                max_len = 1;
            } else {
                int[] minMax = getMax(nums, l, r);

                diff = Math.abs(minMax[0]-minMax[1]);
                if(diff <= limit){
                    max_len = Math.max(max_len, r-l+1);
                } else {
                    l++;
                }
            }
            r++;
        }
        return max_len;
    }

    private static int[] getMax(int[] nums, int l, int r) {
        int max=Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int[] arr = new int[2];
        for (int i = l; i <=r ; i++) {
            if (nums[i] < min) {
                min = nums[i];
                arr[1] = min;
            }
            if(nums[i] > max){
                max = nums[i];
                arr[0] = max;
            }
        }
        return arr;
    }
}
