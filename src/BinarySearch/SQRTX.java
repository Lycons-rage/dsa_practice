package BinarySearch;

public class SQRTX {
    public static void main(String[] args) {
        System.out.println(squareRoot(169));
    }

    private static int squareRoot(int num) {
        int low = 1, high = num, ans = 0;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(mid * mid <= num){
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
