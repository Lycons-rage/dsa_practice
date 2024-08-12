package BinarySearch;

public class SearchInARotatedSortedArrayI {
    public static void main(String[] args) {
        int[] nums = {7,8,9,1,2,3,4,5,6};

        System.out.println(searchInRotated(nums, 10));
    }

    private static int searchInRotated(int[] nums, int target) {
        int low = 0, high = nums.length-1;

        while (low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                return mid;
            }
            // checking for left sorted
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && nums[mid] >= target){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if(nums[high] >= target && nums[mid] <= target){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
