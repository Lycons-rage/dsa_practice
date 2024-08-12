package POTD.July2024;

public class WinnerOfTheCircularGame {
    public static void main(String[] args) {
        System.out.println(findTheWinner(6,5));
    }

    private static int findTheWinner(int n, int k) {
        if(k==1){
            return n;
        }

        int p1 = 0;
        int p2 = p1+k-1;
        int size = n;
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = i+1;
        }

        while(size!=1){
            nums[p2] = -1;
            size-=1;
            p1 = (p1+1)%nums.length;
            p2 = (p1+k)%nums.length;
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != -1){
                return nums[i];
            }
        }

        return 0;
    }
}
