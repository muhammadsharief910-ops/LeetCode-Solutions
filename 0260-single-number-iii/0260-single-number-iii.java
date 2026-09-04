class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int n : nums){
            xor^=n;
        }
        int bit = 0;
        while((xor & (1<<bit)) == 0) {
            bit++;
        }

        int a = 0;
        int b =0;

        for(int n : nums) {
            if((n & (1<<bit)) == 0) {
                a^=n;
            } else {
                b^=n;
            }
        }

        return new int[]{a,b};
        
    }
}