class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for(int i =0; i<nums.length;i++) {
            if(nums[i] > 0 && nums[i] <n && nums[i] != nums[nums[i] - 1]) {
                int ci = nums[i] - 1;

                int temp = nums[i];
                nums[i] = nums[ci];
                nums[ci] = temp;
                i--;
            }
        }
        for(int i =0; i<n; i++) {
            if(nums[i] != i+1) {
                return i+1;
            }
        }
        return n+1;
        
        
    }
}