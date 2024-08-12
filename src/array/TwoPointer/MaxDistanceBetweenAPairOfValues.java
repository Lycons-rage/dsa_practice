package array.TwoPointer;

public class MaxDistanceBetweenAPairOfValues {
    public static void main(String[] args) {
        int[] nums1 = {9819,9508,7398,7347,6337,5756,5493,5446,5123,3215,1597,774,368,313};
        int[] nums2 = {9933,9813,9770,9697,9514,9490,9441,9439,8939,8754,8665,8560};

        System.out.println(maxDistance(nums1,nums2));
    }

    private static int maxDistance(int[] nums1, int[] nums2) {
        int maxDistance = 0;
        // we forgot that given arrays are always in descending order
        for (int i = 0; i < nums1.length; i++) {
            int j = binarySearch(i, nums1[i], nums2);

            if(j!=-1){
                maxDistance = Math.max(maxDistance, j-i);
            }
        }
        return maxDistance;
    }

    private static int binarySearch(int i, int target, int[] nums2) {
        int ans = -1;
        int start = i, end = nums2.length-1;

        while(start <= end){
            int mid = start + ((end-start)/2);

            if(nums2[mid] < target){
                end = mid-1;
            } else {
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }
}
