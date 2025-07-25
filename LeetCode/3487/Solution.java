class Solution {
    public int maxSum(int[] nums) {
        int v[] = new int[101];
        for(int i = 0; i < 101; ++i){
            v[i] = 0;
        }
        boolean ok = false;
        int ma = -200;
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] > ma){
                ma = nums[i];
            }
            if(nums[i] >= 0){
                v[nums[i]]++;
                ok = true;
            }
        }
        if(ok == false){
            return ma;
        }
        else{
            int s = 0;
            for(int i = 0; i < 101; ++i){
                if(v[i] != 0)
                    s+=i;
            }
            return s;
        }
    }
}