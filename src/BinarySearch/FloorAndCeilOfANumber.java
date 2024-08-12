package BinarySearch;

import java.util.Arrays;

import static BinarySearch.LowerBound.getLowerBound;

public class FloorAndCeilOfANumber {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70};
        int[] ans = new int[2];

        ans[0] = getFloorAndCeil(nums, 25);
        ans[1] = getLowerBound(nums, 25);

        System.out.println("Floor and ceil of given number : "+ Arrays.toString(ans));
    }

    private static int getFloorAndCeil(int[] nums, int target) {
        int low = 0, high = nums.length, ans = -1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]<=target){
                ans = mid;
                low = mid+1;
            }
            high = mid-1;
        }

        return ans;
    }
}
