package array.TwoPointer;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        int p1 = 0;
        int p2 = 1;

        HashMap<Integer, int[]> map = new HashMap<>();
        while(p1<nums.length-1){
            int sum = nums[p1]+nums[p2];
            map.put(sum, new int[]{p1,p2});
            p2++;
            if(p2 == nums.length){
                p1++;
                p2 = p1+1;
            }
        }

        if (map.containsKey(target)){
            return map.get(target);
        }
        return null;
    }
}
