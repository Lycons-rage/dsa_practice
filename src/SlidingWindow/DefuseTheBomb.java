package SlidingWindow;

import java.util.Arrays;

public class DefuseTheBomb {
    public static void main(String[] args) {
        int[] code = {5,7,1,4};

        System.out.println(Arrays.toString(drcrypt(code, 3)));
    }

    private static int[] drcrypt(int[] code, int k) {
        if(k==0){
            return new int[code.length];
        }
        int[] ans = new int[code.length];
        int sum = 0;

        for (int i = 0; i < code.length; i++) {
            for (int j = 1; j <= Math.abs(k); j++) {
                if(k>0){
                    sum = sum + code[(i + j) % code.length];
                }
                if (k < 0) {
                    int index = (i-j)%code.length;
                    if(index<0){
                        index = code.length+index;
                    }
                    sum = sum + code[index];
                }
            }
            ans[i] = sum;
            sum=0;
        }
        return ans;
    }
}
