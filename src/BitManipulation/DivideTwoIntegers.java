package BitManipulation;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        System.out.println(divideThem(
                -2147483648,-1));
    }

    private static int divideThem(int dividend, int divisor) {
        if(dividend == divisor) return 1;
        boolean sign = true;
        if((dividend >= 0 && divisor < 0) || (dividend < 0 && divisor > 0)) sign = false;

        if(dividend == Integer.MIN_VALUE){
            return sign?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }

        long n = Math.abs(dividend), d = Math.abs(divisor);
        int ans = 0;
        while(n >= d){
            int count = 0;
            while(n >= (d<<(count+1))){
                count++;
            }
            ans += (1<<count);
            n = n - (d*(1<<count));
        }

        if(ans >= Integer.MAX_VALUE){
            if(sign){
                return Integer.MAX_VALUE;
            } return Integer.MIN_VALUE;
        }

        return sign?ans:(-1*ans);
    }
}
