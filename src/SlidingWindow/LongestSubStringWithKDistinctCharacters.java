package SlidingWindow;
import java.util.HashMap;

/**
 * You are given a string s, having only lowercase characters and an integer k.
 * Return the max possible length of the substring containing at most k distinct characters.
 */

public class LongestSubStringWithKDistinctCharacters {
    public static void main(String[] args) {
        String s = "aaabbccd";

        System.out.println(longestSubstr(s, 2));
    }

    private static int longestSubstr(String s, int k) {
        int l=0, r=0, max_len=0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (r<s.length()){
            if (map.containsKey(s.charAt(r))){ map.put(s.charAt(r), map.get(s.charAt(r))+1); }
            else { map.put(s.charAt(r), 1); }

            if (map.size()>k){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                if (map.get(s.charAt(l)) == 0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
            max_len = Math.max(max_len, r-l+1);
            r++;
        }

        return max_len;
    }
}
