package BitManipulation;

public class SingleNumberI {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2,4,5,6,7,6,7};

        System.out.println(findUnique(nums));
    }

    private static int findUnique(int[] nums) {
        int XOR = 0;

        for (int num : nums){
            XOR = XOR ^ num;
        }
        return XOR;
    }
}
