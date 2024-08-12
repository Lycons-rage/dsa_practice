package array.PrefixSum;

public class MiddleIndexInTheArray {
    public static void main(String[] args) {
        int[] nums = {0,1};

        System.out.println(findMiddleIndex(nums));
    }

    private static int findMiddleIndex(int[] nums) {
        if(nums.length == 1 && nums[0] == 0){
            return 0;
        }

        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                left = left+nums[j];
            }
            for (int j = i+1; j < nums.length; j++) {
                right = right+nums[j];
            }

            if(left == right){
                return i;
            }
            left = 0;
            right = 0;
        }
        return -1;
    }
}
