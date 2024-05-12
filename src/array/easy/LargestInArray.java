package array.easy;

public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {2,1,5,3,4};
        System.out.println("Max : "+bruteForce(arr));
        System.out.println("Max : "+recursive(arr, arr[0], 0));
    }

    static int bruteForce(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int recursive(int[] arr, int max, int n){
        if(n >= arr.length){
            return max;
        }
        if (max < arr[n]) {
            max = arr[n];
        }
        return recursive(arr, max, n+1);
    }
}
