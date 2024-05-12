package array.easy;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {-3,-1,0,0,0,3,3};

        System.out.println(Arrays.toString(treeMap(nums)));
        System.out.println(Arrays.toString(twoPointer(nums)));
    }

    static int[] treeMap(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int j : nums){
            if (!map.containsKey(j)){
                map.put(j, 0);
            }
            else {
                map.put(j, map.get(j)+1);
            }
        }
        int k = map.size(), index = 0;
        for (int key : map.keySet()){
            nums[index] = key;
            index++;
        }
        return nums;
    }

    static int[] twoPointer(int[] nums){
        int m = 0, n;

        for (n = m+1; n < nums.length; n++) {
            if (nums[n] != nums[m]){
                nums[++m] = nums[n];
                n = m;
            }
        }

        return nums;
    }
}
