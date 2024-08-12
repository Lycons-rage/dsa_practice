package SlidingWindow;
import java.util.HashMap;

/**
 * You are given a string s, which can have both lowercase and uppercase characters.
 * s.length greater than 0. Return the maximum possible length of the substring having no repeating characters.
 */

public class LongestSubstringWithoutAnyRrepeatingCharacters {
    public static void main(String[] args) {
        String s = "cadbzabcd";

        System.out.println(longestSubstr(s));
    }

    private static int longestSubstr(String s) {
        int max_len = 0;
        int l=0, r=0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (r < s.length()) {
            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r))>=l){
                    l = map.get(s.charAt(r)) + 1;
                }
            }
            max_len = Math.max(r-l+1, max_len);
            map.put(s.charAt(r), r);
            r++;
        }
        return max_len;
    }
}
