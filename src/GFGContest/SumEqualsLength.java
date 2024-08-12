package GFGContest;

public class SumEqualsLength {
    public static void main(String[] args) {
        int[] arr = {2,8,9,-2,3,5,-8,-1,-5};

        System.out.println(longestSubarray(arr.length, arr));
    }

    private static int longestSubarray(int n, int[] arr) {
        int max_len = -1;
        int l = 0, r = 0, sum = 0;

        while(r<n){
            sum = sum+arr[r];
            if(sum == (r-l+1)){
                max_len = Math.max(max_len, (r-l+1));
            }
            while(sum > (r-l+1) && l <= r){
                sum = sum - arr[l];
                l++;
            }
            r++;
        }

        return max_len;
    }
}
