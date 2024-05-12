package array.easy;

import java.util.Arrays;

public class SortedRotatedArrayOrNot {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,1};

        System.out.println(optimalApproach(arr));
    }

    static boolean optimalApproach(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] > arr[ (i+1) % arr.length ]){
                count++;
            }
            if (count > 1){
                return false;
            }
        }

        return true;
    }
}
