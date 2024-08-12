package SlidingWindow;

import java.util.HashMap;

public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
    public static void main(String[] args) {
        String s = "WBWBBBW";

        System.out.println(minimumRecolors(s, 5));
    }

    private static int minimumRecolors(String s, int k) {
        int l=0, r=0, min_op = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>(2);
        map.put('W', 0);
        map.put('B', 0);

        while(r<s.length()){
            map.put(s.charAt(r), map.get(s.charAt(r))+1);
            if((r-l+1)==k){
                min_op = Math.min(min_op, map.get('W'));
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l++;
            }
            r++;
        }
        return min_op;
    }
}
