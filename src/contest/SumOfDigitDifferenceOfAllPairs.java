package contest;

public class SumOfDigitDifferenceOfAllPairs {
    public static void main(String[] args) {
        int[] nums = {58,28,48};

        System.out.println(sumDigitDifferences(nums));
    }

    static int sumDigitDifferences(int[] nums) {
        int difference = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]!=nums[i+1]) {
                for (int j = i+1; j < nums.length; j++) {
                    int a = nums[i];
                    int b = nums[j];
                    while (a != 0 && b != 0) {
                        int dig_a = a % 10;
                        int dig_b = b % 10;
                        if (dig_a != dig_b) {
                            if (dig_a > dig_b) difference = difference + (dig_a - dig_b);
                            else difference = difference + (dig_b - dig_a);
                        }
                        a = a / 10;
                        b = b / 10;
                    }
                }
            }
        }
        return difference;
    }
}
