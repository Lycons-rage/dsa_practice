package contest;

public class MinNoOfChairs {
    public static void main(String[] args) {
        String s = "ELEELEELLL";

        System.out.println(minimumChairs(s));
    }

    static int minimumChairs(String s) {
        int chairs = 1;
        int occupied = 0;

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == 'E'){
                if(Math.abs(occupied)>=chairs){
                    chairs++;
                }
                occupied--;
            }
            else{
                occupied++;
            }
        }
        return chairs;
    }
}
