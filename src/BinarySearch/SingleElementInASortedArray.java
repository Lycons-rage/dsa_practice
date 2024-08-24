package BinarySearch;

public class SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,4,5,6,6};

        System.out.println(singleElement(nums, nums.length));
    }

    private static int singleElement(int[] nums, int n) {
        if(n==1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];

        int low = 1, high = n-2;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }

            //elimination part
            if((mid%2==1 && nums[mid] == nums[mid-1]) || (mid%2==0 && nums[mid] == nums[mid+1])){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return -1;
    }
}
