package array.PrefixSum;

public class ContiguousArray {
    public static void main(String[] args) {
        int[] nums = {0,1,0};
        System.out.println(findMaxLength(nums));
    }

    private static int findMaxLength(int[] nums) {
        if(nums.length<=1){
            return 0;
        }

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1]+nums[i];
        }

        int index = 0, count_0 = 0;
        for (int i = 0; i < prefix.length; i++) {
            if(i == 0 && prefix[i] == 0){
                count_0 += 1;
            }
            if(i!=0 && prefix[i] == prefix[i-1]){
                count_0 += 1;
            }
            if(prefix[i] == count_0){
                index = i;
            }
        }
        return index+1;
    }
}
