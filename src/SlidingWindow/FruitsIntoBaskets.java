package SlidingWindow;
import java.util.HashMap;

/**
 * You are given an integer array fruits representing fruits[i] the type of fruit, ith tree produces. You
 * are also given an integer no_of_baskets representing the max number of baskets you can take. But, the
 * catch is that one basket can store only one type of fruit and fruits should be selected in a consecutive manner.
 * Return the maximum number of fruits that can be selected in the given restrictions.
 * Alternative perspective : Return the max length of sub-array having at most "no_of_basket" number of unique numbers.
 */

public class FruitsIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};

        System.out.println(maxFruits(fruits, 2));
    }

    private static int maxFruits(int[] fruits, int no_of_baskets) {
        int max_fruits = 0;
        int l=0, r=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(r<fruits.length){
            if (map.containsKey(fruits[r])) map.put(fruits[r], map.get(fruits[r]) + 1);
            else map.put(fruits[r], 1);

            if (map.size() > no_of_baskets){
                map.put(fruits[l], map.get(fruits[l])-1);
                if(map.get(fruits[l]) == 0){
                    map.remove(fruits[l]);
                }
                l++;
            } else max_fruits = Math.max(max_fruits, r-l+1);

            r++;
        }
        return max_fruits;
    }
}
