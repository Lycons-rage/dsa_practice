package contest.Weekly408;

public class FindTheCountOfNumbersWhichAreNotSpecial {
    public static void main(String[] args) {
        System.out.println(nonSpecialCount(1,2));
    }

    private static int nonSpecialCount(int l, int r) {
        int discarded = 0;
        for (int i = l; i <= r ; i++) {
            if(i==1){
                discarded++;
            }
            if(i%2==0 && i/2>2){
                discarded++;
            } else if (Math.sqrt(i) != Math.floor(Math.sqrt(i))) {
                discarded++;
            }
        }

        return discarded;
    }
}
