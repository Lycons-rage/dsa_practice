package array.TwoPointer;

public class ContainerWiithMostWater {
    public static void main(String[] args) {
        int[] height = {1,2,4,3};

        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
        int area = 0, current=0;
        int left = 0, right = height.length-1;

        while(left!=right){
            if(height[left] < height[right]){
                current = height[left] * (right-left);
                left++;
            } else if(height[left] > height[right]){
                current = height[right] * (right-left);
                right--;
            } else {
                current = height[right] * (right-left);
                right--;
            }

            if(current > area){
                area = current;
            }
        }
        return area;
    }
}
