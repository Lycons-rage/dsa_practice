package BinarySearch;

public class NthRootOfANumber {
    public static void main(String[] args) {
        System.out.println(nthRoot(3, 343));
    }

    private static int nthRoot(int n, int m) {
        long low = 1, high = m;

        while(low<=high){
            long mid = low + (high-low)/2;

            if( ((long)Math.pow(mid, n)) == m){
                return (int)mid;
            } else if(((long)Math.pow(mid, n)) > m){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return -1;
    }
}
