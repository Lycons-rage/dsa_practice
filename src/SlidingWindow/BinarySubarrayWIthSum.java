package SlidingWindow;

/**
 * You are given a binary array and an integer k.
 * Return the number of subarrays possible where sum of elements is equal to k.
 */

public class BinarySubarrayWIthSum {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0};

        System.out.println(subarrayCount(arr, 2));
    }

    private static int subarrayCount(int[] arr, int k) {
        return getCount(arr, k) - getCount(arr, k-1);
    }

    private static int getCount(int[] arr, int k) {
        if(k<0){
            return 0;
        }
        int l=0,r=0, count=0, sum=0;

        while(r<arr.length){
            sum = sum + arr[r];
            while (sum>k){
                sum = sum - arr[l];
                l++;
            }
            count = count + (r-l+1);
            r++;
        }

        return count;
    }
}
