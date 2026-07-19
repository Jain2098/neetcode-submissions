class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> m = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            var targeted_val = target - nums[i];

            if (m.containsKey(targeted_val)){
                return new int[]{m.get(targeted_val), i};
            }

            m.put(nums[i], i);
        }
        return new int[]{-1,-1};
        
    }
}
