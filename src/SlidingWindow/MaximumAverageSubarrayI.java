package SlidingWindow;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] nums = {-1};

        System.out.println(findMaxAverage(nums, 1));
    }

    private static double findMaxAverage(int[] nums, int k) {
        if(k<1){
            return 0;
        }

        double maxAvg = Integer.MIN_VALUE, sum=0;
        int l=0, r=0;

        while(r < nums.length){
            sum = sum + (double)nums[r];
            if((r-l+1) == k){
                maxAvg = Math.max(maxAvg, sum/k);
                sum = sum - (double)nums[l];
                l++;
            }
            r++;
        }

        return maxAvg;
    }
}
