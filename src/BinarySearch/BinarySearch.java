package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {3,4,6,7,8,10,12,16,17};

        System.out.println(searchElement(nums, 12));
    }

    private static int searchElement(int[] nums, int target) {
        int low = 0, high = nums.length-1;

        while(low<=high){
            int mid = low + ((high-low)/2);
            if(nums[mid] == target){
                return mid;
            }
             else if(nums[mid] > target){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
