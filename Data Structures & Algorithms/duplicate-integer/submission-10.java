class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> a = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if (a.containsKey(nums[i])){
                return true;
            }
            a.put(nums[i], 1);
        }
        return false;
    }
}