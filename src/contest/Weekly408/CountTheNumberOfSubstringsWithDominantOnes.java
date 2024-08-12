package contest.Weekly408;

import java.util.HashMap;

public class CountTheNumberOfSubstringsWithDominantOnes {
    public static void main(String[] args) {
        String s = "101101";

        System.out.println(numberOfSubstrings(s));
    }

    private static int numberOfSubstrings(String s) {
        int count = 0;
        int l=0, r=0;

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('0', 0);
        map.put('1', 0);

        while(r<s.length()){
            map.put(s.charAt(r), map.get(s.charAt(r))+1);
            if(map.get('1')>0){
                while(Math.pow(map.get('0'),2)>map.get('1')){
                    map.put(s.charAt(l), map.get(s.charAt(l))-1);
                    l++;
                }
                count+=(r-l+1);
            }
            r++;
        }

        return count;
    }
}
