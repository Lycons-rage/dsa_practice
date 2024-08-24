package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {0,3,4,7,10,9};

        System.out.println(maxOfMinDistance(stalls, 4));
    }

    private static int maxOfMinDistance(int[] stalls, int cows) {
        if(cows == 2){
            return stalls[stalls.length-1]-stalls[0];
        }
        Arrays.sort(stalls);
        int low = 1, high = (stalls[stalls.length-1] - stalls[0]);

        while (low <= high){
            int mid = low + (high - low)/2;

            if(canWePlace(stalls, mid, cows)){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    private static boolean canWePlace(int[] stalls, int dist, int cows) {
        int count = 1, last = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if(stalls[i] - last >= dist){
                count++;
                last = stalls[i];
            }
            if(count >= cows){
                return true;
            }
        }

        return false;
    }
}
