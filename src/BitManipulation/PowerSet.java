package BitManipulation;
import java.util.*;

  /**
 * you are given an integer array nums. Return all the subsets of nums.
 */

public class PowerSet {
    public static void main(String[] args) {
        int[] nums = {1,2,2};

        System.out.println(getAllSubsets(nums));
    }

    private static List<List<Integer>> getAllSubsets(int[] nums) {
        int no_of_subsets = 1 << nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        for (int num=0; num<no_of_subsets; num++){
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if ((num & (1<<i)) > 0){
                    list.add(nums[i]);
                }
            }
            if(!ans.contains(list)) {
                ans.add(list);
            }
        }

        return ans;
    }
}
