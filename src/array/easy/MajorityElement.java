package array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(nums));
        System.out.println(majorityElementInON(nums));
    }

    private static int majorityElementInON(int[] nums) {
        Arrays.sort(nums);

        int count = 0, freq = 0, num = nums[0];

        for (int i = 0; i <nums.length; i++) {
            if(nums[i] != num){
                if(count > freq){
                    num = nums[i-1];
                    freq = count;
                    count = 0;
                }
            }
            count++;
        }

        if(count > freq){
            return nums[nums.length-1];
        }
        return num;
    }

    private static int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        int max_freq = 0, key = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if (max_freq < e.getValue()){
                key = e.getKey();
                max_freq = e.getValue();
            }
        }

        return key;
    }
}
