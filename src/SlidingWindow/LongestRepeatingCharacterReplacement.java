package SlidingWindow;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * You are given a String s, having only uppercase characters, and an integer k,
 * representing the max number of replacements to be done. We can replace k number of uppercase
 * characters with any other uppercase character.
 * Return the max possible length of substring after k replacement such that all the characters
 * in the substring are same.
 */

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";

        System.out.println(longestSubstr(s, 3));
    }

    private static int longestSubstr(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l=0, r=0, max_len=0;

        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                map.put(s.charAt(r), map.get(s.charAt(r))+1);
            } else {
                map.put(s.charAt(r), 1);
            }
            if( (r-l+1)- Collections.max(map.values()) > k ){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l++;
            } else {
                max_len = Math.max(max_len, (r-l+1));
            }
            r++;
        }

        return max_len;
    }
}
