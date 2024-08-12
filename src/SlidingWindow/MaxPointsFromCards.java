package SlidingWindow;

/**
 * We are given an integer array cards having points of card at each index
 * and an integer k, representing the number of cards we can select.
 * Selection should be made either at front or at back orr a combination of both of them,
 * but combination should be consecutive.
 * Return the maximum possible points are selecting in the above mentioned way.
 */

public class MaxPointsFromCards {
    public static void main(String[] args) {
        int[] cards = {6,2,3,4,7,2,1,7,1};
        System.out.println(maxPoints(cards, 4));
    }

    private static int maxPoints(int[] cards, int k){
        int lsum = 0, rsum = 0, max_sum = 0, right_index = cards.length-1;

        for (int i = 0; i < k; i++) {
            lsum = lsum + cards[i];
        } max_sum = lsum;

        for (int i = k-1; i >=0 ; i--) {
            lsum = lsum - cards[i];
            rsum = rsum + cards[right_index];
            right_index--;
            max_sum = Math.max(max_sum, lsum+rsum);
        }

        return max_sum;
    }
}
