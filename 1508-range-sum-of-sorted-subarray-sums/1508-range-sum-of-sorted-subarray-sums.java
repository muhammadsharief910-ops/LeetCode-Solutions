class Solution {
    public int rangeSum(int[] nums, int n, int l, int r) {
        int nl = n * (n + 1) / 2;
        int[] arr = new int[nl];
        int c = 0;
        for(int i =0; i<n; i++) {
            int s =0;
            for(int j =i; j<n; j++) {
                s+=nums[j];
                arr[c] = s;
                c++;
            }
        }
        Arrays.sort(arr);
        long ans = 0;
        long MOD = 1_000_000_007L;

        for (int i = l - 1; i < r; i++) {
            ans = (ans + arr[i]) % MOD;
        }

        return (int) ans;

        
    }
}