package POTD.Aug2024;

import java.util.HashMap;

public class KthDistinctStringInAnArray {
    public static void main(String[] args) {
        String[] arr = {"b","a","c","a"};

        System.out.println(kthDistinct(arr, 2));
    }

    private static String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        String ans = "";

        for (String s : arr) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }

        for (String s : arr){
            if(map.get(s) == 1){
                k--;
            }
            if(k==0){
                ans = ""+s;
                break;
            }
        }

        return ans;
    }
}
