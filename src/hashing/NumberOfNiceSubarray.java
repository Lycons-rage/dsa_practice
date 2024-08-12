package hashing;

import java.util.HashMap;

public class NumberOfNiceSubarray {
    public static void main(String[] args) {
        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        System.out.println(numberOfSubarrays(nums, 2));
    }

    private static int numberOfSubarrays(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if(sum >= k){
                int req = sum-k;
                if(map.containsKey(req)){
                    count+=1;
                }
            }
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            } else {
                map.put(sum, 1);
            }
        }
        return count;

    }
}
