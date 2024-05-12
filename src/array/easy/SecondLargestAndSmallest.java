package array.easy;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {2,0,1,0,2,8,1};
        int[] small_out = optimal_small(arr);
        int[] large_out = optimal_large(arr);
        System.out.println("Largest "+large_out[0]);
        System.out.println("Second Largest "+large_out[1]);
        System.out.println("Smallest "+ small_out[0]);
        System.out.println("Second Smallest "+ small_out[1]);
    }

    static int[] optimal_large(int[] arr) {
        int large = arr[0];
        int second_large = arr[0];

        for (int j : arr) {
            if (j > large) {
                large = j;
            }
            if (j > second_large && j < large) {
                second_large = j;
            }
        }

        return new int[]{large, second_large};
    }

    static int[] optimal_small(int[] arr){
        int small = arr[0];
        int second_small = arr[0];

        for (int j : arr) {
            if (j < small) {
                small = j;
            }
            if (j < second_small && j > small) {
                second_small = j;
            }
        }

        return new int[]{small, second_small};
    }
}
