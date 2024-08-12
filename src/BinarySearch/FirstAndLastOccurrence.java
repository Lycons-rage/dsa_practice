package BinarySearch;

import java.util.Arrays;

import static BinarySearch.LowerBound.getLowerBound;
import static BinarySearch.UpperBound.getUpperBound;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] nums = {2,4,6,6,6,6,8,8,8,11,13};

        System.out.println(Arrays.toString(firstAndLast(nums,6)));
    }

    private static int[] firstAndLast(int[] nums, int x) {
        int first = getLowerBound(nums, x);
        int last = getUpperBound(nums, x);

        if(first == nums.length || nums[first]!=x){
            return new int[]{-1,-1};
        }
        return new int[]{first, last-1};
    }
}
