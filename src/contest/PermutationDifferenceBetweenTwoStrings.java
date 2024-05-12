package contest;

public class PermutationDifferenceBetweenTwoStrings {
    public static void main(String[] args) {
        String s = "abcde";
        String t = "edbac";

        int difference = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i)){
                continue;
            }
            else{
                int index_in_t = find_index(s.charAt(i), s, t);
                if (index_in_t-i < 0){
                    difference = difference + (i - index_in_t);
                }
                else{
                    difference = difference + (index_in_t - i);
                }
            }
        }

        System.out.println(difference);
    }

    static int find_index(char target, String s, String t){
        // character finding loop
        for (int i = 0; i < s.length(); i++) {
            if(t.charAt(i) == target){
                return i;
            }
        }
        return 0;
    }
}
