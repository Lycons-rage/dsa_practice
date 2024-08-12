package hashing;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {-1,-1,1};
        System.out.println(subarraySum(nums, 0));
    }

    private static int subarraySum(int[] nums, int k) {
        if(nums.length == 1 && nums[0]!= k){
            return 0;
        }
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
            if(!map.containsKey(sum)){
                map.put(sum, 1);
            }  else {
               map.put(sum, map.get(sum)+1);
            }
            if(map.containsKey(sum-k)){
                count = count + map.get(sum-k);
            }
        }
        return count;
    }
}
