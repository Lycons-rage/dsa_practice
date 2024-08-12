package array.TwoPointer;

import java.util.Arrays;

public class RemoveDuplicatesFromASortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};

        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int p1 = 0;
        int p2 = 1;
        int count = 1;

        while(p2<nums.length){
            if(nums[p1]!=nums[p2]){
                p1 = p2;
                nums[count] = nums[p1];
                count+=1;
            }
            p2+=1;
        }

        return count;
    }
}
