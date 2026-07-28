package TwoPointerArray;

//https://leetcode.com/problems/container-with-most-water/

public class ContainerWithMostWater {

    static class Solution {

        public int maxArea(int[] height) {

            int left = 0;
            int right = height.length - 1;

            int maxArea = 0;

            while (left < right) {

                int width = right - left;
                int length = Math.min(height[left], height[right]);

                int area = length * width;

                maxArea = Math.max(maxArea, area);

                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
            return maxArea;
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(s.maxArea(height1)); // 49

        int[] height2 = {1, 1};
        System.out.println(s.maxArea(height2)); // 1

        int[] height3 = {4, 3, 2, 1, 4};
        System.out.println(s.maxArea(height3)); // 16
    }
}

//Time Complexity O(n)
//Space Complexity O(1)
