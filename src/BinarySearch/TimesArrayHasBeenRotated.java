package BinarySearch;

public class TimesArrayHasBeenRotated {
    public static void main(String[] args) {
        int[] nums = {3,4,5,0,1,2};

        System.out.println(rotationIndex(nums));
    }

    private static int rotationIndex(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int ans = Integer.MAX_VALUE;
        int index = 0;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[low] <= nums[high]){
                if(nums[low] < ans){
                    index = low;
                    ans = Math.min(ans, nums[low]);
                }
                break;
            }
            if(nums[low] <= nums[mid]){
                if(nums[low] < ans){
                    index = low;
                    ans = Math.min(ans, nums[low]);
                }
                low = mid + 1;
            } else {
                if(nums[mid] < ans){
                    index = mid;
                    ans = Math.min(ans, nums[mid]);
                }
                high = mid - 1;
            }
        }

        return index;
    }
}
