package contest;

public class SpecialArrayI {
    public static void main(String[] args) {
        int[] nums = {2,1,4};

        System.out.println(parityCheck(nums));
    }

    private static boolean parityCheck(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]%2==0 && nums[i+1]%2==0){
                return false;
            }
            if(nums[i]%2!=0&&nums[i+1]%2!=0){
                return false;
            }
        }
        return true;
    }
}
