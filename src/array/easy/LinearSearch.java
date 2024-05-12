package array.easy;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {3,6,2,8,4,7};
        int target = 9;

        if (search(nums,target) == -1){
            System.out.println("NOT FOUND");
        }
        else {
            System.out.println(target + " found at " + search(nums, target) + "th index");
        }
    }

    static int search(int[] nums, int target){
        for (int i = 0; i< nums.length; i++){
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
