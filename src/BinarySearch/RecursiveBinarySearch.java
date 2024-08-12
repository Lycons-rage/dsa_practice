package BinarySearch;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] nums = {3,4,6,7,8,10,12,16,17};

        System.out.println(getElement(nums, 70));
    }

    private static int getElement(int[] nums, int target) {
        return recursiveBinary(nums, 0, nums.length-1, target);
    }

    private static int recursiveBinary(int[] nums, int low, int high, int target) {
        if(low > high) return -1;
        int mid = low + (high-low)/2;
        if(nums[mid] == target) return mid;
        else if(nums[mid]>target) return recursiveBinary(nums, low, mid-1, target);
        return recursiveBinary(nums, mid+1, high, target);
    }
}
