package POTD.July2024;

import java.util.Arrays;

public class ThreeConsecutiveOdd_LC1550 {
    public static void main(String[] args) {
        int[] arr = {1,1,1};

        System.out.println(threeConsecutiveOdd(arr));
    }

    private static boolean threeConsecutiveOdd(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 != 0) flag++;
            else flag = 0;

            if (flag == 3) {
                return true;
            }
        }
        return false;
    }
}
