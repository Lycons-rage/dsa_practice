package SlidingWindow;

import jdk.jfr.Frequency;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "cabwefgewcwaefgcf";
        String t = "cae";

        System.out.println(getSubstring(s,t));
    }

    private static String getSubstring(String s, String t) {
        int min_len = Integer.MAX_VALUE;
        int l=0, r=0, count=0, start_index=-1;
        HashMap<Character, Integer> map = new HashMap<>();

        // pre-storing the frequencies of characters in t
        for (int i = 0; i < t.length(); i++) {
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i))+1);
            } else {
                map.put(t.charAt(i), 1);
            }
        }

        // traversing over s to check
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r))>0){
                    count++;
                }
                map.put(s.charAt(r), map.get(s.charAt(r))-1);
                while(count == t.length()){
                    min_len = Math.min(min_len, (r-l+1));
                    start_index = l;

                    map.put(s.charAt(l),  map.get(s.charAt(l))+1);
                    if(map.get(s.charAt(l))>0){
                        count--;
                    }
                    l++;
                }
            } else {
                map.put(s.charAt(r), -1);
            }
            r++;
        }

        return (start_index == -1) ? "Not_found" : s.substring(start_index, start_index+min_len);
    }
}
