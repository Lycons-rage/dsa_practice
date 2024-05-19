package contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SpecialArrayII {
    public static void main(String[] args) {
        int[] nums = {9,10,6,2};
        int[][] queries = {
                {2,3}
        };

        System.out.println(Arrays.toString(parityCheckQueryBased(nums,queries)));
    }

    static boolean[] parityCheckQueryBased(int[] nums, int[][] queries) {
        boolean[] out = new boolean[queries.length];
        Arrays.fill(out, Boolean.TRUE);
        int j = 0;
        ArrayList<Boolean> list = new ArrayList<>();

        //associated values in the map
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]%2==0 && nums[i+1]%2==0){
                list.add(false);
            }else if(nums[i]%2!=0&&nums[i+1]%2!=0){
                list.add(false);
            } else{
                list.add(true);
            }
        }

        for (int i = 0; i < queries.length; i++) {
            for (j = queries[i][0]; j < queries[i][1]; j++) {
                if(!list.get(j)){
                    out[i] = false;
                    break;
                }
            }
            if(j-1 == queries[i][1]){
                out[i] = true;
            }
        }
        return out;
    }
}
