package SlidingWindow;

public class NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3, threshold=4;

        System.out.println(numOfSubarrays(arr, k, threshold));
    }

    private static int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0, r=0, sum=0, count=0;

        while(r<arr.length){
            sum = sum + arr[r];
            if((r-l+1) == k){
                if(sum/k >= threshold){
                    count+=1;

                }
                sum = sum-arr[l];
                l++;
            }
            r++;
        }
        return count;
    }
}
