package SlidingWindow;
import java.util.HashMap;

/**
 * You are given an integer array arr and an integer k.
 * Array has at least k distinct integer in it.
 * Return the number of subarrays with exactly k different integers.
 */

public class SubarrayWithKDifferentIntegers {
    public static void main(String[] args) {
        int[] arr = {2,1,1,1,3,4,3,2};

        System.out.println(subarrayCount(arr, 3));
    }

    private static int subarrayCount(int[] arr, int k) {
        return getCount(arr,k) - getCount(arr,k-1);
    }

    private static int getCount(int[] arr, int k) {
        int l=0, r=0, count=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(r<arr.length){
            if(!map.containsKey(arr[r])){map.put(arr[r], 1);}
            else {map.put(arr[r], map.get(arr[r])+1);}
            while(map.size()>k){
                map.put(arr[l], map.get(arr[l])-1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
            }
            count = count + (r-l+1);
            r++;
        }
        return count;
    }
}
