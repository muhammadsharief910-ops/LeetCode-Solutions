class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> ls = new ArrayList<>();
        for(int i = 0; i<nums.length; i++) {
            if(hm.containsKey(nums[i])){
                int x = hm.get(nums[i]);
                hm.put(nums[i], x+1);
            }
            else{
                hm.put(nums[i], 1);
            }
        }

        for (Integer key : hm.keySet()) {
            if(hm.get(key) > nums.length/3){
                ls.add(key);
            }
        }
        return ls;
    }
}