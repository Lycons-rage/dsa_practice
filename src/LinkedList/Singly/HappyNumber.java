package LinkedList.Singly;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(5));
    }

    private static boolean isHappy(int num) {
        int slow = num;
        int fast = num;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while(fast!=slow);

        if(slow == 1){
            return true;
        }
        else{
            return false;
        }
    }

    private static int findSquare(int num) {
        int ans = 0;
        while(num>0){
            int rem = num%10;
            ans += rem*rem;
            num /= 10;
        }
        return ans;
    }

}
