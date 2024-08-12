package SlidingWindow;

public class GrumpyBookstoreOwner {
    public static void main(String[] args) {
        int[] customers= {1};
        int[] grumpy =   {0};

        System.out.println(maxSatisfied(customers, grumpy, 1));
    }

    private static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int max_window = 0;
        int l=0, r=0, window=0, satisfied=0;

        while (r<customers.length) {
            if(grumpy[r] == 1){
                window += customers[r];
            } else {
                satisfied += customers[r];
            }
            max_window = Math.max(max_window, window);
            if((r-l+1) == minutes){
                if(grumpy[l] == 1){
                    window -= customers[l];
                }
                l++;
            }
            r++;
        }

        return max_window +satisfied;
    }
}
