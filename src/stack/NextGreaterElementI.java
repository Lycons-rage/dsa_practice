package stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public static void main(String[] args) {
        //int[] nums1 = {4,1,2,5};
        //int[] nums2 = {5,1,3,4,2};
        int[] nums1 = {1,3,5,2,4};
        int[] nums2 = {6,5,4,3,2,1,7};

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        map.put(nums2[nums2.length-1], -1);
        stack.push(nums2[nums2.length-1]);

        for (int i = nums2.length-2; i > -1; i--) {
            if(nums2[i] > stack.peek()){
                while(stack.peek() < nums2[i]){
                    stack.pop();
                    if(stack.isEmpty()){
                        map.put(nums2[i], -1);
                        stack.push(nums2[i]);
                        break;
                    }
                }
            }
            if(stack.peek() > nums2[i]) {
                map.put(nums2[i], stack.peek());
                stack.push(nums2[i]);
            }
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}
