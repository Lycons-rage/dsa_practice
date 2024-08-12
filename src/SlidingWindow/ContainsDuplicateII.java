package SlidingWindow;

import java.util.HashMap;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};

        System.out.println(containsNearbyDuplicates(nums, 1));
    }

    private static boolean containsNearbyDuplicates(int[] nums, int k) {
        if(k<=0){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], i);
            } else {
                if(Math.abs(map.get(nums[i])-i)<=k){
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }
}
