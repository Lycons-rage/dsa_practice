package contest;

import java.util.Arrays;

public class MaximumTotalDamageWithSpellCasting {
    public static void main(String[] args) {
        int[] power = {7,1,6,3};

        System.out.println(maximumTotalDamage(power));
    }

    private static long maximumTotalDamage(int[] power) {
        long[] damage = new long[power.length];
        long cur_damage = 0;
        int n = 0, key;

        while(n < power.length) {
            key = power[n];
            for (int i = n; i < power.length; i++) {
                if (power[i] == key - 1 || power[i] == key + 1 || power[i] == key + 2 || power[i] == key - 2) {
                    continue;
                } else {
                    cur_damage = cur_damage + power[i]; //spell is casted
                    key = power[i];
                }
            }
            damage[n] = cur_damage;
            cur_damage = 0;
            n++;
        }

        long max = 0;
        for (int i = 0; i < damage.length; i++) {
            if(damage[i]>max){
                max = damage[i];
            }
        }

        return max;
    }
}
