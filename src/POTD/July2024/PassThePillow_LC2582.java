package POTD.July2024;

public class PassThePillow_LC2582 {
    public static void main(String[] args) {
        System.out.println(passThePillow(3,2));
    }

    private static int passThePillow(int n, int time) {
        int current = 1, direction = 0;

        for (int i = 0; i < time; i++) {
            if(current == n){
                direction = -1;
            }
            if(current == 1){
                direction = 1;
            }
            current = current+direction;
        }

        return current;
    }
}
