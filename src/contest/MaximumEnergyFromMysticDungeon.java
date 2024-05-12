package contest;

public class MaximumEnergyFromMysticDungeon {
    public static void main(String[] args) {
        int[] energy = {5,2,-10,-5,1};
        int k = 3;

        System.out.println(max_energy(energy, k));
    }


    //solve it using recursion
    static int max_energy(int[] energy, int k) {
        int absorbed = Integer.MIN_VALUE, temp = 0;
        int threshold = 0, count = 0;
        while (count < energy.length) {
            threshold = count;
            temp = temp + energy[threshold];
            threshold = threshold+k;

            if(temp > absorbed){
                absorbed = temp;
            }
            temp = 0;
            if(threshold > energy.length){
                threshold = count;
            }
            count++;
        }

        return absorbed;
    }
}
