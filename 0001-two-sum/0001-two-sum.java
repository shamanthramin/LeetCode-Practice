class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Outer loop: picks the first element
        for (int i = 0; i < nums.length; i++) {
            // Inner loop: checks all numbers after element i
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; // Return the indices
                }
            }
        }
        return new int[] {}; // Return empty array if no pair found
    }
}