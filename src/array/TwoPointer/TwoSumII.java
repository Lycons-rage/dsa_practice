package array.TwoPointer;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};

        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    private static int[] twoSum(int[] nums, int target){
        if(nums.length == 2 && nums[0]+nums[1] == target){
            return new int[]{1,2};
        }

        int p1 = 0;
        int p2 = nums.length-1;
        int[] ans = new int[2];
        while(p1!=p2){
            if(nums[p1]+nums[p2] > target){
                p2--;
            } else if(nums[p1]+nums[p2] < target){
                p1++;
            } else{
                ans[0] = p1+1;
                ans[1] = p2+1;
                break;
            }
        }

        return ans;
    }
}
