package contest;

import java.util.Arrays;

public class NthValueAfterKSeconds {
    public static void main(String[] args) {
        System.out.println(valueAfterKSeconds(5,1000));
    }

    private static int valueAfterKSeconds(int n, int k) {
        int[] num = new int[n];
        Arrays.fill(num, 1);
        int count = 1;
        for (int i = 0; i < k; i++) {
            while(count < num.length){
                num[count] = num[count]+num[count-1];
                count++;
            }
            count = 1;
        }

        return num[num.length-1];
    }
}
