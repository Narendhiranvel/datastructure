package Array;
//https://leetcode.com/problems/find-the-duplicate-number/submissions/1885245371/
public class FindTheDuplicateNumber {

    static class Solution {
        public int findDuplicate(int[] nums) {
            int slow = nums[0];
            int fast = nums[0];

            // Phase 1: Detect cycle
            do {
                slow = nums[slow];
                fast = nums[nums[fast]];
            } while (slow != fast);

            // Phase 2: Find entry point of cycle
            slow = nums[0];
            while (slow != fast) {
                slow = nums[slow];
                fast = nums[fast];
            }

            return slow; // duplicate number
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {2,5,9,6,9,3,8,9,7,1}; // sample input

        int duplicate = s.findDuplicate(nums);
        System.out.println("Duplicate number is: " + duplicate);
    }
}

