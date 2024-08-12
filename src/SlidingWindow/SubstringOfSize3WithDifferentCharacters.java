package SlidingWindow;

import java.util.HashMap;

public class SubstringOfSize3WithDifferentCharacters {
    public static void main(String[] args) {
        String s = "xyzzaz";

        System.out.println(countGoodSubstring(s));
    }

    private static int countGoodSubstring(String s) {
        int count = 0;
        int l=0, r=0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (r < s.length()) {
            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r))>=l){
                    l = map.get(s.charAt(r)) + 1;
                }
            }
            if((r-l+1) == 3){
                count+=1;
                l=r-1;
            }
            map.put(s.charAt(r), r);
            r++;
        }
        return count;
    }
}
