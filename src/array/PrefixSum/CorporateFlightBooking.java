package array.PrefixSum;

import java.util.Arrays;

public class CorporateFlightBooking {
    public static void main(String[] args) {
        int[][] bookings = {
                {1,2,10},
                {2,3,20},
                {2,5,25}
        };
        System.out.println(Arrays.toString(corpFlightBooking(bookings, 5)));
    }

    private static int[] corpFlightBooking(int[][] bookings, int n) {
        int[] total = new int[n];

        for (int i = 0; i < bookings.length; i++) {
            if(bookings[i][0] == bookings[i][1]){
                total[bookings[i][0]-1] = total[bookings[i][0]-1] + bookings[i][2];
            }else if (bookings[i][0]+1 == bookings[i][1]){
                total[bookings[i][0]-1] = total[bookings[i][0]-1] + bookings[i][2];
                total[bookings[i][1]-1] = total[bookings[i][1]-1] + bookings[i][2];
            } else {
                for (int j = bookings[i][0]; j <= bookings[i][1] ; j++) {
                    total[j-1] = total[j-1] + bookings[i][2];
                }
            }
        }
        return total;
    }
}
