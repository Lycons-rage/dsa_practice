package BinarySearch;

public class SearchInARotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {3,1,2,3,3,3,3};

        System.out.println(containsOrNot(nums, 2));
    }

    private static boolean containsOrNot(int[] nums, int target) {
        int low = 0, high = nums.length-1;

        while(low<=high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target) return true;

            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low += 1;
                high -= 1;
                continue;
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

        return false;
    }
}
