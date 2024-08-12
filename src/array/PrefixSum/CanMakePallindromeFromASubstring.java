package array.PrefixSum;

import java.util.List;

public class CanMakePallindromeFromASubstring {
    public static void main(String[] args) {
        String s = "abcda";
        int[][] queries = {
                {3,3,0},
                {1,2,0},
                {0,3,1},
                {0,3,2},
                {0,4,1}
        };

        System.out.println(canMakePaliQueries(s, queries));
    }

    private static List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        return null;
    }
}
