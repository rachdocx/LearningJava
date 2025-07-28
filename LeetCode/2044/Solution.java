class Solution {
    int maxOr = 0;
    int count = 0;
    public int countMaxOrSubsets(int[] nums) {
        for(int num : nums)
            maxOr = maxOr | num;
        dfs(nums,0,0);
        return count;
    }

    private void dfs(int[] nums, int index, int curOr){
        if(index == nums.length){
            if(curOr == maxOr)
                count++;
            return;
        }
        dfs(nums, index +1, curOr);
        dfs(nums, index + 1, curOr | nums[index]);
    }
}