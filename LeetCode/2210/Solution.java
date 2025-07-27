class Solution {
    public int countHillValley(int[] nums) {
        int i = 1;
        int n = nums.length;
        int no = 0;
        while(i < n - 1){
            if (nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            int l = i - 1;
            while (l >= 0 && nums[l] == nums[i]) {
                l--;
            }
            int r = i + 1;
            while (r < n && nums[r] == nums[i]) {
                r++;
            }
            if (l >= 0 && r < n) {
                if (nums[i] > nums[l] && nums[i] > nums[r]) {
                    no++;
                }
                if (nums[i] < nums[l] && nums[i] < nums[r]) {
                    no++;
                }
            }
            i++;
        }
        return no;
    }
}
