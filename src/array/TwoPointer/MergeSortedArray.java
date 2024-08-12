package array.TwoPointer;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {4,0,0,0,0,0};
        int[] nums2 = {1,2,3,5,6};

        merge(nums1, 1, nums2, 5);

        System.out.println(Arrays.toString(nums1));
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n){
        if(n == 0){
            return;
        }
        if(m == 0 && n > 0){
            for (int i = 0; i < n; i++){
                nums1[i] = nums2[i];
            }
        } else {
            for (int i = 0; i < n; i++) {
                nums1[i+m] = nums2[i];
            }
        }
        Arrays.sort(nums1);
    }
}
