package SlidingWindow;

/**
 * You are given an integer array arr, having only zeros and ones and an integer k.
 * Return the maximum number of consecutive zeros after flipping k zeros to ones.
 * Alternative Perspective : Longest sub-array having at most k zeros.
 */

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};

        System.out.println(maxConsecutiveOnes(arr, 2));
    }

    private static int maxConsecutiveOnes(int[] arr, int k) {
        int max_len = 0;
        int l = 0, r = 0, no_of_zeros = 0;

        while(r< arr.length){
            if(arr[r] == 0){
                no_of_zeros++;
            }
            if(no_of_zeros>k){
                if(arr[l] == 0){
                    no_of_zeros--;
                }
                l++;
            }
            max_len = Math.max(max_len, r-l+1);
            r++;
        }
        return max_len;
    }
}
