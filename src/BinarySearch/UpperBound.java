package BinarySearch;


public class UpperBound {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,8,8,11,13};

        System.out.println(getUpperBound(nums, 2));
    }

    public static int getUpperBound(int[] nums, int x) {
        int low = 0, high = nums.length-1, ans = -1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] <= x) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid-1;
            }
        }

        return ans;
    }
}
