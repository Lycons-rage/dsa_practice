package contest;

public class BallAfterKSeconds {
    public static void main(String[] args) {
        int[] n = {0,1};
        int k = 4;

        System.out.println(numberOfChild(n, k));
    }

    private static int numberOfChild(int[] n, int k) {
        int ball_pos = -1;
        int flag = 0;

        for (int i = 0; i <= k; i++) {
            if(i < n.length){
                ball_pos++;
            }else{
                if(ball_pos == 0){
                    flag = 1;
                } else if (ball_pos == n.length-1) {
                    flag = 0;
                }
                if(flag == 1){
                    ball_pos++;
                }else {
                    ball_pos--;
                }
            }
        }

        return ball_pos;
    }
}
