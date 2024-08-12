package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};

        System.out.println(commonChars(words));
    }

    private static List<Character> commonChars(String[] words) {
        List<Character> ans = new ArrayList<>();
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < words[0].length(); i++) {
            list.add(words[0].charAt(i));
        }


        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < words.length; j++) {
                if(words[j].contains(""+list.get(i))){
                    ans.add(list.get(i));
                } else {

                    list.remove(list.get(i));
                }
            }
        }
        return ans;
    }
}
