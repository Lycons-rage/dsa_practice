package BitManipulation;

public class XORInRange {
    public static void main(String[] args) {
        System.out.println(xorInRange(4,8));
    }

    private static int xorInRange(int l, int r) {
        return findXOR(l-1)^findXOR(r);
    }

    private static int findXOR(int n) {
        if(n%4==0) return n;
        if(n%4==1) return 1;
        if(n%4==2) return n+1;
        return 0;
    }
}
