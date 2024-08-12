package SlidingWindow;

public class FindKBeautyOfANumber {
    public static void main(String[] args) {
        int num = 240;

        System.out.println(divisorSubstrings(num, 2));
    }

    private static int divisorSubstrings(int num, int k) {
        int count = 0, l = 0, r = 0;
        String nums = Integer.toString(num);
        String s = "";
        while(r < nums.length()){
            s = s + (""+nums.charAt(r));
            if((r-l+1) == k){
                int req = Integer.parseInt(String.valueOf(s));
                if(req!=0 && num%req == 0){
                    count++;
                }
                s = s.replaceFirst(""+nums.charAt(l), "");
                l++;
            }
            r++;
        }
        return count;
    }
}
