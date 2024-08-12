package ClassContest;

public class SortingTheNumber {
    public static void main(String[] args) {
//        int[] nums = {11, 12, 7, 9, 19, 22, 5, 9};
//
//        System.out.println(sortingTool(nums));
    }

//    private static int sortingTool(int[] nums) {
//        boolean first = isSorted(nums, 0, nums.length/2);
//        boolean second = isSorted(nums, nums.length/2+1, nums.length-1);
//        int l=0, r=0;
//        if(first == false && second == false){
//            for (int i = 0; i < nums.length/2; i++) {
//
//            }
//        }
//    }

    private static boolean isSorted(int[] nums, int start, int end) {
        for (int i = start; i < end ; i++) {
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
}
