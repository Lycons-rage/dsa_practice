package contest;

import java.util.Arrays;

public class DaysWithoutMeeting {
    public static void main(String[] args) {
        int days = 5;
        int[][] meeting = {
                {2,4},
                {1,3}
        };

        System.out.println(countDays(days, meeting));
    }

    //this method is ok
    static int countDays(int days, int[][] meeting) {
        int[] schedule = new int[days];
        Arrays.fill(schedule, 0);

        for (int i = 0; i < meeting.length; i++) {
            schedule[meeting[i][0]-1] = 1;
            schedule[meeting[i][1]-1] = 1;
        }

        return countZero(schedule);
    }

    //we got to optimize counting method
    static int countZero(int[] schedule) {
        int count = 0;
        int flag = 0;
        for (int i = 0; i < schedule.length; i++) {
            if(i==0 && schedule[i] == 1){
                flag++;
            }else if(schedule[i] == 1){
                flag++;
                if(schedule[i-1] == 0){
                    flag--;
                }
            }
            if(flag == 0){
                count++;
            }
        }
        return count;
    }
}
