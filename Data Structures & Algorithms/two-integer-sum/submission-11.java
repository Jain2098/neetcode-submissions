class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 3){
            return new int[]{0,1};
        }

        // 2,1,5,4,6    = 9  = 2,3
        // 2  -> 7

        for (int i=0; i<nums.length; i++){
            int f = target-nums[i];

            for (int j=i+1; j<nums.length; j++){
                if (nums[j] == f){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};



        
    }
}
