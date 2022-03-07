class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = -1;
        int j;
        while (++i < nums.length) {
            j = i;
            while(++j < nums.length) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {0};
    }
}
