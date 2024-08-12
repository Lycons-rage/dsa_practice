package stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3};

        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }

    private static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] map = new int[nums.length];

        stack.push(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > stack.peek()){
                map[i-1] = nums[i];
                stack.pop();
                stack.push(nums[i]);
            }
            if(nums[i] < stack.peek()){
                int j = i+1;
                while(j!=i){
                    if (nums[i] > stack.peek()){
                        map[i-1] = nums[i];
                        stack.pop();
                        stack.push(nums[i]);
                        break;
                    }
                    j += 1;
                    j %= nums.length;
                }
                map[i-1] = -1;
                stack.push(nums[i]);
            }
            if (i == nums.length-1){
                if(nums[i] == stack.peek()){
                    stack.pop();
                    int j = i+1;
                    while(j!=i){
                        if (nums[i] > stack.peek()){
                            map[i-1] = nums[i];
                            stack.pop();
                            stack.push(nums[i]);
                            break;
                        }
                        j += 1;
                        j %= nums.length;
                    }
                    map[i-1] = -1;
                    stack.push(nums[i]);
                }
            }
        }
        return map;
    }
}
