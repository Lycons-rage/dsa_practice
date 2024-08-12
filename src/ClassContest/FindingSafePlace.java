package ClassContest;

import java.util.Arrays;
import java.util.Scanner;

public class FindingSafePlace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int k = s.nextInt();
        int len = s.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(safePlace(nums, k));
    }

    static int safePlace(int[] nums, int k) {
        int l = 0, r = l+1, min = Integer.MAX_VALUE, digit = Integer.MAX_VALUE;

        Arrays.sort(nums);
        while(r<nums.length){
            if(nums[r]!=nums[l]+1){
                digit = Math.min(digit, nums[l]+1);
                min = Math.min(min, Math.abs(k-digit));
            }
            l=r;
            r+=1;
        }

        return digit;
    }
}
