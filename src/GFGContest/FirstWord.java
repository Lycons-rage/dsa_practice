package GFGContest;

import java.util.Arrays;

public class FirstWord {
    public static void main(String[] args) {
        String[] dictionary = {"geeksforgeeks","geeks","geek"};

        System.out.println(firstAsPerDictionary(3, dictionary));
    }

    private static String firstAsPerDictionary(int n, String[] dictionary) {
       Arrays.sort(dictionary);
        for (int i = 0; i < dictionary.length-1; i++) {
            if(dictionary[i].equals(dictionary[i+1])){
                return "Invalid";
            }
        }

        return dictionary[0];
    }
}
