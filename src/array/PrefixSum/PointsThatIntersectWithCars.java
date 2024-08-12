package array.PrefixSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PointsThatIntersectWithCars {
    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(new ArrayList<>(Arrays.asList(4,4)));
        nums.add(new ArrayList<>(Arrays.asList(9,10)));
        nums.add(new ArrayList<>(Arrays.asList(9,10)));
        nums.add(new ArrayList<>(Arrays.asList(3,8)));

        System.out.println(numberOfPoints(nums));
    }

    private static int numberOfPoints(List<List<Integer>> nums) {
        if(nums.isEmpty()){
            return 0;
        }

        int lo;
        int hi;
        int ans;
        int flag = 0;
        lo = (nums.getFirst()).getFirst();
        hi = (nums.getFirst()).getLast();

        ans = hi-lo+1;

        for (int i = 1; i < nums.size(); i++) {
            if(nums.get(i).getFirst()>=lo || nums.get(i).getLast()<=hi){
                continue;
            }
            if (nums.get(i).getFirst() < lo) {
                ans = ans + (lo - nums.get(i).getFirst());
                lo = nums.get(i).getFirst();
            }
            if (nums.get(i).getLast() > hi && nums.get(i).getFirst() < hi) {
                ans = ans + (nums.get(i).getLast() - hi);
                hi = nums.get(i).getLast();
            } else {
                ans = ans + (nums.get(i).getLast() - nums.get(i).getFirst() + 1);
                if(nums.get(i).getFirst() < lo){
                    lo = nums.get(i).getFirst();
                }
                if(nums.get(i).getLast() > hi){
                    hi = nums.get(i).getLast();
                }
            }
        }

        return ans;
    }
}
