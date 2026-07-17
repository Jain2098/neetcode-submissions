class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            var target_num = target-nums[i];

            if (h.containsKey(target_num)){
                return new int[]{h.get(target_num), i};
            }
            h.put(nums[i], i);
        }

        return new int[]{};
    }
}
